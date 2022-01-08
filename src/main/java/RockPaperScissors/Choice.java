package RockPaperScissors;

import java.util.Arrays;
import java.util.Optional;

public enum Choice {
    ROCK("rock", "1"),
    SCISSORS("scissors", "2"),
    PAPER("paper", "3");

    private final String choice;
    private final String number;

    Choice(String choice, String number){
        this.choice = choice;
        this.number = number;
    }

    public String getChoice() {
        return choice;
    }

    public String getNumber() {
        return number;
    }

    public Optional<Choice> getChoiceString(String inputNumber) {
        return Arrays.stream(Choice.values())
                .filter(choice -> choice.number.equals(inputNumber))
                .findFirst();

    }
}
