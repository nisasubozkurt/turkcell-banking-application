package com.turkcell.banking.repository;

import com.turkcell.banking.model.Customer;
import com.turkcell.banking.model.Account;
import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    public List<Customer> customers = new ArrayList<>();
    public List<Account> accounts = new ArrayList<>();
}