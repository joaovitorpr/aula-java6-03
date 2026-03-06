package br.com.fiap.bean;

public class Arcondicionado {
    //atributos
    public int temperatura;
    public String modo;
    //métodos
    public void aumentarTemperatura() {
        temperatura++;
    }
    public void diminuirTemperatura() {
        temperatura--;
    }
    public void trocarModo(String novoModo) {
        modo = novoModo;
    }
}
