/**
 * Kasus 1
 * Main Class
 * Berfungsi untuk mendefinisikan pembuatan, menampilkan, dan menambah objek-objek barang
 * @author Ikram M B A (201511043)
 */

package week4;

public class Inventori {

	Barang[] barangs;
	
	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10);
		barangs[1] = new Barang("002", "Celana", 20);
	}
	
	void showBarang() {
		// method untuk menampilkan stok barang diganti jadi menggunakan method getStok()
		// karena stok dijadikan variabel private
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	
	void pengadaan() {
		initBarang();
		
		// agar stok hanya bisa dilakukan operasi penjumlahan, digunakan method tambahStok()
		barangs[0].tambahStokMt();
		showBarang();
		
	}
	
	public static void main(String[] args) {
		Inventori beli = new Inventori();	
		System.out.println("Sebelum memanggil method pengadaan():");
		beli.initBarang();
		beli.showBarang();

		System.out.println("\nSesudah memanggil method pengadaan():");
		beli.pengadaan();
//		beli.showBarang();

	}

}

/** 
 * Lesson Learned
 * Accessor mengembalikan nilai yang telah diubah dari variabel private tanpa merubah 
 * isi dari variabel private
 * Mutator merubah nilai dari variabel private
 */



