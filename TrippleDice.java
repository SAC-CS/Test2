
/**
 *
 * @author user
 */
public class TrippleDice extends Dice {

    public TrippleDice(int bounceNum) {
        super(bounceNum);
    }

    @Override
    public int Throw(int bounceNum) {
        int total = 0;
        int average = 0;
        int sumBounces = 0;
        for (int i = 0; i < 3; i++) {
            if (bounceNum == 1) {
                total += 1 + (int) (Math.random() * 5);
            } else {
                for (int j = 0; j < bounceNum; j++) {
                    sumBounces += 1 + (int) (Math.random() * 5);
                }
                average = sumBounces / bounceNum;
                total += average;
            }
        }
        return total;
    }
}


