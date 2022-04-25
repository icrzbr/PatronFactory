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
public class Tablet implements Dispositivos{
    private String marca;
    private int almacenamiento;
    private int ram;
    private float tamanio;

    public Tablet() {
    }

    public Tablet(String marca, int almacenamiento, int ram, float tamanio) {
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.tamanio = tamanio;
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

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ", almacenamiento=" + almacenamiento + "gb , ram=" + ram + "gb , tamanio=" + tamanio + "}";
    }
    
}
