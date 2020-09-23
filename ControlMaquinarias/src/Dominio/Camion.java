/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author sebas
 */
public class Camion extends Equipo {
    private int Toneladas;
    public Camion(String codigo, int Toneladas, double horometro) {
        super(codigo, horometro);
        this.Toneladas = Toneladas;
    }

    public int getToneladas() {
        return Toneladas;
    }
    
    
}
