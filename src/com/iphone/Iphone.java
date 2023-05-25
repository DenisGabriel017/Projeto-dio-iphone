
package com.iphone;

import com.iphone.aparelhoTelefonico.AparelhoTelefonico;
import com.iphone.navegadorNaInternet.NavegadorNaInternet;
import com.iphone.reprodutorMusical.ReprodutorMusical;

import java.security.AllPermission;

public class Iphone{
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        NavegadorNaInternet navegador = new NavegadorNaInternet();
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();


    }
}



