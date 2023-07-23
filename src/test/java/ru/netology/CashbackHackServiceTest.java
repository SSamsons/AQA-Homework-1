package ru.netology;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void shouldHowMuchToAddFirst() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(500);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchToAddSecond() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchToAddThird() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchToAddFourth() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchToAddFifth() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchToAddSixth() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }}
