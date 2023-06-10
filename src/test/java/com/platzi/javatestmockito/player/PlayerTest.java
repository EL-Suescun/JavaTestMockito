package com.platzi.javatestmockito.player;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;
public class PlayerTest {
    @Test
    public void looses_when_dice_number_is_too_low() {

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 2);
        assertEquals(false, player.play());
    }
}