package com.factoriaf5.rps.models;

public class Paper extends Figure{

    public String check(Figure player2) {
        if(player2 instanceof Scissors){
            return "Player2 WIN";
        }
        if (player2 instanceof Rock) {
            return "Player1 WIN";
        }
        if (player2 instanceof Paper) {
            return "Draw";
        }
        if (player2 instanceof Lizard) {
            return "Player2 WIN";
        }
        if (player2 instanceof Spock) {
            return "Player1 WIN";
        }
        return null;
    }
}
