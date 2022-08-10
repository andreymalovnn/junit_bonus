package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        CashbackService service = new CashbackService();
        int result = service.remain(1800);
        System.out.println("For more cashback please add a purchase in the amount of " + result);
    }

}
