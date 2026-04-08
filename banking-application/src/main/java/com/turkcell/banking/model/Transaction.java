package com.turkcell.banking.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private String type; // para yatırma mı yoksa cüzdanın ağladığı para çekme mi?
    private double amount;
    private LocalDateTime date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now(); // İşlemin yapıldığı o acı/tatlı an
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return String.format("[%s] %-15s: %.2f TL", date.format(formatter), type, amount);
    }
}