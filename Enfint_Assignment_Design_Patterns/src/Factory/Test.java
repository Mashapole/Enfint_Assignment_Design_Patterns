/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

public class Test 
{
    public static void main(String[] args)
    {
        FactoryObject obj= new FactoryObject();
        Coffee cf=obj.getInstance("espresso");
        System.out.println(cf.factoryCall());
        
        cf=obj.getInstance("americano");
        System.out.println(cf.factoryCall());
    }
}
