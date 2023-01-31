package com.factoriaf5.rps.models;

public class Daza extends Figure {

    public String check(Figure player2) {
        if(player2 instanceof Scissors){
            return "Daza ALWAYS WIN";
        }
        if (player2 instanceof Rock) {
            return "Daza ALWAYS WIN";
        }
        if (player2 instanceof Paper) {
            return "Daza ALWAYS WIN";
        }
        if (player2 instanceof Lizard) {
            return "Daza ALWAYS WIN";
        }
        if (player2 instanceof Spock) {
            return "Daza ALWAYS WIN";
        }
        if (player2 instanceof Daza){
            return "Daza ALWAYS WIN";
        }
        return null;
    }
}
