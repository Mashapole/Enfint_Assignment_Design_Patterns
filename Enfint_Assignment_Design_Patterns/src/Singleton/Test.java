/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;


public class Test {
    private static String log1="FirstClass",log2="SecondClass";
    public static void main(String[] args)
    {
        
        Singleton a=Singleton.getInstance();
        Singleton b=Singleton.getInstance();
        
        a.information(log1, b);
        b.information(log2, b);
    }
    
}
