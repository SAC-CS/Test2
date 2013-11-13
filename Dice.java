/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Dice {

    private int dices;
    private int bounces;

    public Dice(int bounceNum) {
        bounces = bounceNum;
        dices = 1;
    }

    public Dice(int numDices, int numBounces) {
        bounces = numBounces;
        dices = numDices;
    }

    public int Throw() {
        int total = 0;
        int average = 0;
        int sumBounces = 0;
        for (int i = 0; i < dices; i++) {
            if (bounces == 1) {
                total += 1 + (int) (Math.random() * 5);
            } else {
                for (int j = 0; j < bounces; j++) {
                    sumBounces += 1 + (int) (Math.random() * 5);
                }
                average = sumBounces / bounces;
                total += average;
            }
        }
        return total;
    }

    public int Throw(int bounceNum) {
        int total = 0;
        int average = 0;
        int sumBounces = 0;
        for (int i = 0; i < dices; i++) {
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

