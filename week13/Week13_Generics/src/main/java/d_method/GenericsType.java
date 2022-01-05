/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d_method;

import b_class.*;

/**
 *
 * @author ikra8
 * @param <T>
 */
public class GenericsType<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        GenericsType<String> type = new GenericsType<>();
        type.set("Java"); //valid
        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Java"); //valid
        type1.set(10); //valid and autoboxing support
    }
}
