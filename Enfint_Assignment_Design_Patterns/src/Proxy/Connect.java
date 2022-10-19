/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Shake_Smith
 */
public class Connect implements Database{

    @Override
    public void Database(String dbName) throws Exception 
    {
        //database connected to database
        System.out.println("Connected: "+dbName);
    }
    
}
