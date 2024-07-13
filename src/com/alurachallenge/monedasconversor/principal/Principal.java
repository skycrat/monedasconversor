package com.alurachallenge.monedasconversor.principal;

import com.alurachallenge.monedasconversor.modelos.ConsultaAPI;

public class Principal {

    public static void main(String[] args) {
        ConsultaAPI consulta = new ConsultaAPI();
        var datosApi = consulta.obtieneData("https://v6.exchangerate-api.com/v6/ed12da4067667713f1084a72/latest/USD");
        System.out.println(datosApi);
        // convertiendo datos json a java object

    }



}
