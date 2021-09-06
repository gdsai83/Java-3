public class BigTask {

    public static void main(String[] args) {

        final Box<Fruit> b1 = new Box();
        final Box<Fruit> b2 = new Box();
        final Box<Fruit> b3 = new Box();

        b1.putFruits(new Apple());
        b1.putFruits(new Apple());
        b1.putFruits(new Apple());
        b1.putFruits(new Apple());
        b1.putFruits(new Apple());

        b2.putFruits(new Orange());
        b2.putFruits(new Orange());
        b2.putFruits(new Orange());

        b3.putFruits(new Apple());
        b3.putFruits(new Apple());
        b3.putFruits(new Apple());
        b3.putFruits(new Apple());
        b3.putFruits(new Apple());

        System.out.println(b1.getWeight());
        System.out.println(b2.getWeight());
        System.out.println(b3.getWeight());

    }

}
