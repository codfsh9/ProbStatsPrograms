import java.util.ArrayList;

public class SetOperations {

    //Union
    public ArrayList<Integer> unionOf(ArrayList<Integer> setA, ArrayList<Integer> setB) {
        ArrayList<Integer> result = new ArrayList<>();

        //Union logic

        //Loop through setA. If the element of setA is not in result, add element to result.
        for (int singleElement : setA) {
            //Check if single element is in result, if it isn't, add it.
            if (result.contains(singleElement)) {

            } else {
                result.add(singleElement);
            }
        }
        //Write second loop: Loop through setB. If the element of setB is not in result
        //add the element to result.
        for (int singleElement : setB) {
            if (result.contains(singleElement)) {

            } else {
                result.add(singleElement);
            }
        }

        return result;
    }

    //Intersection
    public ArrayList<Integer> intersectionOf(ArrayList<Integer> setA, ArrayList<Integer> setB) {
        ArrayList<Integer> result = new ArrayList<>(setA);

        //Intersection Logic
        result.retainAll(setB);

        return result;
    }

    //Complement
    public ArrayList<Integer> complementOf(ArrayList<Integer> universalSet, ArrayList<Integer> setA) {
        ArrayList<Integer> result = new ArrayList<>();

        //Complement Logic...everything in universal and NOT in A
        for (int singleElement : universalSet) {
            if (universalSet.contains(singleElement) && !setA.contains(singleElement)) {
                result.add(singleElement);
            }
        }

        return result;
    }
}