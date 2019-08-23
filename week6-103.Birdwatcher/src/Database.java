
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chetan Tuteja
 */
public class Database {

    private ArrayList<Bird> list;

    public Database() {
        list = new ArrayList<Bird>();
    }

    public void addBird(Bird inBird) {
        list.add(inBird);
    }

    public void observation(String search) {
        boolean val = false;
        for (Bird i : this.list) {
            if (i.name().equalsIgnoreCase(search)) {
                i.counter();
                val = true;
            }
        }
        if (!val) {
            System.out.println("Is not a bird!");
        }
    }

    public void show(String name) {
        for (Bird i : this.list) {
            if (i.name().equals(name)) {
                System.out.println(i);
            }
        }
    }

    public void printAll() {
        for (Bird i : this.list) {
            System.out.println(i);
        }
    }
}
