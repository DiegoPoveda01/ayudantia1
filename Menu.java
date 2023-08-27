import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private Scanner scanner = new Scanner(System.in);

	public void iniciarMenu() {
		boolean continuar = true;

		while (continuar) {
			System.out.println("Menú Principal");
			System.out.println("1. Crear Auto");
			System.out.println("2. Crear Motocicleta");
			System.out.println("3. Ver Vehículos");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: ");

			int opcion = scanner.nextInt();
			scanner.nextLine(); // Consume el salto de línea

			switch (opcion) {
				case 1:
					System.out.print("Ingrese la marca del auto: ");
					String marcaAuto = scanner.nextLine();
					System.out.print("Ingrese el modelo del auto: ");
					String modeloAuto = scanner.nextLine();
					System.out.print("Ingrese el tipo de auto: ");
					String tipoAuto = scanner.nextLine();
					boolean contieneMaletero = leerBooleano("¿Contiene maletero? (si/no): ", scanner);
					boolean contienePuertas = leerBooleano("¿Contiene puertas? (si/no): ", scanner);
					anadirAuto(marcaAuto, modeloAuto, tipoAuto, contieneMaletero, contienePuertas);
					break;

				case 2:
					System.out.print("Ingrese la marca de la motocicleta: ");
					String marcaMoto = scanner.nextLine();
					System.out.print("Ingrese el modelo de la motocicleta: ");
					String modeloMoto = scanner.nextLine();
					System.out.print("Ingrese el tipo de motocicleta: ");
					String tipoMoto = scanner.nextLine();
					anadirMotocicleta(marcaMoto, modeloMoto, tipoMoto);
					break;

				case 3:
					verVehiculos();
					break;

				case 4:
					continuar = false;
					salirDeMenu();
					break;

				default:
					System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
					break;
			}
		}

		scanner.close();
	}

	public void anadirAuto(String marca, String modelo, String tipoAuto, boolean contieneMaletero, boolean contienePuertas) {
		Auto auto = new Auto(marca, modelo, this, tipoAuto, contieneMaletero, contienePuertas);
		vehiculos.add(auto);
	}

	public void anadirMotocicleta(String marca, String modelo, String tipoMotocicleta) {
		Motocicleta motocicleta = new Motocicleta(marca, modelo, this, tipoMotocicleta);
		vehiculos.add(motocicleta);
	}

	public void verVehiculos() {
		System.out.println("Lista de vehículos:");
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println("Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo());

			if (vehiculo instanceof Auto) {
				Auto auto = (Auto) vehiculo;
				String contieneMaletero = auto.getContieneMaletero() ? "si" : "no";
				String contienePuertas = auto.getContienePuertas() ? "si" : "no";
				System.out.println("Tipo de auto: " + auto.getTipoAuto() + ", Contiene Maletero: " + contieneMaletero + ", Contiene Puertas: " + contienePuertas);
			} else if (vehiculo instanceof Motocicleta) {
				Motocicleta motocicleta = (Motocicleta) vehiculo;
				System.out.println("Tipo de motocicleta: " + motocicleta.getTipoMotocicleta());
			}

			System.out.println("------------------------------");
		}
	}

	public void salirDeMenu() {
		System.out.println("Saliendo del menú...");
	}
	public boolean leerBooleano(String mensaje, Scanner scanner) {
		while (true) {
			System.out.print(mensaje);
			String entrada = scanner.nextLine().trim().toLowerCase();
			if (entrada.equals("si")) {
				return true;
			} else if (entrada.equals("no")) {
				return false;
			} else {
				System.out.println("Por favor, responda 'si' o 'no'.");
			}
}
	}
}
