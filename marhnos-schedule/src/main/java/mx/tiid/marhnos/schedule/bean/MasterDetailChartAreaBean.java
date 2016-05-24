package mx.tiid.marhnos.schedule.bean;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
 
@ManagedBean
@ViewScoped
public class MasterDetailChartAreaBean implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LineChartModel areaModel;
	
	private Random random;
	
	private int max = 100;
	private int min = 0;
 
    @PostConstruct
    public void init() {
    	random = new Random();
        createAreaModel();
    }
 
    public LineChartModel getAreaModel() {
        return areaModel;
    }
     
    private void createAreaModel() {
        areaModel = new LineChartModel();
 
        LineChartSeries boys = new LineChartSeries();
        boys.setFill(true);
        boys.setLabel("Real");
        boys.set("Enero", random.nextInt((max - min) + 1) + min);
        boys.set("Febrero", random.nextInt((max - min) + 1) + min);
        boys.set("Marzo", random.nextInt((max - min) + 1) + min);
 
        LineChartSeries girls = new LineChartSeries();
        girls.setFill(true);
        girls.setLabel("Objetivo");
        girls.set("Enero", 60);
        girls.set("Febrero", 60);
        girls.set("Marzo", 60);
 
        areaModel.addSeries(boys);
        areaModel.addSeries(girls);
         
        areaModel.setTitle("Calidad, Mejora Continua");
        areaModel.setLegendPosition("ne");
        areaModel.setStacked(true);
        areaModel.setShowPointLabels(true);
        areaModel.setAnimate(true);
         
        Axis xAxis = new CategoryAxis("Mes");
        areaModel.getAxes().put(AxisType.X, xAxis);
        Axis yAxis = areaModel.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(100);
    }
     
}