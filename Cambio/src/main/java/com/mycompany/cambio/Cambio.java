/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cambio;
import java.util.Scanner;

/**
 *
 * @author alexc
 */
public class Cambio {

    public static void main(String[] args) {
        Scanner dinero =new Scanner (System.in);
        
        System.out.println("Presiona 1 para sí, 2 para no y después presiona enter");
        System.out.println("¿Te compraron paletas?");
        int respal =dinero.nextInt();
        int paletas;
        paletas = 0;
        while (respal < 1) {
        
            System.out.println("Esa no es una respuesta valida, ingresa la correcta por favor (1 para sí, 2 para no)");
            respal = dinero.nextInt();
        
        }
        
        while (respal >2) {
            System.out.println("Esa no es una respuesta valida, ingresa la correcta por favor (1 para sí, 2 para no)");
            respal = dinero.nextInt();
        }
        switch(respal){
            case 1 -> {
                System.out.println("¿Cúantas paletas fueron?");
                paletas =dinero.nextInt();
            }
            case 2 -> {
            }        
        }
        
        int sumpaletas = paletas * 5;
        
        System.out.println("¿Te compraron congeladas?");
        int rescon =dinero.nextInt();
        int congeladas;
        congeladas = 0;
        while (rescon < 1) {
        
            System.out.println("Esa no es una respuesta valida, ingresa la correcta por favor (1 para sí, 2 para no)");
            respal = dinero.nextInt();
        
        }
        
        while (rescon >2) {
            System.out.println("Esa no es una respuesta valida, ingresa la correcta por favor (1 para sí, 2 para no)");
            respal = dinero.nextInt();
        }
        switch(rescon){
            case 1 -> {
                System.out.println("¿Cúantas congeladas fueron?");
                congeladas =dinero.nextInt();
            }
            case 2 -> {
            }        
        }
        
        int sumcongeladas = congeladas * 11;
        
        System.out.println("¿Te compraron conos?");
        int rescono =dinero.nextInt();
        int conos;
        conos = 0;
        while (rescono < 1) {
        
            System.out.println("Esa no es una respuesta valida, ingresa la correcta por favor (1 para sí, 2 para no)");
            rescono = dinero.nextInt();
        
        }
        
        while (rescono >2) {
            System.out.println("Esa no es una respuesta valida, ingresa la correcta por favor (1 para sí, 2 para no)");
            rescono = dinero.nextInt();
        }
        switch(rescono){
            case 1 -> {
                System.out.println("¿Cúantos conos fueron?");
                conos =dinero.nextInt();
            }
            case 2 -> {
            }        
        }
        
        int sumconos = conos * 10;
        
        System.out.println("¿Te compraron Sandwiches?");
        int ressand =dinero.nextInt();
        int sand;
        sand = 0;
        while (ressand < 1) {
        
            System.out.println("Esa no es una respuesta valida, ingresa la correcta por favor (1 para sí, 2 para no)");
            rescono = dinero.nextInt();
        
        }
        
        while (ressand >2) {
            System.out.println("Esa no es una respuesta valida, ingresa la correcta por favor (1 para sí, 2 para no)");
            ressand = dinero.nextInt();
        }
        switch(ressand){
            case 1 -> {
                System.out.println("¿Cúantos conos fueron?");
                sand =dinero.nextInt();
            }
            case 2 -> {
            }        
        }
        
        int sumsand = sand * 10;
        
        double productos = sumsand + sumconos+ sumpaletas+ sumcongeladas;
        
        System.out.println("El dinero total de los productos consumidos es de:" +productos);
        
        System.out.println ("¿Cuánto dinero te dieron?");
        int din1 = dinero.nextInt();
        
        
        
        
       

        
        while (din1 < productos) {
            System.out.println("La cantidad que ingresaste es incorrecta, ya que el total de lo que consumio es de:"+productos+ ", y te dió:"+din1+". Habla con la persona y dile que te dé lo justo. Luego ingresalo acá");
            din1 = dinero.nextInt();
        }
        
        double cambiores=din1-productos;
        
        double cambio =(din1 - productos);
        
        int[] monedas = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] numMonedas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < monedas.length; i++) {
            while (cambio >= monedas[i]) {
                numMonedas[i]++;
                cambio -= monedas[i];
            }
        }
        
        System.out.println("Del total la siguiente cantidad es de paletas:"+ sumpaletas);
        
        System.out.println("Del total la siguiente cantidad es de congeladas:" +sumcongeladas);
        
        System.out.println("Del total la siguiente cantidad es de conos:"+sumconos);
        
        System.out.println("Del total la siguiente cantidad es de sandwiches:" +sumsand);
        
        System.out.println("El dinero total de los productos consumidos es de:" +productos);
        
        System.out.println("Tienes que devolver la siguiente cantidad de dinero:"+cambiores);
        System.out.println("En billetes o monedas sería:");

        System.out.println("Billetes de 1000 pesos: " + numMonedas[0]);
        System.out.println("Billetes de 500 pesos: " + numMonedas[1]);
        System.out.println("Billetes de 200 pesos: " + numMonedas[2]);
        System.out.println("Billetes de 100 pesos: " + numMonedas[3]);
        System.out.println("Billetes de 50 pesos: " + numMonedas[4]);
        System.out.println("Billetes de 20 pesos: " + numMonedas[5]);
        System.out.println("Monedas de 10 pesos: " + numMonedas[6]);
        System.out.println("Monedas de 5 pesos: " + numMonedas[7]);
        System.out.println("Monedas de 2 pesos: " + numMonedas[8]);
        System.out.println("Monedas de 1 peso: " + numMonedas[9]);
    }
}
