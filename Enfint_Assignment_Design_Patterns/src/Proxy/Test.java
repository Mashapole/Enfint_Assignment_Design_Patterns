/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shake_Smith
 */
public class Test {
    public static void main(String[] args) throws Exception
    {
        Database db=new Proxy();
        
        try 
        {
            db.Database("mysqlserver");
            
        } 
        catch (Exception ex)
        {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
