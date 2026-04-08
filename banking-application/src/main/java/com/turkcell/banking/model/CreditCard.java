package com.turkcell.banking.model;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private String cardNumber;
    private double limit;
    private double currentDebt;
    private List<Transaction> cardTransactions;

    public CreditCard(String cardNumber, double limit) {
        this.cardNumber = cardNumber;
        this.limit = limit;
        this.currentDebt = 0;
        this.cardTransactions = new ArrayList<>();
    }

    public boolean spend(double amount) {
        if (currentDebt + amount <= limit) {
            currentDebt += amount;
            cardTransactions.add(new Transaction("KART_HARCAMA", amount));
            return true;
        }
        return false;
    }

    public void payDebt(double amount) {
        currentDebt -= amount;
        cardTransactions.add(new Transaction("KART_BORC_ODEME", amount));
    }

    public void showCardSummary() {
        System.out.println("\n--- Kredi Kartı: " + cardNumber + " ---");
        System.out.println("Limit: " + limit + " TL");
        System.out.println("Güncel Borç: " + currentDebt + " TL");
        System.out.println("Kalan Limit: " + (limit - currentDebt) + " TL");
    }

    public String getCardNumber() { return cardNumber; }
}
