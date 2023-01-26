package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import org.junit.Test;

import com.factoriaf5.rps.models.Player;

public class GameTest {
    Game game = new Game();
    Player player1 = new Player();
    Player player2 = new Player();

    @Test
    public void test_checkResult(){
        
        player1.setFigure(player1.choose("Rock"));
        player2.setFigure(player2.choose("Scissors"));
        String result = game.checkResult(player1.getFigure(), player2.getFigure());

        assertEquals("Player1 WIN", result);
    }
}
