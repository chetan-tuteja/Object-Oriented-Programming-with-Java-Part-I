/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
public class Bird {

    private String name;
    private String latin;
    private int counter;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.counter = 0;
    }

    public String name() {
        return this.name;
    }

    public String latin() {
        return this.latin;
    }

    public void counter() {
        this.counter++;
    }

    public String toString() {
        return this.name + "(" + this.latin + "): " + this.counter + " observations";
    }
}
