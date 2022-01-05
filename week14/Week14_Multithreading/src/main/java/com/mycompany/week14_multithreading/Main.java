/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week14_multithreading;

/**
 *
 * @author ikra8
 */
public class Main {
    public static void main (String [] args){
        System.out.println("=========================================");
        System.out.println("           Chat App Server Log");
        System.out.println("=========================================");
        for (int i = 0; i < 10; i++){
            ClientToServer class1 = new ClientToServer(i);
            ServerToClient class2 = new ServerToClient(i);
            Thread myThread = new Thread (class1);
            Thread myThread2 = new Thread (class2);
            myThread.start();
            myThread2.start();
        }
    }
}
