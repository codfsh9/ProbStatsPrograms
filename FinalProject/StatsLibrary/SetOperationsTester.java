import java.util.ArrayList;

public class SetOperationsTester {

    public static void main(String[] args) {
        //Create object
        SetOperations setOperations = new SetOperations();

        //Create List 1
        ArrayList<Integer> setA = new ArrayList<>(3);

        //Populate List 1
        for (int i = 0; i < 3; i++) {
            setA.add(i);
        }

        //Create List 2
        ArrayList<Integer> setB = new ArrayList<>(4);

        //Populate List 2
        for (int i = 0; i < 4; i++)
        {
            setB.add(i);
        }

        //Create Universal Set
        ArrayList<Integer> setUni = new ArrayList<>(7);
        for (int i = 0; i < 7; i++)
        {
            setUni.add(i);
        }

        //Print out lists
        System.out.println("Universal Set: " + setUni);
        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB + "\n");

        //Call methods
        System.out.println("A & B Union: " +   setOperations.unionOf(setA, setB));
        System.out.println("A & B Intersection: " + setOperations.intersectionOf(setA, setB));
        System.out.println("Complement of Set A: " + setOperations.complementOf(setUni, setA));

    }
}
