/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package hellojava;

/**
 *
 * @author HP
 */
import java.util.*;

public class HelloJava {
    
    /**
     * @param args the command line arguments
     */      
    public static void main(String[] args) {
        HashMap<String,Integer> person = new HashMap<String,Integer>();
        person.put("John", 20);
        person.put("Ky", 19);
        person.put("Sol", 999);
        
        System.out.println(person);
        
        System.out.println(person.get("John"));
        
        System.out.println(person.size());
        
        System.out.println(person.remove("John"));
        
        person.put("Dizzy", 500);
        System.out.println();
        
        for(String i : person.keySet()){
            System.out.println(i);
        }
        
        System.out.println();
        
        for(int i : person.values()){
            System.out.println(i);
        }
        
        Integer myInt = 992;
        String myString = myInt.toString();
        System.out.println(myString.length());
    }
}
