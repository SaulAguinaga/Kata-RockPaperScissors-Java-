package com.factoriaf5.rps.models;

public class Lizard extends Figure{
    public String check(Figure player2) {
        if(player2 instanceof Paper){
            return "Player1 WIN";
        }
        if (player2 instanceof Rock) {
            return "Player2 WIN";
        }
        if (player2 instanceof Scissors) {
            return "Player2 WIN";
        }
        if (player2 instanceof Lizard) {
            return "Draw";
        }
        if (player2 instanceof Spock) {
            return "Player1 WIN";
        }
        return null;
    }
}
