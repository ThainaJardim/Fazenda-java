package com.company;
public class Aves extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voar");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de aves");

    }
    @Override
    public void reproduz() {
        System.out.println("Bota ovo");

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}