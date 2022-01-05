/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b_class;

/**
 *
 * @author ikra8
 */
public class MyGenericsType <T, U>{
    
    private T obj;
    private U obj1;
    
    MyGenericsType (T obj, U obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }

    public T getT() {
        return this.obj;
    }
    
    public U getU() {
        return this.obj1;
    }

    public void set(T obj) {
        this.obj = obj;
    }

    public static void main(String args[]) {
        MyGenericsType<String, Integer> weapon1 = 
                new MyGenericsType<>("Black Sword", 30);
        MyGenericsType<String, String> element1 = 
                new MyGenericsType<>("Lightning", "Fire" );
        
        System.out.println("Weapon 1 = " + weapon1.getT() + 
                ", Level " + weapon1.getU());
        System.out.println("Element  = " + element1.getT() + 
                ", " + element1.getU());
        
    }
}
