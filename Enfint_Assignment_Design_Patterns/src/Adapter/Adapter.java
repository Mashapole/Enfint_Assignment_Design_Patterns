/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;


public class Adapter implements Computer{

    Memory m= new Memory();
    
    @Override
    public void Read() 
    {
     m.read();    
    }
}
