package com.company;
public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println();

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");

    }

    @Override
    public void reproduz() {
        System.out.println("amamentam");

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
