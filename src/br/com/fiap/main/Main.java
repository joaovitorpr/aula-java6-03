package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor tv =  new Televisor();
        tv.canal = 5;
        tv.volume = 5;
        tv.trocarCanal(4);
        tv.diminuirVolume();
        tv.diminuirVolume();

    }
}
