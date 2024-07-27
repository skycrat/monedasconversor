package com.alurachallenge.monedasconversor.modelos;

import com.google.gson.Gson;

import java.util.Scanner;

public class Menu {
    private int opcion;
    private String valorBase;
    private String valorObjetivo;
    private float valor;
    private float valorFinal;
    private String datosApi;
    private String mensaje = """
            
            ***************************************************************
            Sea bienvenido/a al Conversor de Moneda =)
                         
            1) Dólar ==> Peso argentino
            2) Peso argentino ==> Dólar
            3) Dólar ==> Real brasileño
            4) Real brasileño ==> Dólar
            5) Dólar ==> Peso chileno
            6) Peso chileno ==> Dólar
            7) Salir
            Elija una opción valida:
            ****************************************************************
            """;

    ConsultaAPI consulta = new ConsultaAPI();
    Scanner lectura = new Scanner(System.in);
    Gson gson = new Gson();


    public void correPrograma(){
        
        while (opcion != 7) {
            muestraMenu();
            opcion = lectura.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor que desea convertir");
                    valor = lectura.nextFloat();
                    valorBase = "USD";
                    valorObjetivo = "ARS";
                    datosApi = consulta.obtieneData("https://v6.exchangerate-api.com/v6/ed12da4067667713f1084a72/pair/"
                            + valorBase + "/" + valorObjetivo);

                    DatosValorMonedas data = gson.fromJson(datosApi, DatosValorMonedas.class);

                    valorFinal = valor * data.conversionRate();
                    System.out.println("El valor " + valor + " [" + valorBase + "] " + "corresponde al valor final de ==>" +
                            " " + valorFinal + " [" + valorObjetivo + "]");
                    break;

                case 2:
                    System.out.println("Ingrese el valor que desea convertir");
                    valor = lectura.nextFloat();
                    valorBase = "ARS";
                    valorObjetivo = "USD";
                    datosApi = consulta.obtieneData("https://v6.exchangerate-api.com/v6/ed12da4067667713f1084a72/pair/"
                            + valorBase + "/" + valorObjetivo);

                    data = gson.fromJson(datosApi, DatosValorMonedas.class);

                    valorFinal = valor * data.conversionRate();
                    System.out.println("El valor " + valor + " [" + valorBase + "] " + "corresponde al valor final de ==>" +
                            " " + valorFinal + " [" + valorObjetivo + "]");
                    break;

                case 3:
                    System.out.println("Ingrese el valor que desea convertir");
                    valor = lectura.nextFloat();
                    valorBase = "USD";
                    valorObjetivo = "BRL";
                    datosApi = consulta.obtieneData("https://v6.exchangerate-api.com/v6/ed12da4067667713f1084a72/pair/"
                            + valorBase + "/" + valorObjetivo);

                    data = gson.fromJson(datosApi, DatosValorMonedas.class);

                    valorFinal = valor * data.conversionRate();
                    System.out.println("El valor " + valor + " [" + valorBase + "] " + "corresponde al valor final de ==>" +
                            " " + valorFinal + " [" + valorObjetivo + "]");
                    break;

                case 4:
                    System.out.println("Ingrese el valor que desea convertir");
                    valor = lectura.nextFloat();
                    valorBase = "BRL";
                    valorObjetivo = "USD";
                    datosApi = consulta.obtieneData("https://v6.exchangerate-api.com/v6/ed12da4067667713f1084a72/pair/"
                            + valorBase + "/" + valorObjetivo);

                    data = gson.fromJson(datosApi, DatosValorMonedas.class);

                    valorFinal = valor * data.conversionRate();
                    System.out.println("El valor " + valor + " [" + valorBase + "] " + "corresponde al valor final de ==>" +
                            " " + valorFinal + " [" + valorObjetivo + "]");
                    break;

                case 5:
                    System.out.println("Ingrese el valor que desea convertir");
                    valor = lectura.nextFloat();
                    valorBase = "USD";
                    valorObjetivo = "CLP";
                    datosApi = consulta.obtieneData("https://v6.exchangerate-api.com/v6/ed12da4067667713f1084a72/pair/"
                            + valorBase + "/" + valorObjetivo);

                    data = gson.fromJson(datosApi, DatosValorMonedas.class);

                    valorFinal = valor * data.conversionRate();
                    System.out.println("El valor " + valor + " [" + valorBase + "] " + "corresponde al valor final de ==>" +
                            " " + valorFinal + " [" + valorObjetivo + "]");
                    break;

                case 6:
                    System.out.println("Ingrese el valor que desea convertir");
                    valor = lectura.nextFloat();
                    valorBase = "CLP";
                    valorObjetivo = "USD";
                    datosApi = consulta.obtieneData("https://v6.exchangerate-api.com/v6/ed12da4067667713f1084a72/pair/"
                            + valorBase + "/" + valorObjetivo);

                    data = gson.fromJson(datosApi, DatosValorMonedas.class);

                    valorFinal = valor * data.conversionRate();
                    System.out.println("El valor " + valor + " [" + valorBase + "] " + "corresponde al valor final de ==>" +
                            " " + valorFinal + " [" + valorObjetivo + "]");
                    break;
            }
        }
        System.out.println("Finalizando la aplicación");
    }

    public void muestraMenu(){
        System.out.println(this.mensaje);
    }
}
