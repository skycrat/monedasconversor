package com.alurachallenge.monedasconversor.modelos;

import com.google.gson.Gson;

import java.util.Scanner;

public class Menu {
    int opcion;
    String valorBase;
    String valorObjetivo;
    String mensaje = """
            ***************************************************************
            Sea bienvenido/a al Conversor de Moneda =)
                         
            1) Dólar ==> Peso argentino
            2) Peso argentino ==> Dólar
            3) Dólar ==> Real brasileño
            4) Real brasileño ==> Dólar
            5) Dólar ==> Peso colombiano
            6) Peso colombiano ==> Dólar
            7) Salir
            Elija una opción valida:
            ****************************************************************
            """;

    ConsultaAPI consulta = new ConsultaAPI();
    Scanner lectura = new Scanner(System.in);
    Gson gson = new Gson();


    public void correPrograma(){
//        muestraMenu();
//        opcion = lectura.nextInt();

        while (opcion != 4) {
            muestraMenu();
            opcion = lectura.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor que desea convertir");
                    double valor = lectura.nextDouble();
                    valorBase = "USD";
                    valorObjetivo = "ARS";
                    var datosApi = consulta.obtieneData("https://v6.exchangerate-api.com/v6/ed12da4067667713f1084a72/pair/"
                            + valorBase + "/" + valorObjetivo);

                    DatosValorMonedas data = gson.fromJson(datosApi, DatosValorMonedas.class);

                    double valorFinal = valor * data.conversionRate();
                    System.out.println("El valor " + valor + " [" + valorBase + "] " + "corresponde al valor final de ==>" +
                            " " + valorFinal + " [" + valorObjetivo + "]");
                    break;

                case 2:
                    System.out.println("otro resultadao");

                case 3:
                    System.out.println("solos res");
            }
            System.out.println("Finalizando la aplicación");
        }
    }


    public void muestraMenu(){
        System.out.println(this.mensaje);
    }
}
