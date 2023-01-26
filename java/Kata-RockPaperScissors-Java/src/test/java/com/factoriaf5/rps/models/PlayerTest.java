package com.factoriaf5.rps.models;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlayerTest {
    private Player player1;
    private Player player2;

    public PlayerTest(){
        this.player1 = new Player();
        this.player2 = new Player();
    }

    @Test
    public void test_player_can_choose_Rock(){
        Figure rock = player1.choose("Rock");

        assertTrue(rock instanceof Rock);
    }

    @Test
    public void test_player_can_choose_Paper(){
        Figure paper = player2.choose("Paper");

        assertTrue(paper instanceof Paper);
    }

    @Test
    public void test_player_can_choose_Scissors(){
        Figure scissors = player1.choose("Scissors");

        assertTrue(scissors instanceof Scissors);
    }
}
