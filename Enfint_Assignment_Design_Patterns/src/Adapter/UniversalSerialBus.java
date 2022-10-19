/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;


public class UniversalSerialBus implements Computer{

    @Override
    public void Read() 
    {
        System.out.println("Read Information From USB");
    }
    
}
