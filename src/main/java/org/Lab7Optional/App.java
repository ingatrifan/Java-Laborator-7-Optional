package org.Lab7Optional;


public class App
{
    public static void main( String[] args )
    {
        Player player1 = new SmartPlayer("Maria",1);
        Player player2 = new ManualPlayer("Ion",2);
        Game game = new Game(player1,player2,3);
    }
}
