import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String tekst = in.nextLine();
		
		Klasa kla = new Klasa(tekst);
		
		kla.funkcja();
	}
}
