package com.factoriaf5.rps.application;


import com.factoriaf5.rps.models.Figure;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;


public class Game {


    public String checkResult(Figure player1, Figure player2){
        if(player1 instanceof Rock){
            return ((Rock) player1).check(player2);
        }
        if(player1 instanceof Paper){
            return ((Paper) player1).check(player2);
        }
        if(player1 instanceof Scissors){
            return ((Scissors) player1).check(player2);
        }
        return null;
    }
    
}
