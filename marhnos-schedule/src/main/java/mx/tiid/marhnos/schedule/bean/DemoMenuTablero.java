package mx.tiid.marhnos.schedule.bean;

import java.io.IOException;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name = "menuTablero")
public class DemoMenuTablero {
	
	private String tituloContrato = "CONTRATOS";
	private String tituloCompras =  "COMPRAS";
	private String tituloAdministra = "ADMINISTRACION";
	private String tituloSeguridad = "SEGURIDAD";
	@PostConstruct
	public void init() {
		
	}
	
	public void buttonAction(ActionEvent actionEvent) throws IOException {
        addMessage("Cargando!!");
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> sessionMap = ec.getSessionMap();
        sessionMap.put("somekey", tituloContrato);
       ec.redirect(ec.getRequestContextPath() + "/admin/demoTableros.xhtml");
    }
    
	public void buttonAction1(ActionEvent actionEvent) throws IOException {
        addMessage("Cargando!!");
        
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> sessionMap = ec.getSessionMap();
        sessionMap.put("somekey", tituloCompras);
       ec.redirect(ec.getRequestContextPath() + "/admin/demoTableros.xhtml");
    }
	public void buttonAction2(ActionEvent actionEvent) throws IOException {
        addMessage("Cargando!!");
        
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> sessionMap = ec.getSessionMap();
        sessionMap.put("somekey", tituloAdministra);
       ec.redirect(ec.getRequestContextPath() + "/admin/demoTableros.xhtml");
    }
	public void buttonAction3(ActionEvent actionEvent) throws IOException {
        addMessage("Cargando!!");
        
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> sessionMap = ec.getSessionMap();
        sessionMap.put("somekey", tituloSeguridad);
       ec.redirect(ec.getRequestContextPath() + "/admin/demoTableros.xhtml");
    }
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	public String getTituloContrato() {
		return tituloContrato;
	}

	public void setTituloContrato(String tituloContrato) {
		this.tituloContrato = tituloContrato;
	}

	public String getTituloCompras() {
		return tituloCompras;
	}

	public void setTituloCompras(String tituloCompras) {
		this.tituloCompras = tituloCompras;
	}

	public String getTituloAdministra() {
		return tituloAdministra;
	}

	public void setTituloAdministra(String tituloAdministra) {
		this.tituloAdministra = tituloAdministra;
	}

	public String getTituloSeguridad() {
		return tituloSeguridad;
	}

	public void setTituloSeguridad(String tituloSeguridad) {
		this.tituloSeguridad = tituloSeguridad;
	}

}
