/**
 * Kasus 3
 * Main Class
 * Sekaligus Class untuk mendefinisikan struktur data yang diperlukan Objek 
 * @author Ikram M B A (201511043)   
 */

package week4;


class KelasSatu {
	
	// init block
	{ 
		System.out.println(11);
	}
	
	//static block
	static { 
		System.out.println(2);
	}
	
	public KelasSatu(int i) {
		System.out.println(3);
	}
	
	public KelasSatu() {
		System.out.println(4);
	}
}

class KelasDua {

	{
		System.out.println(5);
	}
	
	public static void main(String[] args) {
		System.out.println(6);
		KelasSatu satu = new KelasSatu();
		KelasSatu dua = new KelasSatu(10);
	}

}

/**
 * Lesson Learned
 * 1. init block akan dipanggil lebih dulu daripada constructor. 
 *    a. Jika terdapat lebih dari satu constructor (constructor overloading) maka init block akan 
 *       dipanggil lebih dulu tiap constructor manapun dipanggil. 
 *    b. Jika terdapat lebih dari satu init block, maka seluruh init block akan dipanggil terlebih 
 *       dahulu sesuai urutannya, lalu baru dipanggil constructor.
 * 2. static block akan dipanggil tepat sekali saat kelas pertama kali digunakan. 
 *    a. static block dipanggil lebih dulu daripada init block. 
 *    b. static block juga bisa digunakan untuk melakukan inisialisasi terhadap variabel static.
 */

