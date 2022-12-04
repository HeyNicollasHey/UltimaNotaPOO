package Model;

import Interfaces.IFerramenta;

public class Heroi implements IFerramenta {

    IFerramenta ferramenta;
    String nome;
    float nivelDeForca;
    float nivelDeVida;

    public Heroi(String nome) {
        this.ferramenta = null;
        this.nome = nome;
        this.nivelDeForca = 100;
        this.nivelDeVida = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNivelDeForca() {
        return nivelDeForca;
    }

    public void setNivelDeForca(float nivelDeForca) {
        this.nivelDeForca = nivelDeForca;
    }

    public float getNivelDeVida() {
        return nivelDeVida;
    }

    public void setNivelDeVida(float nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }

    public IFerramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(IFerramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    @Override
    public void usarFerramente() {
        this.ferramenta.usarFerramente();
    }
}
