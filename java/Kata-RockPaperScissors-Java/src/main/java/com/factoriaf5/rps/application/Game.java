package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class Game {

    public Game() {
    }

    public String checkResult(Figure player1, Figure player2){
        if(player1 instanceof Rock){
            if(player2 instanceof Scissors){
                return "Player1 WIN";
            }
            if (player2 instanceof Paper) {
                return "Player2 WIN";
            }
            if (player2 instanceof Rock) {
                return "Draw";
            }
        }
        if(player1 instanceof Paper){
            if(player2 instanceof Scissors){
                return "Player2 WIN";
            }
            if (player2 instanceof Rock) {
                return "Player1 WIN";
            }
            if (player2 instanceof Paper) {
                return "Draw";
            }
        }
        if(player1 instanceof Scissors){
            if(player2 instanceof Paper){
                return "Player1 WIN";
            }
            if (player2 instanceof Rock) {
                return "Player2 WIN";
            }
            if (player2 instanceof Scissors) {
                return "Draw";
            }
        }
        
        return null;
    }
    
}
