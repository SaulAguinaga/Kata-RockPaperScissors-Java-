package com.factoriaf5.rps.models;

public class Rock extends Figure{
    
    public String check(Figure player2) {
        if(player2 instanceof Scissors){
            return "Player1 WIN";
        }
        if (player2 instanceof Paper) {
            return "Player2 WIN";
        }
        if (player2 instanceof Rock) {
            return "Draw";
        }

        return null;
    }
}
