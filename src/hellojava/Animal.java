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
public class Animal {
    String name;
    int age;
    private String master;
    
    public Animal(){
        name = "Null";
        age = 000;
    }
    
    public void animalSound(){
        System.out.println("The animal make sound");
    }
    
    public String getName(){
        return master;
    }
    public void setName(String name){
        this.master = name;
    }
    
    void bark(){
        System.out.println("Wan Wan");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The Dog Say Wan Wan ...");
    }
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("The Cat say Meow Meow");
    }
}

abstract class Car
{
    public abstract void carBreak();
    public void carColor(){
        System.err.println("The color is red");
    }
}
class Mercide extends Car{
    public void carBreak(){
        System.err.println("The car is breaking");
    }
}