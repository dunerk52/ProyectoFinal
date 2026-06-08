/*
 * PROGRAMA: BANCO DE SANGRE
 * AUTORES: MICHAEL RESTREPO LACHE Y JUAN CAMILO PUENTES NAVARO
 * FECHA: 19 DE MAYO DE 2026 
 */

package bancodesangre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BancoSangre banco = new BancoSangre();

		int opcion;

		// BIENVENIDA
		System.out.println("========================================");
		System.out.println("     SISTEMA BANCO DE SANGRE");
		System.out.println("========================================");

		System.out.println("\nBienvenido al sistema de gestion");
		System.out.println("del Banco de Sangre Principal.");

		System.out.println("\nEste programa permite:");
		System.out.println("- Registrar donantes");
		System.out.println("- Buscar informacion");
		System.out.println("- Consultar compatibilidad");
		System.out.println("- Administrar inventario");
		System.out.println("- Guardar informacion automaticamente");

		System.out.println("\nTodos los datos quedan almacenados");
		System.out.println("aunque el programa se cierre.");

		System.out.println("\n========================================");

		do {

			System.out.println("\n============== MENU ==================");
			System.out.println("1. Registrar donante");
			System.out.println("2. Buscar donante");
			System.out.println("3. Mostrar donantes");
			System.out.println("4. Buscar compatibilidad");
			System.out.println("5. Mostrar inventario");
			System.out.println("6. Eliminar donante");
			System.out.println("7. Salir");
			System.out.println("======================================");

			System.out.print("Seleccione una opcion: ");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {

			case 1:

				System.out.println("\n===== REGISTRO DE DONANTE =====");

				System.out.print("Nombre: ");
				String nombre = sc.nextLine();

				System.out.print("Direccion: ");
				String direccion = sc.nextLine();

				System.out.print("Telefono: ");
				String telefono = sc.nextLine();

				System.out.print("Grupo sanguineo (A/B/AB/O): ");
				String grupo = sc.nextLine();

				System.out.print("RH (+ o -): ");
				String rh = sc.nextLine();

				Donante d = new Donante(nombre, direccion, telefono, grupo, rh);

				banco.registrarDonante(d);

				System.out.println("\nDonante registrado correctamente.");
				break;

			case 2:

				System.out.println("\n===== BUSCAR DONANTE =====");

				System.out.print("Ingrese nombre: ");

				String buscar = sc.nextLine();

				banco.buscarDonante(buscar);
				break;

			case 3:

				banco.mostrarDonantes();
				break;

			case 4:

				System.out.println("\n===== BUSCAR COMPATIBILIDAD =====");

				System.out.print("Grupo sanguineo: ");
				String g = sc.nextLine();

				System.out.print("RH: ");
				String r = sc.nextLine();

				banco.buscarCompatibilidad(g, r);
				break;

			case 5:

				banco.mostrarCantidadSangre();
				break;

			case 6:

				System.out.println("\n===== ELIMINAR DONANTE =====");

				System.out.print("Nombre del donante a eliminar: ");

				String eliminar = sc.nextLine();

				banco.eliminarDonante(eliminar);
				break;

			case 7:

				// DESPEDIDA
				System.out.println("\n========================================");
				System.out.println("      CERRANDO EL SISTEMA");
				System.out.println("========================================");

				System.out.println("\nGracias por utilizar el");
				System.out.println("Sistema Banco de Sangre.");

				System.out.println("\nLa informacion fue guardada");
				System.out.println("correctamente.");

				System.out.println("\nEsperamos verte nuevamente.");
				System.out.println("Hasta pronto.");

				System.out.println("\n========================================");
				break;

			default:

				System.out.println("\nOpcion invalida.");
			}

		} while (opcion != 7);

		sc.close();
	}
}