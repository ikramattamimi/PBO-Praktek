/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a_old;

/**
 *
 * @author ikra8
 */
public class MyGenericsTypeOld {

    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {
        MyGenericsTypeOld type = new MyGenericsTypeOld();
        type.set("Java");
        String str = (String) type.get();
    }

}
