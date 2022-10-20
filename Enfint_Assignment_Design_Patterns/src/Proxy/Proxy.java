/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shake_Smith
 */
public class Proxy implements Database{

    private Database data= new Connect();
    
    @Override
    public void Database(String dbName) throws Exception 
    {
       data.Database("localhost:8081/"+dbName);
    }
    
}
