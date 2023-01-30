package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class Game {

    public Game() {
    }

    public String checkResult(Figure player1, Figure player2){
        if(player1 instanceof Rock){
            return ((Rock) player1).check(player2);
        }
        if(player1 instanceof Paper){
            return ((Paper) player1).check(player2);
        }
        if(player1 instanceof Scissors){
            return ((Paper) player1).check(player2);
        }
        if(player1 instanceof Lizard){
            return ((Lizard) player1).check(player2);
        }
        if(player1 instanceof Spock){
            return ((Spock) player1).check(player2);
        }
        
        return null;
    }
    
}
