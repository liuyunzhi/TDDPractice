package com.thoughtworks;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        game.start(100);

        String resultOf3 = game.getResultByIndex(3);
        String resultOf13 = game.getResultByIndex(13);
        String resultOf35 = game.getResultByIndex(35);

        assertThat(resultOf3, equalTo("Fizz"));
        assertThat(resultOf13, equalTo("Fizz"));
        assertThat(resultOf35, equalTo("Fizz"));
    }
}
