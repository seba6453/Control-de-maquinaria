/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.LinkedList;


/**
 *
 * @author sebastian
 */
public class Equipo {
    private String codigo;
    private double horometro;
    private int petroleoAcomulado;
    private LinkedList<Reporte> listaReportes;

    public Equipo(String codigo, double horometro) {
        this.codigo = codigo;
        this.horometro = horometro;
        this.petroleoAcomulado = 0;
        listaReportes = new LinkedList<Reporte>();
    }

    public String getCodigo() {
        return codigo;
    }

    public double getHorometro() {
        return horometro;
    }

    public void setHorometro(double horometro) {
        this.horometro = horometro;
    }

    public int getPetroleoAcomulado() {
        return petroleoAcomulado;
    }

    public void setPetroleoAcomulado(int petroleoAcomulado) {
        this.petroleoAcomulado += petroleoAcomulado;
    }

    public LinkedList<Reporte> getListaReportes() {
        return listaReportes;
    }
    
    
    
}
