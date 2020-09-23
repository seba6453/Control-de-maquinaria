/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 */
package Dominio;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author sebas
 */
public class Grafico2DlineasTiempo {
    private XYSeriesCollection datosColeccion;
    private JFreeChart grafico;
    private ChartFrame ventana;

    public Grafico2DlineasTiempo(String nombreEjeX,String nombreEjeY,String nombreGrafico,String nombreVentana) {
        datosColeccion = new XYSeriesCollection();
        grafico = ChartFactory.createXYLineChart(nombreGrafico, nombreEjeX, nombreEjeY, 
				datosColeccion,
				PlotOrientation.VERTICAL, 
				true, // uso de leyenda
				false, // uso de tooltips  
				false // uso de urls
 				);
        XYPlot plot = (XYPlot) grafico.getPlot();
        configurarPlot(plot);
        XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer)plot.getRenderer();
	configurarRendered(renderer);
        
        ventana = new ChartFrame(nombreVentana, grafico);
        ventana.setVisible(false);
        
        ventana.setSize(1000, 700);
        ventana.setLocationRelativeTo(null);
    }
    private void configurarPlot (XYPlot plot) {
        plot.setDomainGridlinePaint(new Color(31,87,4));
        plot.setRangeGridlinePaint(new Color(31,87,4));
    }
    private void configurarRendered (XYLineAndShapeRenderer renderer) {
        renderer.setSeriesShapesVisible(0, true);
        renderer.setSeriesShapesVisible(1, true);
        renderer.setSeriesPaint(0, new Color(255, 128, 64));
        renderer.setSeriesPaint(1, new Color(28, 84, 140));
    }

    public XYSeriesCollection getDatosColeccion() {
        return datosColeccion;
    }

    public JFreeChart getGrafico() {
        return grafico;
    }

    public ChartFrame getVentana() {
        return ventana;
    }
    
    
}
