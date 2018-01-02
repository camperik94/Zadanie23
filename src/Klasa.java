
public class Klasa {
	private String nazwa;

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Klasa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public void funkcja() {
		int licznik = 0;
		
		for(int i = 0; i < nazwa.length(); i++) {
			if(Character.toString(nazwa.charAt(nazwa.length()-1)).equals(Character.toString(nazwa.charAt(i)))) {
				licznik++;
			}
		}
		System.out.println(licznik);
	}
}
