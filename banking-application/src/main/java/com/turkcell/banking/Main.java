package com.turkcell.banking;

import com.turkcell.banking.service.BankService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankService service = new BankService();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Başlangıç örnekleri (Nisasu ve Halit yine sahnede)
        service.addCustomer("123", "Nisasu");
        service.addCustomer("456", "Halit");
        service.createAccount("ACC-NIS-01", "123");
        service.createAccount("ACC-HAL-01", "456");

        System.out.println("🏦 TURKCELL BANK V3.0 - TRANSFER MODÜLÜ AKTİF");

        while (running) {
            System.out.println("\n1-Ekle | 2-Hesap | 3-Yatır | 4-Transfer | 5-Özet | 0-Çıkış");
            System.out.print("Seçim: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("TC: "); String tc = scanner.nextLine();
                    System.out.print("İsim: "); String name = scanner.nextLine();
                    service.addCustomer(tc, name);
                    break;
                case 2:
                    System.out.print("Hesap No: "); String aNo = scanner.nextLine();
                    System.out.print("Müşteri TC: "); String aTc = scanner.nextLine();
                    service.createAccount(aNo, aTc);
                    break;
                case 3:
                    System.out.print("Hesap No: "); String dAcc = scanner.nextLine();
                    System.out.print("Miktar: "); double amt = scanner.nextDouble();
                    service.depositToAccount(dAcc, amt);
                    break;
                case 4:
                    // Transfer heyecanı!
                    System.out.print("Gönderen Hesap: "); String fAcc = scanner.nextLine();
                    System.out.print("Alıcı Hesap: "); String tAcc = scanner.nextLine();
                    System.out.print("Miktar: "); double tAmt = scanner.nextDouble();
                    service.transferMoney(fAcc, tAcc, tAmt);
                    break;
                case 5:
                    System.out.print("Hesap No: "); String hAcc = scanner.nextLine();
                    service.printAccountHistory(hAcc);
                    break;
                case 0:
                    running = false;
                    System.out.println("Banka kapatılıyor, paralar güvende!");
                    break;
            }
        }
        scanner.close();
    }
}