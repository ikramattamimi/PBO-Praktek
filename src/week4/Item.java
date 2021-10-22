/**
 * Kasus 2
 * Class untuk mendefinisikan struktur data yang diperlukan Objek Item
 * @author Ikram M B A (201511043)   
 */

package week4;

public class Item {
	private String name;
	private Item() {
		name = "Ipin";
	}
	public Item(String name /* "upin" akan disimpan di parameter ini */) {
		this(); // perubahan terjadi hanya pada baris ini
		System.out.println(this.name);
		
		// parameter name yang berisi "upin" tidak digunakan
		
		// perintah this() memanggil constructor Item()
		// konsep ini disebut consctructor chaining

	}
}
