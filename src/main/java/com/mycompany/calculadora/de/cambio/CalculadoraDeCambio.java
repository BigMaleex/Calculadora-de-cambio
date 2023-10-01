/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora.de.cambio;
import java.util.Scanner;

/**
 *
 * @author alexc
 */
public class CalculadoraDeCambio {

    public static void main(String[] args) {
        Scanner dinero=new Scanner (System.in);
        Scanner texto = new Scanner (System.in);
        String respal;
        int paletas;
        paletas=0;
        
        do {
            System.out.println("¿Te comprarón paletas? (si/no)");
            respal = texto.nextLine();
        }
        while(!respal.equalsIgnoreCase("si") && !respal.equalsIgnoreCase("no"));
        
        if (respal.equalsIgnoreCase("si")){
            System.out.println("¿Cuántas paletas fuerón?");
            paletas=dinero.nextInt();
        }
        
        String rescon;
        int congeladas;
        congeladas =0;
        
        do {
            System.out.println("¿Te compraron congeladas?(si/no)");
            rescon =texto.nextLine();
        }
        while(!rescon.equalsIgnoreCase("si") && !rescon.equalsIgnoreCase("no"));
        
        if (rescon.equalsIgnoreCase ("si")){
            System.out.println("¿Cuántas congeladas fuerón?");
            congeladas = dinero.nextInt();
        }
        
        String rescono;
        int cono;
        cono =0;
        
        do {
            System.out.println("¿Te compraron conos?(si/no)");
            rescono =texto.nextLine();
        }
        while(!rescono.equalsIgnoreCase("si") && !rescono.equalsIgnoreCase("no"));
        if (rescono.equalsIgnoreCase("si")) {
            System.out.println("¿Cuántos fuerón?");
            cono = dinero.nextInt();
        }
        
        String ressandwich;
        int sandwich;
        sandwich =  0;
        
        do {
            System.out.println("¿Te comprarón sandwiches?(si/no)");
            ressandwich =texto.nextLine();
        }
        while(!ressandwich.equalsIgnoreCase("si") && !ressandwich.equalsIgnoreCase("no"));
        
        if (ressandwich.equalsIgnoreCase("si")){
            System.out.println("¿Cuántos sandwiches fuerón?");
            sandwich = dinero.nextInt();
        }
        int sumpaletas = paletas *5;
        int sumcongeladas = congeladas *11;
        int sumconos = cono *10;
        int sumsandwiches = sandwich *10;
        double productos = sumpaletas + sumcongeladas + sumconos + sumsandwiches;
        
        System.out.println("El total del dinero que debés de cobrar es de:" + productos);
        System.out.println("¿Cuánto dinero te dieron?");
        double din=dinero.nextDouble();
        
        while (din < productos) {
            System.out.println("Te están pagando de menos, deberían de darte como mínimo: " +productos + "y te están dando: " +din + "habla con la persona y dile que le falta dinero e ingresalo aquí." );
            din =dinero.nextDouble();
        }
        
        double change = (din - productos);
        double cambio = din- productos;
        
        int []monbil = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int []Nummonbil ={0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        
        for (int i = 0; i < monbil.length; i++) {
            while (change >= monbil[i]){
                Nummonbil [i]++;
                change-=monbil[i];
            }
        }
        System.out.println("Del total la siguiente cantidad es de paletas:"+ sumpaletas);
        
        System.out.println("Del total la siguiente cantidad es de congeladas:" +sumcongeladas);
        
        System.out.println("Del total la siguiente cantidad es de conos:"+sumconos);
        
        System.out.println("Del total la siguiente cantidad es de sandwiches:" +sumsandwiches);
        
        System.out.println("El dinero total de los productos consumidos es de:" +productos);
        
        System.out.println("Tienes que devolver la siguiente cantidad de dinero:"+cambio);
        System.out.println("En billetes o monedas sería:");
        System.out.println("Billetes de 1000 pesos:" + Nummonbil[0]);
        System.out.println("Billetes de 500 pesos:" + Nummonbil[1]);
        System.out.println("Billetes de 200 pesos:" + Nummonbil[2]);
        System.out.println("Billetes de 100 pesos:" + Nummonbil[3]);
        System.out.println("Billetes de 50 pesos:" + Nummonbil[4]);
        System.out.println("Billetes de 20 pesos:" + Nummonbil[5]);
        System.out.println("Monedas de 10 pesos:" + Nummonbil[6]);
        System.out.println("Monedas de 5 pesos:" + Nummonbil[7]);
        System.out.println("Monedas de 2 pesos:" + Nummonbil[8]);
        System.out.println("Monedas de 1 peso:" + Nummonbil[9]);     
    }
}
