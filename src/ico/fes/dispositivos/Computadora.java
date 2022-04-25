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
public class Computadora implements Dispositivos{
    private String marca;
    private String procesador;
    private int almacenamiento;
    private int ram;

    public Computadora() {
    }

    public Computadora(String marca, String procesador, int almacenamiento, int ram) {
        this.marca = marca;
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
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

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", procesador=" + procesador + ", almacenamiento=" + almacenamiento + "gb , ram=" + ram + "gb}";
    }
    
}
