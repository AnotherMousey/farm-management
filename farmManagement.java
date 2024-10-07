import java.util.ArrayList;

public class farmManagement {
    public static void getAnimal() {
        pig p = new pig();
        duck d = new duck();
        fish f = new fish();
        ArrayList<animal> animals = new ArrayList<>();

        animals.add(p);
        animals.add(d);
        animals.add(f);

        for (animal a : animals) {
            System.out.println(a.getName());
            if(a.isSwim()) {
                System.out.println("Can swim");
            } else {
                System.out.println("Cannot swim");
            }
            if(a.isWalk()) {
                System.out.println("Can walk");
            } else {
                System.out.println("Cannot walk");
            }
        }
    }

    public static void main(String[] args) {
        getAnimal();
    }
}
