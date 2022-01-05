/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c_interface;

import java.util.Arrays;

/**
 *
 * @author ikra8
 */
public class MyMain {

    public static void main(String[] args) {
        MyComparable[] mhs = {
            new MyComparable("John Doe", 201511049),
            new MyComparable("Ikram Muhammad Bukhori Attamimi", 201511043)
        };

        Arrays.sort(mhs);

        System.out.println("Sorted array \n" + Arrays.toString(mhs));
    }
}
