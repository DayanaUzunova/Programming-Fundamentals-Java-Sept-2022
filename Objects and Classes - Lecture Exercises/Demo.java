package Exercises;

import java.util.Random;

public class Demo {
    public static class Dice {
        private int sides;

        public int getSide() {
            return this.sides;
        }

        public void setSide(int side) {
            this.sides = side;
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();

        Dice dice = new Dice();
        dice.setSide(rnd.nextInt(10));

        System.out.println(dice.getSide());
    }
}