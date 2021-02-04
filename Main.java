package games;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        LightsOut game = new LightsOut(5);
        game.randomize();
        System.out.println(game);

        Scanner sc = new Scanner(System.in);
        while (!game.isSolved()) {
            try {
                System.out.println("x?");
                int x = sc.nextInt();
                System.out.println("y?");
                int y = sc.nextInt();
                try {
                    game.toggle(x, y);
                } catch (ArrayIndexOutOfBoundsException ha) {
                    System.out.println("Mimo hraci pole, zkus to znovu!");
                }
            }catch (InputMismatchException he){
                System.out.println("Prosim pis cisla ne slova!");
                sc.next();
            }
            System.out.println(game);
        }
    }
}
