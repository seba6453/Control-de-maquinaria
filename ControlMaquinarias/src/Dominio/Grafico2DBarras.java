/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author sebas
 */
public class Grafico2DBarras {
    private DefaultCategoryDataset dataset;
    private JFreeChart chart;
    private ChartFrame frame;

    public Grafico2DBarras(String nombreEjeX,String nombreEjeY,String nombreGrafico,String nombreVentana) {
        this.dataset = new DefaultCategoryDataset();
        this.chart = ChartFactory.createBarChart3D(nombreGrafico,nombreEjeX, nombreEjeY, dataset, PlotOrientation.VERTICAL, true,true, false);
        this.frame = new ChartFrame(nombreVentana, chart);
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);
    }

    public DefaultCategoryDataset getDataset() {
        return dataset;
    }

    public JFreeChart getChart() {
        return chart;
    }

    public ChartFrame getFrame() {
        return frame;
    }
    
    
}
