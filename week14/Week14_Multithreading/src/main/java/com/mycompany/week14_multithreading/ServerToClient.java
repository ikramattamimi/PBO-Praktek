/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week14_multithreading;

/**
 *
 * @author ikra8
 */
public class ServerToClient implements Runnable{
    private int threadNumber;
    
    public ServerToClient(int num){
        this.threadNumber = num;
    }
    
    @Override
    public void run(){
        System.out.println("Sending data to Client " + this.threadNumber );
    }
}
