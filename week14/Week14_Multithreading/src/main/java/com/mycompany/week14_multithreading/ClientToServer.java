/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week14_multithreading;

/**
 *
 * @author ikra8
 */
public class ClientToServer implements Runnable{
    private int threadNumber;
    
    public ClientToServer(int num){
        this.threadNumber = num;
    }
    
    @Override
    public void run(){
        System.out.println("Receiving data from Client " + this.threadNumber );
        
        
    }
}
