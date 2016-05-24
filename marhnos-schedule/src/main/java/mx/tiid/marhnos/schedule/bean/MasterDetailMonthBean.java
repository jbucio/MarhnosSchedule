package mx.tiid.marhnos.schedule.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.MeterGaugeChartModel;

@ManagedBean
@ViewScoped
public class MasterDetailMonthBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MeterGaugeChartModel meterGaugeModel;
	private BarChartModel barModel;

	private Random random;

	private int max = 100;

	private int min = 0;

	@PostConstruct
	public void init() {
		random = new Random();
		createMeterGaugeModels();
		createBarModels();
	}

	private void createMeterGaugeModels() {
		meterGaugeModel = initMeterGaugeModel();
		meterGaugeModel.setTitle("5 s");
		// meterGaugeModel.setGaugeLabel("km/h");

	}

	private MeterGaugeChartModel initMeterGaugeModel() {
		List<Number> intervals = new ArrayList<Number>() {
			{
				add(25);
				add(50);
				add(75);
				add(100);
			}
		};

		return new MeterGaugeChartModel(random.nextInt((100 - 38) + 1) + 38, intervals);
	}

	private void createBarModels() {
		createBarModel();
	}

	private void createBarModel() {

		barModel = initBarModel();

		barModel.setTitle("Cumplimiento en Obra");
		barModel.setLegendPosition("ne");

		// Axis xAxis = barModel.getAxis(AxisType.X);
		// xAxis.setLabel("Gender");

		Axis yAxis = barModel.getAxis(AxisType.Y);
		yAxis.setLabel("% de Cumplimiento");
		yAxis.setMin(0);
		yAxis.setMax(100);
	}

	private BarChartModel initBarModel() {
		BarChartModel model = new BarChartModel();

		ChartSeries chart2 = new ChartSeries();
		chart2.setLabel("Legal");
		chart2.set(" ", random.nextInt((max - min) + 1) + min);
		model.setAnimate(true);
		model.addSeries(chart2);

		ChartSeries chart3 = new ChartSeries();
		chart3.setLabel("Calidad");
		chart3.set(" ", random.nextInt((max - min) + 1) + min);
		model.setAnimate(true);
		model.addSeries(chart3);

		ChartSeries chart4 = new ChartSeries();
		chart4.setLabel("Contratos");
		chart4.set(" ", random.nextInt((max - min) + 1) + min);
		model.setAnimate(true);
		model.addSeries(chart4);

		return model;
	}

	public MeterGaugeChartModel getMeterGaugeModel() {
		return meterGaugeModel;
	}

	public void setMeterGaugeModel(MeterGaugeChartModel meterGaugeModel) {
		this.meterGaugeModel = meterGaugeModel;
	}

	public BarChartModel getBarModel() {
		return barModel;
	}

	public void setBarModel(BarChartModel barModel) {
		this.barModel = barModel;
	}
}
