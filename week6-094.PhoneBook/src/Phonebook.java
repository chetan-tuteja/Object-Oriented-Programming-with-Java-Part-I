/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> list = new ArrayList<Person>();

    public void add(String name, String number) {
        Person test = new Person(name, number);
        list.add(test);
    }

    public void printAll() {
        for (Person i : this.list) {
            System.out.println(i);
        }
    }

    public String searchNumber(String name) {
        for (Person i : this.list) {
            if (i.getName().contains(name)) {
                return i.getNumber();
            }
        }
        return "number not known";
    }

}
