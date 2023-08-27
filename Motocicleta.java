public class Motocicleta extends Vehiculo {
	private String tipoMotocicleta;

	public Motocicleta(String marca, String modelo, Menu menu, String tipoMotocicleta) {
		super(marca, modelo, menu);
		this.tipoMotocicleta = tipoMotocicleta;
	}

	public String getTipoMotocicleta() {
		return this.tipoMotocicleta;
	}

	public void setTipoMotocicleta(String tipoMotocicleta) {
		this.tipoMotocicleta = tipoMotocicleta;
	}
}