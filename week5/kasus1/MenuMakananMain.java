package kasus1;

public class MenuMakananMain {
	public static void main(String[] args) {
		MenuMakanan menu = new MenuMakanan();
		
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
//		MenuMakanan.nextId();
		
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
//		MenuMakanan.nextId();
		
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
//		MenuMakanan.nextId();
		
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		
//		menu.tampilMenuMakanan();
		menu.pemesanan();
		
		menu.tampilMenuMakanan();
	}
}


/**
 * Perubahan
 * 1. Nama class kurang sesuai dengan isi method pada class, 
 *    class Restaurant diganti dengan MenuMakanan, dan class RestaurantMain
 *    diganti dengan MenuMakananMain.
 * 2. Mengubah jenis data class dari public menjadi private
 * 3. Menambahkan pemanggilan method nextId() pada method tambahMenuMakanan
 *    agar tidak perlu dilakukan pemanggilan berulang kali pada class main
 * 4. Menyesuaikan method tampilMenuMakanan()
 * 5. Menambah method pemesanan() dan kurangiStok()
 * */
