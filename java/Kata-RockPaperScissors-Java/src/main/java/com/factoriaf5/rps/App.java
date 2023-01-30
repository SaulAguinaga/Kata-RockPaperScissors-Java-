package com.factoriaf5.rps;

import com.factoriaf5.rps.application.Game;
import com.factoriaf5.rps.models.Player;


public class App 
{
    public static void main( String[] args )
    {
        Game game = new Game();
        String result;

        Player player1 = new Player();
        Player player2 = new Player();
        
        player1.setFigure(player2.choose("Spock"));
        player2.setFigure(player2.choose("Lizard"));

    result = game.checkResult(player1.getFigure(), player2.getFigure());
    
    System.out.println(result);
    }

}
