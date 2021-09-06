

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>  {

    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public boolean putFruits(T fruits) {
            return this.fruits.add(fruits);
    }

    public T getFruits(T fruit) {
        if (fruits.contains(fruit)){
            fruits.remove(fruit);
            return fruit;
        }
        return null;
    }

    public double getWeight(){
        double w =0;
        for (int i = 0; i < fruits.size(); i++) {
            w+=fruits.get(i).getWeight();
        }return w;
        }
    }

