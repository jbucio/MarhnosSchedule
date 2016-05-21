package mx.tiid.marhnos.schedule.model;
// Generated 25/04/2016 08:33:30 AM by Hibernate Tools 3.4.0.CR1

/**
 * Acumulados generated by hbm2java
 */
public class Acumulados implements java.io.Serializable {

	private Integer idAcumulado;
	private Reportes reportes;
	private Integer tipoAcumulado;
	private String nombre;
	private Integer semana;
	private Integer anio;
	private String totalAcumulado;

	public Acumulados() {
	}

	public Acumulados(Reportes reportes) {
		this.reportes = reportes;
	}

	public Acumulados(Reportes reportes, Integer tipoAcumulado, String nombre, Integer semana, Integer anio,
			String totalAcumulado) {
		this.reportes = reportes;
		this.tipoAcumulado = tipoAcumulado;
		this.nombre = nombre;
		this.semana = semana;
		this.anio = anio;
		this.totalAcumulado = totalAcumulado;
	}

	public Integer getIdAcumulado() {
		return this.idAcumulado;
	}

	public void setIdAcumulado(Integer idAcumulado) {
		this.idAcumulado = idAcumulado;
	}

	public Reportes getReportes() {
		return this.reportes;
	}

	public void setReportes(Reportes reportes) {
		this.reportes = reportes;
	}

	public Integer getTipoAcumulado() {
		return this.tipoAcumulado;
	}

	public void setTipoAcumulado(Integer tipoAcumulado) {
		this.tipoAcumulado = tipoAcumulado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSemana() {
		return this.semana;
	}

	public void setSemana(Integer semana) {
		this.semana = semana;
	}

	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getTotalAcumulado() {
		return this.totalAcumulado;
	}

	public void setTotalAcumulado(String totalAcumulado) {
		this.totalAcumulado = totalAcumulado;
	}

}
