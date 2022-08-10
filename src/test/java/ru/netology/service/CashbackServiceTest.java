package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackServiceTest {

    @Test
    public void shouldReturn300WhenAmountIs1700() {
        CashbackService service = new CashbackService();
        int amount = 1700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1000WhenAmountIs0() {
        CashbackService service = new CashbackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1000WhenAmountIs1000() {
        CashbackService service = new CashbackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1WhenAmountIs999() {
        CashbackService service = new CashbackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

}