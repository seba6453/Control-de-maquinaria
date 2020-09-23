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
public class ReporteCamion extends Reporte {
    private int numeroVueltas;

    public ReporteCamion(int numeroVueltas, double HorasDisponibles, double HorasTrabajadas, double HorasStandBy, int CantPetroleo, double HorometroFinal, double HorometroInicial, String codigoEquipo, double HorasPanne, String fecha) {
        super(HorasDisponibles, HorasTrabajadas, HorasStandBy, CantPetroleo, HorometroFinal, HorometroInicial, codigoEquipo, HorasPanne, fecha);
        this.numeroVueltas = numeroVueltas;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }
    
    
}
