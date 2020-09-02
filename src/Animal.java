package com.company;
public abstract class Animal {
    //atributos de animal
    protected int idade;;
    protected int tamanho;
    //métodos de animal
    public abstract void locomover ();
    public abstract void emitirSom();
    public abstract void reproduz();

    public int getIdade() {
        return idade;
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
