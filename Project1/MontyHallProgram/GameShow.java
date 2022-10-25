import java.util.Random;

public class GameShow {
    int switchWins = 0;
    int stayWins = 0;
    int trials = 10000;
    Random rand = new Random();

    //Contestant does not switch curtains and wins prize
    public int StayWins() {

        for (int i = 1; i <= trials; i++) {
            int prizeCurtain = rand.nextInt(3);
            int contestantCurtain = rand.nextInt(3);

            if (prizeCurtain == contestantCurtain) {
                stayWins++;
            }
        }
        return stayWins;
    }


    //Contestant does switch curtains and wins prize
    public int SwitchWins() {

        for (int i = 1; i <= trials; i++) {
            int prizeCurtain = rand.nextInt(3);
            int contestantCurtain = rand.nextInt(3);

            int wrongCurtain = prizeCurtain;
            while (wrongCurtain == prizeCurtain || wrongCurtain == contestantCurtain) {
                wrongCurtain = rand.nextInt(3);
            }

            int differentCurtain = 3 - (contestantCurtain + wrongCurtain);

            if (differentCurtain == prizeCurtain) {
                switchWins++;
            }
        }
        return switchWins;
    }

    //Method to get percentage of contestant winning prize by NOT switching
    public double StayWinsP() {

        return (Math.floor(stayWins * 100.0f) / trials);
    }

    //Method to get percentage of contestant winning prize by switching
    public double SwitchWinsP() {
        return (Math.floor(switchWins * 100.0f) / trials);
    }
}

