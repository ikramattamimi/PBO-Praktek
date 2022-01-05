/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c_interface;

/**
 *
 * @author ikra8
 */
public class MyComparable implements Comparable<MyComparable>{
	
	private String name;
	private int nim;
	
	public MyComparable(String name, int nim) {
		this.name = name;
		this.nim = nim;
	}
	public int getNim() {
		return nim;
	}
	public void setNim(int nim) {
		this.nim = nim;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public  int compareTo(MyComparable CI) {
		return this.name.compareTo(CI.name); 
	}
	
	@Override
	public String toString() {
		return "\nNIM: "+ this.nim + ", Name: " + this.name;
	}
}
