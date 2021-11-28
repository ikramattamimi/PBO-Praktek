package kasus3;

import java.util.*;
import java.io.FileInputStream;
public class Main {


	public static void main (String [] args) {
//========================================================================================
//OPERASI PEMBAGIAN
//		int a = 100;
//		int b = 0;
//		try {
//		int hasilBagi = a/b;
//		System.out.println("Hasil pembagian dari "+ a +"/"+ b + " adalah " + hasilBagi);
//		}
//		catch(Exception e) {
//			System.out.println("Bilangan nol tidak bisa menjadi pembagi");
//		}
//========================================================================================
//OPERASI MELIBATKAN ARRAY
//		
//		int array[]= {4,5,3,45,8,0};
//		try {
//			for(int i=0; i<=10; i++) {
//				System.out.println("Nilai dari array ke "+ i + " adalah "+ array[i]);
//			}
//		}
//		catch (Exception e) {
//			System.out.println("Nilai dari index yang diinginkan tidak tersedia");
//		}
//========================================================================================
//TEXTFILD HANYA BOLEH INTEGER
//		Scanner keyboard = new Scanner (System.in);
//		try {
//			System.out.println("Masukkan pada textfield : ");
//			int bilInteger = keyboard.nextInt();
//			System.out.println("Output : "+ bilInteger);
//		}
//		catch(Exception e) {
//			System.out.println("Format Salah!! Masukkan bilangan Integer");
//		}
//========================================================================================
//PADA OPERASI FILE
//		FileInputStream file = null;
//		try {
//		file = new FileInputStream ("file.txt");
//		}
//		catch(Exception e) {
//			System.out.println("File Tidak Tersedia");
//		}
//========================================================================================
//VARIABLE REFERENCES BELUM DIINISIASI
		String  Hasil;
		 try {
			Hasil = new String();
			System.out.println("Hasilnya adalah " + Hasil);
		}
		catch (Exception e){
			System.out.println("Nilai belum diinisialisasi");
		}
	}
}
