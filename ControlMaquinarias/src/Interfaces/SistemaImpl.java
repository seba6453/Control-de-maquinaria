/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Dominio.*;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author sebas
 */
public class SistemaImpl implements Sistema{
    private LinkedList<Equipo> listaEquipos;

    public SistemaImpl() {
        listaEquipos = new LinkedList<Equipo>();
    }
    
    @Override
    public void ingresarCamion(String codigo, int Toneladas, double horometro){
        Camion camion = new Camion(codigo, Toneladas, horometro);
        listaEquipos.add(camion);
    }
    
    @Override
    public void ingresarMaquina(String codigo, double horometro){
        Maquina maquina = new Maquina(codigo, horometro);
        listaEquipos.add(maquina);
    }
    
    @Override
    public boolean ingresarReporteMaquina(double HorasTrabajadas, double HorasStandBy, int CantPetroleo, double HorometroFinal, double HorometroInicial, String codigoEquipo, double HorasPanne, String fecha){
        Equipo equip = null;
        for (Equipo equipo : listaEquipos){
            if (equipo.getCodigo().equals(codigoEquipo)){
                equip = equipo;
            }
        }
        if (equip == null){
            throw new NullPointerException("Equipo no encontrado");
        }
        double resta = HorometroFinal - HorometroInicial;
        if (resta < 13){
            Reporte reporte = new ReporteMaquina(resta, HorasTrabajadas, HorasStandBy, CantPetroleo, HorometroFinal, HorometroInicial, codigoEquipo, HorasPanne, fecha);
            equip.getListaReportes().add(reporte);
            equip.setHorometro(HorometroFinal);
            equip.setPetroleoAcomulado(CantPetroleo);
            return true;
        }
        return false;
    }
    
    @Override
    public void ingresarReporteCamion( double HorasTrabajadas, double HorasStandBy, int CantPetroleo, double HorometroFinal, double HorometroInicial, String codigoEquipo, double HorasPanne, String fecha, int numeroVueltas){
        Equipo equip = null;
        for (Equipo equipo : listaEquipos){
            if (equipo.getCodigo().equals(codigoEquipo)){
                equip = equipo;
            }
        }
        if (equip == null){
            throw new NullPointerException("Equipo no encontrado");
        }
        double resta = HorometroFinal - HorometroInicial;
        Reporte reporte = new ReporteCamion( numeroVueltas, resta, HorasTrabajadas, HorasStandBy, CantPetroleo, HorometroFinal, HorometroInicial, codigoEquipo, HorasPanne, fecha);
        equip.getListaReportes().add(reporte);
        equip.setHorometro(HorometroFinal);
        equip.setPetroleoAcomulado(CantPetroleo);
    }
    
    @Override
    public String obtenerInformacionMaquina(String codigo){
        String info = "";
        for (Equipo equipo : listaEquipos){
            if (equipo.getCodigo().equals(codigo) && equipo instanceof Maquina){
                Maquina maquina = (Maquina) equipo;
                info = maquina.getCodigo() + "," + maquina.getHorometro() + "," + maquina.getPetroleoAcomulado();
            }
        }
        if ("".equals(info)){
            throw new NullPointerException("Maquina no encontrada");
        }
        return info;
    }
    
    @Override
    public double obtenerHorometro(String codigo){
        double horometro = -1;
        for(Equipo equipo : listaEquipos){
            if(equipo.getCodigo().equals(codigo)){
                horometro = equipo.getHorometro();
            }
        }
        if (horometro == -1){
            throw new NullPointerException("Equipo no existe en el sistema");
        }
        return horometro;
    }
    
    @Override
    public String obtenerMaquinas(){
        String info = "";
        for (Equipo equipo : listaEquipos){
            if (equipo instanceof Maquina){
                Maquina maquina = (Maquina) equipo;
                info += "M" + "," + maquina.getCodigo() + "," + maquina.getHorometro() + "\n";
            }
        }
        return info;
    }
    
    @Override
    public String obtenerCamiones(){
        String info = "";
        for(Equipo equipo : listaEquipos){
            if (equipo instanceof Camion){
                Camion camion = (Camion) equipo;
                info += "C" + "," + camion.getCodigo() + "," + camion.getHorometro() + "," + camion.getToneladas() + "\n";
            }
        }
        return info;
    }
    
    @Override
    public String obtenerReportesCamiones(){
        String info = "";
        for (Equipo equipo : listaEquipos){
            if (equipo instanceof Camion){
                Camion camion = (Camion) equipo;
                for(Reporte reporte : camion.getListaReportes()){
                    if(reporte instanceof ReporteCamion){
                        ReporteCamion reporteC = (ReporteCamion) reporte;
                        info += "C," + reporteC.getCodigoEquipo() + "," + reporteC.getHorasTrabajadas() + "," + reporteC.getHorasStandBy() + "," + reporteC.getCantPetroleo() + "," + reporteC.getHorasPanne() + "," + reporteC.getHorometroFinal() + "," + reporteC.getHorometroInicial() + "," + reporteC.getFecha() + "," + reporteC.getNumeroVueltas() + "\n";
                    }
                }
            }
        }
        return info;
    }
    
