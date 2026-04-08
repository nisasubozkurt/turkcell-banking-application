package com.turkcell.banking.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerTc;
    private List<Transaction> transactions; // Bütün günahlarımızın (harcamaların) listesi

    public Account(String accountNumber, String customerTc) {
        this.accountNumber = accountNumber;
        this.customerTc = customerTc;
        this.balance = 0; // Hayata sıfırdan başlama garantili bakiye
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("PARA_YATIRMA", amount)); // Gelen para candır!
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("PARA_CEKME", amount));
        } else {
            // Klasik öğrenci/yazılımcı dramı:
            System.out.println("Yetersiz bakiye! " + accountNumber + " hesabı ağlıyor...");
        }
    }

    public void showHistory() {
        System.out.println("\n--- " + accountNumber + " Hesap Özeti (Neler Yaptık Neler...) ---");
        if (transactions.isEmpty()) {
            System.out.println("Buralar henüz ıssız, tek bir işlem bile yok.");
        } else {
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }
        System.out.println("Güncel Bakiye: " + balance + " TL (Hala artıda mıyız? Wow!)");
        System.out.println("--------------------------------");
    }

    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
}