public class Auto extends Vehiculo {
	private String tipoAuto;
	private boolean contieneMaletero;
	private boolean contienePuertas;

	public Auto(String marca, String modelo, Menu menu, String tipoAuto, boolean contieneMaletero, boolean contienePuertas) {
		super(marca, modelo, menu);
		this.tipoAuto = tipoAuto;
		this.contieneMaletero = contieneMaletero;
		this.contienePuertas = contienePuertas;
	}


	public String getTipoAuto() {
		return this.tipoAuto;
	}

	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
	}

	public boolean getContieneMaletero() {
		return this.contieneMaletero;
	}

	public void setContieneMaletero(boolean contieneMaletero) {
		this.contieneMaletero = contieneMaletero;
	}

	public boolean getContienePuertas() {
		return this.contienePuertas;
	}

	public void setContienePuertas(boolean contienePuertas) {
		this.contienePuertas = contienePuertas;
	}
}