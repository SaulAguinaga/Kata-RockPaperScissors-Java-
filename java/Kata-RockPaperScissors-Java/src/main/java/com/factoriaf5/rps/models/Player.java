package com.factoriaf5.rps.models;

public class Player {

    private Figure figure;

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Figure choose(String string) {
        if(string.equals("rock")){
            return new Rock();
        }
        if(string.equals("paper")){
            return new Paper();
        }
        if(string.equals("scissors")){
            return new Scissors();
        }
        if(string.equals("lizard")){
            return new Lizard();
        }
        if(string.equals("spock")){
            return new Spock();
        }
        
        return null;
    }
    
}