    @Override
    public String obtenerReporteMaquinas(){
        String info = "";
        for (Equipo equipo : listaEquipos){
            if (equipo instanceof Maquina){
                Maquina maquina = (Maquina) equipo;
                for (Reporte reporte : maquina.getListaReportes()){
                    if(reporte instanceof ReporteMaquina){
                        ReporteMaquina reporteM = (ReporteMaquina) reporte;
                        info += "M," + reporteM.getCodigoEquipo() + "," + reporteM.getHorasTrabajadas() + "," + reporteM.getHorasStandBy() + "," + reporteM.getCantPetroleo() + "," + reporteM.getHorasPanne() + "," + reporteM.getHorometroFinal() + "," + reporteM.getHorometroInicial() + "," + reporteM.getFecha() + "\n";
                    }
                }
            }
        }
        return info;
    }
    
    @Override
    public int obtenerTipoEquipo(String codigo){
        // Maquina = 1 : Camion = 0
        int tipo = -1;
        for (Equipo equipo : listaEquipos){
            if(equipo.getCodigo().equals(codigo)){
                if (equipo instanceof Maquina){
                    tipo = 1;
                }
                if(equipo instanceof Camion){
                    tipo = 0;
                }
            }
        }
        if(tipo == -1){
            throw new NullPointerException("Equpo no existe");
        }
        return tipo;
    }
    
    @Override
    public int obtenerNumeroReporteDeEquipo(String codigo){
        int cantidad = -1;
        for (Equipo equipo : listaEquipos){
            if(equipo.getCodigo().equals(codigo)){
                cantidad = equipo.getListaReportes().size();
            }
        }
        if (cantidad == -1){
            throw new NullPointerException("Equipo no encontrado");
        }
        return cantidad;
    }
    
    @Override
    public String obtenerReporteEquipo(String codigo,int mes,int posicion){
        String datos = "nada";
        Equipo equipo = null;
        for (Equipo e : listaEquipos){
            if(e.getCodigo().equals(codigo)){
                equipo = e;
                break;
            }
        }
        if(equipo != null){
            Reporte reporte = equipo.getListaReportes().get(posicion);
            String [] fechaRepo = reporte.getFecha().split("/");
            Date fecha = new Date(fechaRepo[1] + "/" + fechaRepo[0] + "/" + fechaRepo[2]);
            if(fecha.getMonth() == mes){
                if (reporte instanceof ReporteCamion){
                    ReporteCamion repoCamion = (ReporteCamion) reporte;
                    datos = repoCamion.getFecha() + "," + repoCamion.getHorometroInicial()+ "," + repoCamion.getHorometroFinal() + "," + repoCamion.getHorasDisponibles() + "," + repoCamion.getHorasTrabajadas() + "," + repoCamion.getHorasStandBy() + "," + repoCamion.getHorasPanne() + "," + repoCamion.getCantPetroleo() + "," + repoCamion.getNumeroVueltas();
                }
                if(reporte instanceof ReporteMaquina){
                    ReporteMaquina repoMaquina = (ReporteMaquina) reporte;
                    datos = repoMaquina.getFecha() + "," + repoMaquina.getHorometroInicial() + "," + repoMaquina.getHorometroFinal() + "," + repoMaquina.getHorasDisponibles() + "," + repoMaquina.getHorasTrabajadas() + "," + repoMaquina.getHorasStandBy() + "," + repoMaquina.getHorasPanne() + "," + repoMaquina.getCantPetroleo() + ",-"; 
                }
            }
        }
        else{
            throw new NullPointerException("Equipo no existe");
        }
        return datos;
    }
    
    public String obtenerReporteCamion(String codigo,String fechaI,String fechaF,int posicion){
        Camion camion = null;
        String datos = null;
        String [] fecha = fechaI.split("/");
        Date fechaInical = new Date(fecha[1] + "/" + fecha[0] + "/" + fecha[2]);
        fecha = fechaF.split("/");
        Date fechaFinal = new Date(fecha[1] + "/" + fecha[0] + "/" + fecha[2]);
        for(Equipo equipo : listaEquipos){
            if(equipo.getCodigo().equals(codigo)){
                camion = (Camion) equipo;
                break;
            }
        }
        if(camion != null){
            ReporteCamion reporte = (ReporteCamion) camion.getListaReportes().get(posicion);
            fecha = reporte.getFecha().split("/");
            Date fechaReporte = new Date(fecha[1] + "/" + fecha[0] + "/" + fecha[2]);
            if(fechaI.equals(fechaF)){
                if(fechaReporte.equals(fechaInical)){
                    datos = reporte.getFecha() + "," + reporte.getHorometroInicial()+ "," + reporte.getHorometroFinal() + "," + reporte.getHorasDisponibles() + "," + reporte.getHorasTrabajadas() + "," + reporte.getHorasStandBy() + "," + reporte.getHorasPanne() + "," + reporte.getCantPetroleo() + "," + reporte.getNumeroVueltas();
                }
            }
            else if(fechaInical.after(fechaReporte) && fechaFinal.before(fechaReporte)){
                datos = reporte.getFecha() + "," + reporte.getHorometroInicial()+ "," + reporte.getHorometroFinal() + "," + reporte.getHorasDisponibles() + "," + reporte.getHorasTrabajadas() + "," + reporte.getHorasStandBy() + "," + reporte.getHorasPanne() + "," + reporte.getCantPetroleo() + "," + reporte.getNumeroVueltas();
            }
        }
        else{
            throw new NullPointerException("Camion no existente");
        }
        return datos;
    }
    
    @Override
    public int obtenerNumeroEquipos(){
        return listaEquipos.size();
    }
    
    @Override
    public String obtenerCodigoCamion(int index){
        String codigo = null;
        if(listaEquipos.get(index) instanceof Camion){
            codigo = listaEquipos.get(index).getCodigo();
        }
        return codigo;
    }
}
