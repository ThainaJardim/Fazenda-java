package com.company;

public class Main {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Aves a = new Aves();
        Pato p = new Pato();
        Galinha g = new Galinha ();
        Morcego o = new Morcego();
        Vaca v = new Vaca();

        p.setIdade(2);
        p.setTamanho(2);
        p.emitirSom();
        g.setIdade(2);
        g.setTamanho(2);
        o.setIdade(2);
        o.setTamanho(2);
        v.setIdade(2);
        v.setTamanho(2);



    }
}
