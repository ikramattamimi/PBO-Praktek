/**
 * Program dengan Relationship Dependency
 * @author Ikram M B A
 * Referensi: https://repository.unikom.ac.id/51149/1/5.%20Relasi%20antar%20Kelas.pdf
 * */

package dependency;

class Baju{
	private String jenis;
	private char ukuran;
	
	Baju(String jenis, char ukuran){
		this.jenis = jenis;
		this.ukuran = ukuran;
	}
	
	public void getBaju() {
		System.out.println("\nBaju");
		System.out.println("Jenis  :" + this.jenis);
		System.out.println("Ukuran :" + this.ukuran);
	}
}

class Celana{
	private String jenis;
	private char ukuran;
	
	Celana(String jenis, char ukuran){
		this.jenis = jenis;
		this.ukuran = ukuran;
	}
	
	public void getCelana() {
		System.out.println("\nCelana");
		System.out.println("Jenis  :" + this.jenis);
		System.out.println("Ukuran :" + this.ukuran);
	}
}

class Orang{
	private String nama;
	
	Orang(String nama) {
		this.nama = nama;
	}
	
	public String getOrang() {
		return this.nama;
	}
	
	public void pakaian(Baju baju, Celana celana) {
		System.out.println(nama + " memakai pakaian:" );
		baju.getBaju();
		celana.getCelana();
	}
}

public class Main {

	public static void main(String[] args) {

		Baju baju1 = new Baju("Kaos", 'M');
		Celana celana1 = new Celana("Jeans", 'M');
		Orang orang1 = new Orang("Budi");
		
		orang1.pakaian(baju1, celana1);

	}

}
