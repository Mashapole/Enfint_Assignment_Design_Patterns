/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Shake_Smith
 */
public class FactoryObject {
    
    public Coffee getInstance(String obj)
    {
        if(!obj.isEmpty())
        {
           if(obj.equalsIgnoreCase("espresso"))
                 return new Espresso();
           else if(obj.equalsIgnoreCase("americano"))      
                 return new Americano(); 
        }
        return null; 
            
    }
}