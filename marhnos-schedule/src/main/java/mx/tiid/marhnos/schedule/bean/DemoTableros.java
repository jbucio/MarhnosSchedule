package mx.tiid.marhnos.schedule.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

import mx.tiid.marhnos.schedule.model.DemoTablerosModel;

@ManagedBean(name = "demoTablero")
public class DemoTableros {

	private List<DemoTablerosModel> datosTablero;
	private List<DemoTablerosModel> filterDatosTablero;
	private String titulo = "titulo";

	private BarChartModel barModel;

	private int max = 50;

	private int min = 0;

	private Random random;

	@PostConstruct
	public void init() {

		random = new Random();
		createBarModels();
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		titulo = (String) sessionMap.get("somekey");

		sessionMap.remove("somekey");

		datosTablero = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			DemoTablerosModel tablero = new DemoTablerosModel();

			if (i < 15) {
				tablero.setPrioridad("Alta");
				tablero.setTipoActividad("Actividad" + i);
				tablero.setDescripcion("Inicio de colocación de cancelerias");
				tablero.setResponsable("Juan");
				tablero.setEmpresa("MARHNOS-OBRA");
				tablero.setFechaInicio("01/10/2015");
				tablero.setFechaFin("01/05/2016");
			} else {
				tablero.setPrioridad("Media");
				tablero.setTipoActividad("Actividad" + i);
				tablero.setDescripcion("Colocado de aluminio");
				tablero.setResponsable("Gabriel");
				tablero.setEmpresa("MARHNOS-OBRA");
				tablero.setFechaInicio("01/10/2015");
				tablero.setFechaFin("01/05/2016");
			}
			datosTablero.add(tablero);
		}

	}

	private BarChartModel initBarModel() {
		BarChartModel model = new BarChartModel();

		ChartSeries chart2 = new ChartSeries();
		chart2.setLabel("Completadas");
		chart2.set(" ", random.nextInt((max - min) + 1) + min);
		model.setAnimate(true);
		model.addSeries(chart2);

		ChartSeries chart3 = new ChartSeries();
		chart3.setLabel("No Completadas");
		chart3.set(" ", random.nextInt((max - min) + 1) + min);
		model.setAnimate(true);
		model.addSeries(chart3);

		;

		return model;
	}

	private void createBarModels() {
		createBarModel();
	}

	private void createBarModel() {

		barModel = initBarModel();

		barModel.setTitle("Actividades");
		barModel.setLegendPosition("ne");

		// Axis xAxis = barModel.getAxis(AxisType.X);
		// xAxis.setLabel("Gender");

		Axis yAxis = barModel.getAxis(AxisType.Y);
		yAxis.setLabel("N° de Actividades");
		yAxis.setMin(0);
		yAxis.setMax(50);
	}

	public List<DemoTablerosModel> getDatosTablero() {
		return datosTablero;
	}

	public void setDatosTablero(List<DemoTablerosModel> datosTablero) {
		this.datosTablero = datosTablero;
	}

	public List<DemoTablerosModel> getFilterDatosTablero() {
		return filterDatosTablero;
	}

	public void setFilterDatosTablero(List<DemoTablerosModel> filterDatosTablero) {
		this.filterDatosTablero = filterDatosTablero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public BarChartModel getBarModel() {
		return barModel;
	}

	public void setBarModel(BarChartModel barModel) {
		this.barModel = barModel;
	}
}
