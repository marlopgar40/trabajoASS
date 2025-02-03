package dit.trabajo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class criteriosDNL implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Anatomia coherente con DNL")
	private java.lang.Boolean anatomico;
	@org.kie.api.definition.type.Label("sensibilidad de la zona compatible con DNL")
	private java.lang.Boolean sensitivo;
	@org.kie.api.definition.type.Label("Dimensionamiento de la zona afectada (menor que A4)")
	private Boolean dimensionamiento;

	private java.lang.Long id;

	private java.lang.Integer puntuacion;

	public criteriosDNL() {
	}

	public java.lang.Boolean getAnatomico() {
		return this.anatomico;
	}

	public void setAnatomico(java.lang.Boolean anatomico) {
		this.anatomico = anatomico;
	}

	public java.lang.Boolean getSensitivo() {
		return this.sensitivo;
	}

	public void setSensitivo(java.lang.Boolean sensitivo) {
		this.sensitivo = sensitivo;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}
	
	public void setPuntuacion(){
	    this.puntuacion = 	this.anatomico.compareTo(true) +
		                    this.sensitivo.compareTo(true) +
		                    this.dimensionamiento.compareTo(true);
	}

	public java.lang.Integer getPuntuacion() {
	    	    setPuntuacion();
		return this.puntuacion;
	}

	public void setPuntuacion(java.lang.Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	public java.lang.Boolean getDimensionamiento() {
		return this.dimensionamiento;
	}

	public void setDimensionamiento(java.lang.Boolean dimensionamiento) {
		this.dimensionamiento = dimensionamiento;
	}

	public criteriosDNL(java.lang.Boolean anatomico,
			java.lang.Boolean sensitivo, java.lang.Boolean dimensionamiento,
			java.lang.Long id, java.lang.Integer puntuacion) {
		this.anatomico = anatomico;
		this.sensitivo = sensitivo;
		this.dimensionamiento = dimensionamiento;
		this.id = id;
		this.puntuacion = puntuacion;
		
	}

}