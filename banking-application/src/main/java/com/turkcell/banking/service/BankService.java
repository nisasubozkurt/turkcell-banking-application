package com.turkcell.banking.service;

import com.turkcell.banking.model.Customer;
import com.turkcell.banking.model.Account;
import com.turkcell.banking.repository.BankRepository;

public class BankService {
    private BankRepository repo = new BankRepository();

    public void addCustomer(String tc, String name) {
        if (findCustomer(tc) != null) {
            System.out.println("Hata: " + tc + " zaten kayıtlı. Mükerrer kayıt yasak!");
            return;
        }
        repo.customers.add(new Customer(tc, name));
        System.out.println("Müşteri başarıyla eklendi: " + name);
    }

    public void createAccount(String accountNumber, String tc) {
        // Önemli: Müşteri yoksa hesap açtırmıyoruz!
        if (findCustomer(tc) == null) {
            System.out.println("Hata: Sistemde " + tc + " numaralı müşteri yok. Önce müşteri ekle!");
            return;
        }
        repo.accounts.add(new Account(accountNumber, tc));
        System.out.println("Hesap açıldı: " + accountNumber + " (Sahibi: " + tc + ")");
    }

    // --- PARA TRANSFERİ (WOW EFEKTİ BURADA) ---
    public void transferMoney(String fromAccNo, String toAccNo, double amount) {
        Account sender = findAccount(fromAccNo);
        Account receiver = findAccount(toAccNo);

        if (sender != null && receiver != null) {
            if (sender.getBalance() >= amount) {
                sender.withdraw(amount); // Gönderenden eksilir
                receiver.deposit(amount); // Alıcıya eklenir
                System.out.println("Transfer başarılı! " + amount + " TL gönderildi.");
            } else {
                System.out.println("Hata: Gönderen hesapta yeterli bakiye yok!");
            }
        } else {
            System.out.println("Hata: Hesaplardan biri bulunamadı!");
        }
    }

    // Yardımcı Metotlar (Kodu temiz tutar)
    public Customer findCustomer(String tc) {
        for (Customer c : repo.customers) {
            if (c.getTc().equals(tc)) return c;
        }
        return null;
    }

    public Account findAccount(String accNo) {
        for (Account a : repo.accounts) {
            if (a.getAccountNumber().equals(accNo)) return a;
        }
        return null;
    }

    public void depositToAccount(String accountNumber, double amount) {
        Account acc = findAccount(accountNumber);
        if (acc != null) acc.deposit(amount);
        else System.out.println("Hesap yok!");
    }

    public void printAccountHistory(String accountNumber) {
        Account acc = findAccount(accountNumber);
        if (acc != null) acc.showHistory();
        else System.out.println("Hesap yok!");
    }
}
