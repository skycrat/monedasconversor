package com.alurachallenge.monedasconversor.principal;

import com.alurachallenge.monedasconversor.modelos.ConsultaAPI;
import com.alurachallenge.monedasconversor.modelos.DatosValorMonedas;
import com.alurachallenge.monedasconversor.modelos.Menu;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

import java.util.Objects;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Menu monedasConversor = new Menu();
        monedasConversor.correPrograma();
    }
}
