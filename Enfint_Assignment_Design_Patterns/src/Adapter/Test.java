/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Shake_Smith
 */
public class Test {
    public static void main(String[] args)
    {
        Computer comp= new UniversalSerialBus();
        Computer cm=new Adapter();
        
        //reading using usb
        comp.Read();
        //reading using 
        cm.Read();
    }
}
