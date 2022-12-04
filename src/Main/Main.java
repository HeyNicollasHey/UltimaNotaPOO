package Main;
import Model.*;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bolsa bolsa = new Bolsa();

        Scanner teclado = new Scanner(System.in);
        bolsa.put(1, "Maca Dourada (+80 HP)");
        bolsa.put(2, "Porcao de forca (+70 ATK)");

        System.out.println(bolsa);
        System.out.println(bolsa.utilizarItem(1));


        System.out.println("=========================");
        System.out.println("BEM VINDO A SUA NOVA AVENTURA");
        System.out.println("=========================");

        Random aleatorio = new Random();
        Espada espada = new Espada();
        Escudo escudo = new Escudo();
        Heroi h1 = new Heroi("");
        Vilao v1 = new Vilao("Elon Musk",1000);
        int opcao = 0;

        System.out.println("1-Cadastrar seu Heroi " +
                "\n2-Sair");
        System.out.print("=>");
        opcao=teclado.nextInt();

        while(opcao>2){
            System.out.println("Digite uma opcao valida");
            opcao = teclado.nextInt();
        }
        if(opcao==1){

            System.out.println("Bem vindo a criacao do seu personagem "+
                        "Seu personagem vem por padrao com 100 de vida e 100 no nivel de forca");

            System.out.print("Digite o nome do seu Heroi=> ");
            Scanner n1 = new Scanner(System.in);
            h1.setNome(n1.nextLine());
            System.out.println("Escolha uma arma para comecar: \n" + "1 - Espada do Twitter\n" +
                    "2 - Escudo Comunista");
            opcao = teclado.nextInt();
            if(opcao==1){
                System.out.println("Voce escolheu a Espada do Twitter");
                h1.setFerramenta(new Espada());

            }
            else if(opcao==2){
                System.out.println("Voce escolheu o Escudo Comunista");
                h1.setFerramenta(new Escudo());
            }

        }
        else if(opcao==2){
            System.out.println("Obrigado e ate logo!");
        }

        System.out.println("1 - Lutar\n2 - Sair");
        System.out.print("=>");
        opcao=teclado.nextInt();

        if(opcao==1){
            while(h1.getNivelDeVida()>0 || v1.getVida()>0){
                System.out.println("Escolha:\n" + "1 - Atacar\n" + "2 - Usar Item\n" + "3 - Trocar de Arma\n"
                + "4 - Status");
                opcao = teclado.nextInt();
                while(opcao>4){
                    System.out.println("Digite uma opcao valida:");
                    opcao = teclado.nextInt();
                }
                if(opcao==1){
                    try{
                        Thread.sleep(2000);
                    }catch (Exception erro){}
                    System.out.println("Voce atacou o " + v1.getNome());
                    h1.usarFerramente();
                    v1.setVida((int) (v1.getVida() - h1.getNivelDeForca()));
                    try{
                        Thread.sleep(2000);
                    }catch (Exception erro){}
                    System.out.println(v1.getNome() + " HP: " + v1.getVida());
                    try{
                        Thread.sleep(2000);
                    }catch (Exception erro){}
                    System.out.println(v1.getNome() + " atacou voce");
                    int ataqueVilao = aleatorio.nextInt(25,30);
                    h1.setNivelDeVida(h1.getNivelDeVida()-ataqueVilao);
                    try{
                        Thread.sleep(2000);
                    }catch (Exception erro){}
                    System.out.println(h1.getNome() + " HP: " + h1.getNivelDeVida());
                    if (v1.getVida()<=0){
                        try{
                            Thread.sleep(2000);
                        }catch (Exception erro){}
                        System.out.println("Parabens! Voce venceu e derrotou o monstro do capitalismo");
                        break;
                    }
                    else if(h1.getNivelDeVida()<=0){
                        try{
                            Thread.sleep(2000);
                        }catch (Exception erro){}
                        System.out.println("Que pena! Voce perdeu, o capitalismo ira perdurar\n" +
                                "ate o nascimento de um novo heroi");
                        break;
                    }
                }
                else if(opcao==2){
                    System.out.println("Itens:\n" + "1 - Maca Dourada (+80 HP)\n" +
                            "2 - Porcao de forca (+70 ATK)");
                    opcao = teclado.nextInt();
                    while(opcao>2){
                        System.out.println("Digite uma opcao valida:");
                        opcao = teclado.nextInt();
                    }
                    if(opcao==1){
                        System.out.println("Voce usou a porcao de vida, +80 de HP");
                        h1.setNivelDeVida(h1.getNivelDeVida()+80);
                        bolsa.remove(1);
                    }
                    else if(opcao==2){
                        System.out.println("Voce aumentou o seu ataque, +70 de ATK");
                        h1.setNivelDeForca(h1.getNivelDeForca()+70);
                        bolsa.remove(2);
                    }
                }
                else if(opcao==3){
                    System.out.println("Escolha sua arma:\n" + "1 - Espada do Twitter\n" +
                            "2 - Escudo Comunista");
                    opcao = teclado.nextInt();
                    while(opcao>3){
                        System.out.println("Digite uma opcao valida:");
                        opcao = teclado.nextInt();
                    }
                    if(opcao==1){
                        System.out.println("Voce escolheu a Espada do Twitter");
                        h1.setFerramenta(new Espada());

                    }
                    else if(opcao==2){
                        System.out.println("Voce escolheu o Escudo Comunista");
                        h1.setFerramenta(new Escudo());
                    }
                }else if (opcao==4){
                    System.out.println("Status do Personagem: \n" + "HP: " + h1.getNivelDeVida() +
                            "\nATK: " + h1.getNivelDeForca());
                }
            }
        }
        else if(opcao==2){
            System.out.println("Obrigado e ate logo!");
        }
    }
}

