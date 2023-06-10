package com.platzi.javatestmockito.player;

public class Player {

    private Dice dice;
    private  int nimNumberToWin;

    public Player(Dice dice, int nimNumberToWin) {
        this.dice = dice;
        this.nimNumberToWin = nimNumberToWin;
    }

    public boolean play(){
        int diceNumber =
                dice.roll();
        return diceNumber > nimNumberToWin;
    }

}
