package Model;

import Interfaces.IFerramenta;

public class Escudo implements IFerramenta {

    @Override
    public void usarFerramente() {
        System.out.println("Investiu com o escudo no capitalista safado");
    }
}
