package kasus1;

import java.util.Scanner;

public class MenuMakanan {
	
	// create a new scanner
	Scanner keyboard = new Scanner(System.in);
	
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	private static byte id=0;
	
	public MenuMakanan() {
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama;
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
		nextId();
	}
	
	public void tampilMenuMakanan(){
		System.out.println("\n|ID|Stok|      Menu     |   Harga   |");
		for(int i =0; i<=id;i++){
			int id = i+1;
			if(!isOutOfStock(i)){
				System.out.println("|" + String.format("%2s", id) + "| " + String.format("%2s", stok[i]) +" |" + String.format("%-15s", nama_makanan[i]) + "|Rp. "+harga_makanan[i] + " |");
			}
		}
	}
	
	public boolean isOutOfStock(int id){
		if(stok[id] == 0){
			return true;
		}else{
			return false;
		}
	}
	public static void nextId(){
		id++;
	}
	
	public void pemesanan() {
		tampilMenuMakanan();
		System.out.print("\nMasukkan nomor makanan yang ingin dipesan: ");
		int id = keyboard.nextInt() - 1;
		System.out.print("Masukkan jumlah pesanan: ");
		int jumlah = keyboard.nextInt();
		kurangiStok(id, jumlah);
	}

	public void kurangiStok(int id, int pengurangan ) {
		this.stok[id] -= pengurangan;
	}
}
