package ru.netology.service;

import org.testng.annotations.Test;

import org.testng.Assert;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    void remain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void buyAProduct() {
        int amount = 1;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void fullAmount() {
        int amount = 1000;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void notPurchased() {
        int amount = 0;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
