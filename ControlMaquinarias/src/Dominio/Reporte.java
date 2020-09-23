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
public class Reporte {
    private String codigoEquipo;
    private double HorasDisponibles;
    private double HorasTrabajadas;
    private double HorasStandBy;
    private int CantPetroleo;
    private double HorasPanne;
    private double HorometroInicial;
    private double HorometroFinal;
    private String fecha;

    public Reporte(double HorasDisponibles, double HorasTrabajadas, double HorasStandBy, int CantPetroleo, double HorometroFinal, double HorometroInicial, String codigoEquipo, double HorasPanne, String fecha) {
        this.HorasDisponibles = HorasDisponibles;
        this.HorasTrabajadas = HorasTrabajadas;
        this.HorasStandBy = HorasStandBy;
        this.CantPetroleo = CantPetroleo;
        this.HorometroFinal = HorometroFinal;
        this.codigoEquipo = codigoEquipo;
        this.HorometroInicial = HorometroInicial;
        this.HorasPanne = HorasPanne;
        this.fecha = fecha;
    }

    public double getHorasDisponibles() {
        return HorasDisponibles;
    }

    public double getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public double getHorasStandBy() {
        return HorasStandBy;
    }

    public int getCantPetroleo() {
        return CantPetroleo;
    }

    public double getHorometroFinal() {
        return HorometroFinal;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public double getHorasPanne() {
        return HorasPanne;
    }

    public double getHorometroInicial() {
        return HorometroInicial;
    }

    public String getFecha() {
        return fecha;
    }
    
    
}
