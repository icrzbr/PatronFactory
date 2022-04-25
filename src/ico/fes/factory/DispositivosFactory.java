/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import ico.fes.dispositivos.Computadora;
import ico.fes.dispositivos.Smartphone;
import ico.fes.dispositivos.Tablet;

/**
 *
 * @author ivans
 */
public class DispositivosFactory {
    public static Dispositivos createDispositivo(int tipo){
        switch(tipo){
            case Dispositivos.HP_PROBOOK:
                return new Computadora("Hp", "Ryzen 5", 512, 16);
            case Dispositivos.ACER_NITRO_5:
                return new Computadora("Acer Nitro 5", "i5", 1000, 8);
            case Dispositivos.IPHONE_13:
                return new Smartphone("Apple", 256, 6, true);
            case Dispositivos.GALAXY_S22:
                return new Smartphone("Samsung", 256, 8, true);
            case Dispositivos.IPAD_PRO:
                return new Tablet("Apple", 512, 8, 12.9f);
            case Dispositivos.HUAWEI_MATEPAD_PRO:
                return new Tablet("Huawei", 256, 8, 12.6f);
            default:
                throw  new AssertionError();
        }
    }
}
