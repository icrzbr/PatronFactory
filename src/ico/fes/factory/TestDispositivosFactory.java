/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import java.util.Scanner;

/**
 *
 * @author ivans
 */
public class TestDispositivosFactory {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        //Menú
        System.out.println("¿Qué artículo desea comprar?");
        System.out.println(Dispositivos.HP_PROBOOK+") Laptop HP Pro Book");
        System.out.println(Dispositivos.ACER_NITRO_5+") Laptop Acer Nitro 5");
        System.out.println(Dispositivos.IPHONE_13+") Smartphone iPhone 13");
        System.out.println(Dispositivos.GALAXY_S22+") Smartphone Samsung Galaxy S22");
        System.out.println(Dispositivos.IPAD_PRO+") iPad Pro");
        System.out.println(Dispositivos.HUAWEI_MATEPAD_PRO+") HUAWEI MatePad Pro");
        
        //trycatch + tab
        try {
            System.out.print("Elige el número: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un número");
        }
        
        Dispositivos dispositivo =  DispositivosFactory.createDispositivo(eleccion);
        System.out.println(dispositivo.toString());
    }
}
