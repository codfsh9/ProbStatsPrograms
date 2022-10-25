import java.util.Arrays;

public class StatsMMM {

    //Method to calculate mean or average of array of numbers.
    public int Mean(int[] Mean) {
        int sum = 0;
        for (int i : Mean) {
            sum += i;
        }
        return sum / Mean.length;
    }

    //Method to calculate median for array of numbers.
    public int Median(int[] Median) {

        // Sort the Array.
        Arrays.sort(Median);

        // Check for even case.
        if (Median.length % 2 != 0)
            return Median[Median.length / 2];
        // Check for odd case.
        else {
            return (int) ((double) (Median[(Median.length - 1) / 2] + Median[Median.length / 2]) / 2);
        }
    }

    //Method to calculate mode or most frequent number in the array.
    public int Mode(int[] Mode) {
        int count = 0;
        int temp = 0;
        int value = 0;
        for (int i = 0; i < Mode.length - 1; i++) {

            while (Mode[i] > Mode[i + 1]) {
                Mode[i] = Mode[i + 1];

            }
        }
        for (int j = 0; j < Mode.length - 1; j++) {

            if (Mode[j] == Mode[j + 1]) {
                count++;
            }
            if (Mode[j] != Mode[j + 1]) {
                if (count > temp) {
                    temp = count;
                    value = Mode[j];
                }
            }
        }
        return value;
    }


}
