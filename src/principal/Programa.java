package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Usuarios\\maycon\\Documentos\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("erro ao abrir arquivo " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Bloco finally executado");
		}

	}

	public void metodo1() {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * try { String[] vect = sc.nextLine().split(" "); int position = sc.nextInt();
		 * System.out.println(vect[position]); }catch(ArrayIndexOutOfBoundsException e)
		 * { System.out.println("Posição invalida"); }catch(InputMismatchException e) {
		 * System.out.println("Posição não pode ser uma letra"); }finally {
		 * System.out.println("Terminei; fechei o banco, fechei o arquivo"); }
		 * System.out.println("Fim do programa");
		 * 
		 * sc.close();
		 */
	}
}
