public class Vehiculo {
	protected String marca;
	protected String modelo;
	private Menu menu;
	public Vehiculo(String marca, String modelo, Menu menu){
		this.marca = marca;
		this.modelo = modelo;
		this.menu = menu;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}