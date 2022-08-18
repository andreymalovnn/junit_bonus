package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackServiceTest {

    @Test
    public void shouldReturn50WhenAmountIs950() {
        CashbackService service = new CashbackService();
        int amount = 950;
        int actual = service.remain(amount);
        int expected = 50;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnNothingWhenAmountIs1000() {
        CashbackService service = new CashbackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}