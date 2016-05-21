package mx.tiid.marhnos.schedule.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import mx.tiid.marhnos.schedule.model.Areas;

@ManagedBean
public class AreaBean {
	
	private List<Areas> listAreas;
	private String []areas = {"Habitad","Contratos","Compras","Proyectos"};
	
	@PostConstruct
	public void init(){
		
		listarAreas();
	}

	private void listarAreas() {
		
		listAreas = new ArrayList<Areas>();
		
		for(int i = 0; i < areas.length; i++){
			Areas area = new Areas();
			
			area.setIdArea(i+1);
			area.setNombre(areas[i]);
			
			listAreas.add(area);

		}
	}

	public List<Areas> getListAreas() {
		return listAreas;
	}

	public void setListAreas(List<Areas> listAreas) {
		this.listAreas = listAreas;
	}

}
