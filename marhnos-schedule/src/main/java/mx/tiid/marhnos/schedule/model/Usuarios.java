package mx.tiid.marhnos.schedule.model;
// Generated 25/04/2016 08:33:30 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios implements java.io.Serializable {

	private Integer idUsuario;
	private Areas areas;
	private String usuario;
	private String password;
	private String nombre;
	private String apaterno;
	private String amaterno;
	private Boolean activo;
	private Set actividadeses = new HashSet(0);

	public Usuarios() {
	}

	public Usuarios(Areas areas) {
		this.areas = areas;
	}

	public Usuarios(Areas areas, String usuario, String password, String nombre, String apaterno, String amaterno,
			Boolean activo, Set actividadeses) {
		this.areas = areas;
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.activo = activo;
		this.actividadeses = actividadeses;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Areas getAreas() {
		return this.areas;
	}

	public void setAreas(Areas areas) {
		this.areas = areas;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApaterno() {
		return this.apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public String getAmaterno() {
		return this.amaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Set getActividadeses() {
		return this.actividadeses;
	}

	public void setActividadeses(Set actividadeses) {
		this.actividadeses = actividadeses;
	}

}
