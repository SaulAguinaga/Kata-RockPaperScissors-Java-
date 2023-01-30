package com.factoriaf5.rps;


import java.util.Scanner;

import com.factoriaf5.rps.application.Game;
import com.factoriaf5.rps.models.Player;


public class App 
{
    public static void main( String[] args )
    {
        Game game = new Game();
        String result;

        Player player1 = new Player();
        String election1="Spock";
        Player player2 = new Player();
        String election2="Lizard";

        Scanner teclado = new Scanner(System.in);
        System.out.print("\n\nPlayer 1 choose: Rock, Paper, Scissros, Lizard, Spock: \n\n");
        election1= teclado.nextLine().toLowerCase();
        System.out.println(election1);
       
        System.out.print("\n\nPlayer 2 choose: Rock, Paper, Scissros, Lizard, Spock: \n\n");
        election2 = teclado.nextLine().toLowerCase();
        teclado.close();
        player1.setFigure(player1.choose(election1));
        player2.setFigure(player2.choose(election2));

    result = game.checkResult(player1.getFigure(), player2.getFigure());
    
    System.out.println("\n\n" + result + "!!!!");
    }

}
