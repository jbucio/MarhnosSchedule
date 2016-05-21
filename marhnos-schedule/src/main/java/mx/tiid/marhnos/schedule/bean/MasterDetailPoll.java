package mx.tiid.marhnos.schedule.bean;

import java.io.Serializable;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

@ManagedBean
@ViewScoped
public class MasterDetailPoll implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String areas[] = { "CONTRATOS", "HABITAD", "PROYECTOS", "COMPRAS" };

	private int position = 0;

	private String area;

	private int ppc;

	private Random random = new Random();

	private BarChartModel barModel;

	private int max = 50;

	private int min = 0;

	@PostConstruct
	public void init() {
		random = new Random();
		createBarModels();
	}

	private BarChartModel initBarModel() {
		BarChartModel model = new BarChartModel();

		ChartSeries chart2 = new ChartSeries();
		chart2.setLabel("Contratos");
		chart2.set(" ", random.nextInt((max - min) + 1) + min);
		model.setAnimate(true);
		model.addSeries(chart2);

		ChartSeries chart3 = new ChartSeries();
		chart3.setLabel("Falta Documentación");
		chart3.set(" ", random.nextInt((max - min) + 1) + min);
		model.setAnimate(true);
		model.addSeries(chart3);

		ChartSeries chart4 = new ChartSeries();
		chart4.setLabel("Sin Presupuesto");
		chart4.set(" ", random.nextInt((max - min) + 1) + min);
		model.setAnimate(true);
		model.addSeries(chart4);

		ChartSeries chart5 = new ChartSeries();
		chart5.setLabel("Proyectos");
		chart5.set(" ", random.nextInt((max - min) + 1) + min);
		model.setAnimate(true);
		model.addSeries(chart5);

		ChartSeries chart6 = new ChartSeries();
		chart6.setLabel("Contabilidad");
		chart6.set(" ", random.nextInt((max - min) + 1) + min);
		model.setAnimate(true);
		model.addSeries(chart6);

		return model;
	}

	private void createBarModels() {
		createBarModel();
	}

	private void createBarModel() {

		barModel = initBarModel();

		barModel.setTitle("Incumplimientos Semanal");
		barModel.setLegendPosition("ne");

		// Axis xAxis = barModel.getAxis(AxisType.X);
		// xAxis.setLabel("Gender");

		Axis yAxis = barModel.getAxis(AxisType.Y);
		yAxis.setLabel("N° Incumplimientos");
		yAxis.setMin(0);
		yAxis.setMax(50);
	}

	public void areaPosition() {

		ppc = random.nextInt((100 - 37) + 1) + 37;

		if (position < areas.length) {

			area = areas[position];
			position++;
		} else {
			position = 0;

			area = areas[position];
			position++;
		}

	}

	public int getPpc() {
		return ppc;
	}

	public void setPpc(int ppc) {
		this.ppc = ppc;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public BarChartModel getBarModel() {
		return barModel;
	}

	public void setBarModel(BarChartModel barModel) {
		this.barModel = barModel;
	}

}
