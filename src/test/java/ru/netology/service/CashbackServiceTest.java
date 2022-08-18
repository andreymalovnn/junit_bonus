package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

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
    public void shouldReturn1WhenAmountIs999() {
        CashbackService service = new CashbackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999WhenAmountIs1() {
        CashbackService service = new CashbackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
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