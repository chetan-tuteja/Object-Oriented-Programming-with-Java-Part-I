/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
public class Person {
    private String name;
    private String numb;
    
    public Person(String name, String number) {
        this.name=name;
        this.numb=number;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getNumber() {
        return this.numb;
    }
    
    public String toString() {
        return this.name+" number: "+this.numb;
    }
    
    public void changeNumber(String newNumber) {
        this.numb=newNumber;
    }
    
    
}
