/*
 * PROGRAMA: BANCO DE SANGRE
 * AUTORES: MICHAEL RESTREPO LACHE Y JUAN CAMILO PUENTES NAVARO
 * FECHA: 19 DE MAYO DE 2026 
 */

package bancodesangre;

import java.io.*;
import java.util.ArrayList;

public class BancoSangre {

	private ArrayList<Donante> donantes;

	private final String archivo = "donantes.dat";

	public BancoSangre() {

		donantes = cargarDatos();
	}

	// Registrar donante
	public void registrarDonante(Donante d) {

		donantes.add(d);

		guardarDatos();
	}

	// Buscar donante
	public void buscarDonante(String nombre) {

		boolean encontrado = false;

		for (Donante d : donantes) {

			if (d.getNombre().equalsIgnoreCase(nombre)) {

				System.out.println("\n===== DONANTE ENCONTRADO =====");
				System.out.println(d);

				encontrado = true;
			}
		}

		if (!encontrado) {

			System.out.println("Donante no encontrado.");
		}
	}

	// Mostrar todos
	public void mostrarDonantes() {

		if (donantes.isEmpty()) {

			System.out.println("No hay donantes registrados.");
			return;
		}

		System.out.println("\n===== LISTA DE DONANTES =====");

		for (Donante d : donantes) {

			System.out.println(d);
			System.out.println("-------------------------");
		}
	}

	// Compatibilidad
	public void buscarCompatibilidad(String grupo, String rh) {

		boolean encontrado = false;

		for (Donante d : donantes) {

			if (d.getGrupoSanguineo().equalsIgnoreCase(grupo) && d.getRh().equalsIgnoreCase(rh)) {

				System.out.println("\n===== DONANTE COMPATIBLE =====");
				System.out.println(d);

				encontrado = true;
			}
		}

		if (!encontrado) {

			System.out.println("No hay coincidencias.");
		}
	}

	// Cantidad de sangre
	public void mostrarCantidadSangre() {

		String[] grupos = { "A", "B", "AB", "O" };

		String[] rhs = { "+", "-" };

		System.out.println("\n===== INVENTARIO =====");

		for (String g : grupos) {

			for (String r : rhs) {

				int contador = 0;

				for (Donante d : donantes) {

					if (d.getGrupoSanguineo().equalsIgnoreCase(g) && d.getRh().equals(r)) {

						contador++;
					}
				}

				System.out.println(g + r + ": " + contador);
			}
		}
	}

	// Eliminar donante
	public void eliminarDonante(String nombre) {

		boolean eliminado = false;

		for (int i = 0; i < donantes.size(); i++) {

			if (donantes.get(i).getNombre().equalsIgnoreCase(nombre)) {

				donantes.remove(i);

				guardarDatos();

				eliminado = true;

				System.out.println("Donante eliminado.");
				break;
			}
		}

		if (!eliminado) {

			System.out.println("No existe el donante.");
		}
	}

	// Guardar archivo
	private void guardarDatos() {

		try {

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));

			oos.writeObject(donantes);

			oos.close();

		} catch (IOException e) {

			System.out.println("Error guardando archivo.");
		}
	}

	@SuppressWarnings("unchecked")
	private ArrayList<Donante> cargarDatos() {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {

			return (ArrayList<Donante>) ois.readObject();

		} catch (Exception e) {

			return new ArrayList<>();
		}
	}
}
