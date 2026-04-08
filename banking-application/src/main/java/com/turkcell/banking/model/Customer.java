package com.turkcell.banking.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String tc;
    private String name;
    private List<Account> accounts;
    private List<CreditCard> creditCards;

    public Customer(String tc, String name) {
        this.tc = tc;
        this.name = name;
        this.accounts = new ArrayList<>();
        this.creditCards = new ArrayList<>();
    }

    public void addAccount(Account account) { accounts.add(account); }
    public void addCreditCard(CreditCard card) { creditCards.add(card); }

    public String getTc() { return tc; }
    public String getName() { return name; }
    public List<Account> getAccounts() { return accounts; }
    public List<CreditCard> getCreditCards() { return creditCards; }
}

