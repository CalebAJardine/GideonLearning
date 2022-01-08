package RockPaperScissors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockPaperScissors {
    public void run() throws IOException {
        start();
        determineWinner(getInputFromPlayerOne(), generateSecondInput());
//        outputWinner();
    }

    private void start(){
        System.out.println("Welcome to Rock Paper Scissors");
        System.out.println("Please make a choice");
        System.out.println("\t1. Rock");
        System.out.println("\t2. Scissors");
        System.out.println("\t3. Paper");
    }

    private String getInputFromPlayerOne() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private String generateSecondInput() {
        Integer max = 3;
        Integer min = 1;
        Integer range = max - min + 1;

        Integer rand = (int) (Math.random() * range) + min;

        return rand.toString();
    }

    private String determineWinner(String playerOneInput, String playerTwoInput){
        return "";
    }
}
