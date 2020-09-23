/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author sebas
 */
public interface Sistema {
    
    /**
     * -Descripcion: Se ingresa un camion al sistema
     * -Precondicion: ---------
     * -Postcondicion: Camion ingresado al sistema
     * 
     * @param codigo
     * @param Toneladas
     * @param horometro
     */
    public void ingresarCamion(String codigo, int Toneladas, double horometro);
    
    /**
     * -Descripcion: Se ingresa una maquina al sistema
     * -Precondicion: ---------
     * -Postcondicion: Maquina ingresado al sistema
     * 
     * @param codigo
     * @param horometro
     */
    public void ingresarMaquina(String codigo, double horometro);
    
    /**
     * -Descripcion: Se ingresa un reporte de maquina al sistema
     * -Precondicion: Que la maquina exista
     * -Postcondicion: Reporte ingresado al sistema
     * 
     * @param HorasTrabajadas
     * @param HorasStandBy
     * @param CantPetroleo
     * @param HorometroFinal
     * @param HorometroInicial
     * @param codigoEquipo
     * @param HorasPanne
     * @param fecha
     * @return
     */
    public boolean ingresarReporteMaquina(double HorasTrabajadas, double HorasStandBy, int CantPetroleo, double HorometroFinal, double HorometroInicial, String codigoEquipo, double HorasPanne, String fecha);
    
    /**
     * -Descripcion: Se ingresa un reporte de camion al sistema
     * -Precondicion: Que el camion exita
     * -Postcondicion: Reporte ingresado al sistema
     * 
     * @param HorasTrabajadas
     * @param HorasStandBy
     * @param CantPetroleo
     * @param HorometroFinal
     * @param HorometroInicial
     * @param codigoEquipo
     * @param HorasPanne
     * @param fecha
     * @param numeroVueltas
     * @return
     */
    public void ingresarReporteCamion(double HorasTrabajadas, double HorasStandBy, int CantPetroleo, double HorometroFinal, double HorometroInicial, String codigoEquipo, double HorasPanne, String fecha, int numeroVueltas);
    
    /**
     * -Descripcion: Se obtienen los datos de una maquina (Codigo,horometro inicial,petroleo acumulado)
     * -Precondicion: Que la maquina exista
     * -Postcondicion: ---------------
     * 
     * @param codigo
     * @return
     */
    public String obtenerInformacionMaquina(String codigo);
    
    /**
     * -Descripcion: Se obtienen el horometro final de un equipo
     * -Precondicion: Que el equipo exista
     * -Postcondicion: ------------
     * 
     * @param codigo
     * @return
     */
    public double obtenerHorometro(String codigo);
    
    /**
     * -Descripcion: Se obtiene los datos necesarios para guardar los datos de las maquina del sistema
     * -Precondicion: ---------
     * -Postcondicion: ---------
     * 
     * @return
     */
    public String obtenerMaquinas();
    
    /**
     * -Descripcion: Se obtiene los datos necesarios para guardar los datos de los camiones del sistema
     * -Precondicion: ---------
     * -Postcondicion: ---------
     * 
     * @return
     */
    public String obtenerCamiones();
    
    /**
     * -Descripcion: Se obtiene los datos necesarios para guardar los datos de los reportes de los camiones del sistema
     * -Precondicion: ---------
     * -Postcondicion: ---------
     * 
     * @return
     */
    public String obtenerReportesCamiones();
    
    /**
     * -Descripcion: Se obtiene los datos necesarios para guardar los datos de los reportes de las maquina del sistema
     * -Precondicion: ---------
     * -Postcondicion: ---------
     * 
     * @return
     */
    public String obtenerReporteMaquinas();
    
    /**
     * -Descripcion: Se obtiene el tipo de maquinaria que es el equipo solicitado
     * -Precondicion: Que el equipo exista
     * -Postcondicion: ---------
     * 
     * @param codigo
     * @return
     */
    public int obtenerTipoEquipo(String codigo);
    
    /**
     * -Descripcion: Se obtiene el numero de reportes de un equipo en particular
     * -Precondicion: Que el equipo exista
     * -Postcondicion: ---------
     * 
     * @param codigo
     * @return
     */
    public int obtenerNumeroReporteDeEquipo(String codigo);
    
    /**
     * -Descripcion: Se obtiene un reporte en especifico de un equipo
     * -Precondicion: Que el equipo exista
     * -Postcondicion: ---------
     * 
     * @param codigo
     * @param mes
     * @param posicion
     * @return
     */
    public String obtenerReporteEquipo(String codigo,int mes,int posicion);
    
    /**
     * -Descripcion: Se obtiene el numero de equipos ingresados en el sistema
     * -Precondicion: --------
     * -Postcondicion: ---------
     * 
     * @return 
     */
    public int obtenerNumeroEquipos();
    
    /**
     * -Descripcion: Se obtiene el codigo del equipo de la posicion dada
     * -Precondicion: --------
     * -Postcondicion: ---------
     * 
     * @param index
     * @return
     */
    public String obtenerCodigoCamion(int index);
    
    /**
     * -Descripcion: Se obtiene el reporte del camion de la posicion dada
     * -Precondicion: que el camion existe
     * -Postcondicion: ---------
     * 
     * @param codigo
     * @param fechaI
     * @param fechaF
     * @param posicion
     * @return
     */
    public String obtenerReporteCamion(String codigo,String fechaI,String fechaF,int posicion);
}
