import java.util.Scanner;
import java.util.List;

// Menu v.20250208

public class Menu {

	// EJEMPLO DE USO
	public static void main(String[] args) {
		// Usamos un unico scanner para toda la app
		Scanner teclado = new Scanner(System.in);
		// Array con enunciado y opciones
		String[] opciones = {
				"Cabecera del enunciado:",
				"Opcion A",
				"Opcion B",
				"Opcion C"
		};
		// menu() nos devuelve un int con la opcion seleccionada
		System.out.println("Has seleccionado la opcion: " + Menu.menu(opciones, teclado));

		// guardamos la seleccion en una variable
		int seleccion = Menu.menu(opciones, teclado);

		// usamos switch para gestionar la respuesta del menu
		switch (seleccion) {
			// no hay un case 0
			case 1:
				System.out.println("opcion uno");
				break;
			case 2:
				System.out.println("opcion dos");
				break;
			case 3:
				System.out.println("opcion tres");
				break;
		}

		teclado.close();
	}

	// MUESTRA UN MENU CON LOS STRINGS DEL PARAMETRO (ARRAY)
	public static int menu(String[] opciones, Scanner teclado) {
		return mostrarMenu(opciones, teclado);
	}

	// SOBRECARGA PARA LISTA DE STRINGS
	public static int menu(List<String> opciones, Scanner teclado) {
		return mostrarMenu(opciones.toArray(new String[0]), teclado);
	}

	// LÓGICA COMPARTIDA
	private static int mostrarMenu(String[] opciones, Scanner teclado) {
		int retorno = -1;

		while (true) {
			System.out.println(opciones[0] + "\n");
			for (int i = 1; i < opciones.length; i++) {
				System.out.printf("   %d) %s%n", i, opciones[i]);
			}

			try {
				System.out.print("\n: ");
				retorno = Integer.parseInt(teclado.nextLine());

				if (retorno >= 1 && retorno < opciones.length) {
					break; // Opción válida
				} else {
					System.out.println("Opción no válida. Inténtalo de nuevo.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Entrada no válida. Inténtalo de nuevo.");
			}
		}
		return retorno;
	}
}
