package com.factoriaf5.rps.models;

public class Player {

    private Figure figure;

    public Player() {
        
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Figure choose(String string) {
        if(string == "Rock"){
            return new Rock();
        }
        if(string == "Paper"){
            return new Paper();
        }
        if(string == "Scissors"){
            return new Scissors();
        }
        if(string == "Lizard"){
            return new Lizard();
        }
        if(string == "Spock"){
            return new Spock();
        }
        
        return null;
    }
    
}
