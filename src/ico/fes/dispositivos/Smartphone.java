/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.dispositivos;

import ico.fes.factory.Dispositivos;

/**
 *
 * @author ivans
 */
public class Smartphone implements Dispositivos{
    private String marca;
    private int almacenamiento;
    private int ram;
    private boolean resistenciaAgua;

    public Smartphone() {
    }

    public Smartphone(String marca, int almacenamiento, int ram, boolean resistenciaAgua) {
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.resistenciaAgua = resistenciaAgua;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isResistenciaAgua() {
        return resistenciaAgua;
    }

    public void setResistenciaAgua(boolean resistenciaAgua) {
        this.resistenciaAgua = resistenciaAgua;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", almacenamiento=" + almacenamiento + "gb , ram=" + ram + "gb , resistencia al agua=" + resistenciaAgua + "}";
    }
    
}
