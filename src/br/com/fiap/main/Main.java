package br.com.fiap.main;

import br.com.fiap.bean.Arcondicionado;
import br.com.fiap.bean.Televisor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Televisor tv =  new Televisor();
        tv.canal = 5;
        tv.volume = 5;
        tv.trocarCanal(4);
        tv.diminuirVolume();
        tv.diminuirVolume();
        System.out.printf("Volume: %d\nCanal: %d\n", tv.volume, tv.canal);

        // teste mocado do arcondicionado
        Arcondicionado ar = new Arcondicionado();
        ar.modo = "ventilar";
        ar.temperatura = 28;
        ar.modo = "resfriar";
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        String msg = String.format("Modo: %s\nTemperatura: %d°C", ar.modo, ar.temperatura);
        System.out.println(msg);
        //JOptionPane.showMessageDialog(null, msg);

    }
}
