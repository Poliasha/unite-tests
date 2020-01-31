package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    void shouldCalculateCachback(int amount, int expected, String message){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual,message);
    }

    //    @Test
//    void shouldReturn100IfAmount900() {
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 900;
//        int actual = cashbackHackService.remain(amount);
//        int expected = 100;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void shouldReturnZeroIfAmount1000(){
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 1000;
//        int actual = cashbackHackService.remain(amount);
//        int expected = 0;
//        assertEquals(expected, actual);
//
//}
//
//    @Test
//    void shouldReturnValidCashBack(){
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 1100;
//        int actual = cashbackHackService.remain(amount);
//        int expected = 900;
//        assertEquals(expected, actual);
//    }

//    @Test
//    void shouldReturn1000IfAmount0(){
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 0;
//        int actual = cashbackHackService.remain(amount);
//        int expected = 1000;
//        assertEquals(expected, actual);
//    }

}