
package Singleton;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Singleton 
{
    private static Singleton obj=new Singleton();
    private static Logger logger=Logger.getLogger(Singleton.class.getName());
    
    private Singleton()
    {
        
    }
    
    public static void information(String n, Singleton sing)
    {
     logger.log(Level.INFO, "Class Name: \t"+n+"Intance: \t"+obj);
    }
        
    public static Singleton getInstance()
    {
        if(obj==null)
        {
           obj=new Singleton();
        }
    return obj;
    }
}
