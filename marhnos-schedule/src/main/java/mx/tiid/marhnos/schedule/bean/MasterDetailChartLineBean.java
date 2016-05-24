package mx.tiid.marhnos.schedule.bean;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;

@ManagedBean
public class MasterDetailChartLineBean {

	private LineChartModel lineModel2;
	
	private int max = 100;

	private int min = 0;
	
	private Random random;

	@PostConstruct
	public void init() {
		random = new Random();
		createLineModels();
	}

	public LineChartModel getLineModel2() {
		return lineModel2;
	}

	private void createLineModels() {

		lineModel2 = initCategoryModel();
		lineModel2.setAnimate(true);
		lineModel2.setTitle("PPC Acumulado");
		lineModel2.setLegendPosition("e");
		lineModel2.setShowPointLabels(true);
		lineModel2.getAxes().put(AxisType.X, new CategoryAxis("Semanas"));
		Axis yAxis = lineModel2.getAxis(AxisType.Y);
		yAxis.setLabel("% Cumplimiento");
		yAxis.setMin(0);
		yAxis.setMax(100);
	}

	private LineChartModel initCategoryModel() {
		LineChartModel model = new LineChartModel();

		ChartSeries boys = new ChartSeries();
		boys.setLabel("Real");
		boys.set("Semana 1", random.nextInt((max - min) + 1) + min);
		boys.set("Semana 2", random.nextInt((max - min) + 1) + min);
		boys.set("Semana 3", random.nextInt((max - min) + 1) + min);
		boys.set("Semana 4", random.nextInt((max - min) + 1) + min);
		boys.set("Semana 5", random.nextInt((max - min) + 1) + min);
		boys.setXaxis(AxisType.X);

		ChartSeries girls = new ChartSeries();
		girls.setLabel("Minimo");
		girls.set("Semana 1", 70);
		girls.set("Semana 2", 70);
		girls.set("Semana 3", 70);
		girls.set("Semana 4", 70);
		girls.set("Semana 5", 70);

		model.addSeries(girls);
		model.addSeries(boys);

		return model;
	}

}
