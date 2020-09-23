/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author sebas
 */
public class Graficos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fuente de Datos
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(3000, "Combustible", "Maquina1");
        dataset.setValue(4000, "Toneladas", "Maquina1");
        dataset.setValue(300, "Horas maquina", "Maquina1");
        
        dataset.setValue(3060, "Combustible", "Maquina2");
        dataset.setValue(5640, "Toneladas", "Maquina2");
        dataset.setValue(360.5, "Horas maquina", "Maquina2");
        
        dataset.setValue(4500, "Combustible", "Maquina3");
        dataset.setValue(10000, "Toneladas", "Maquina3");
        dataset.setValue(-3205, "Horas maquina", "Maquina3");
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createBarChart3D
         ("Estadistica mensual","Maquinas", "Rendimiento", 
        dataset, PlotOrientation.VERTICAL, true,true, false);
 
        // Mostrar Grafico
        ChartFrame frame = new ChartFrame("JFreeChart", chart);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
}
