/**
 * Kasus 1
 * Class untuk mendefinisikan struktur data yang diperlukan Objek Barang
 * @author Ikram M B A (201511043)   
 */

package week4;

public class Barang {

	String kode_barang;
	String nama_barang;
	private int stok;
	
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
	
	// mutator method
	public void tambahStokMt() {
		this.stok += 20; 
	}
	
	// getter stok
	public int getStok() {
		return this.stok;
	}
	
	// accessor stok
	public int tambahStokAc() {
		return this.stok + 20;
	}

}
