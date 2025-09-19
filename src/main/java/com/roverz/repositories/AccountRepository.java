package com.roverz.repositories;

import com.roverz.models.Account;
import com.roverz.models.User;

import java.util.ArrayList;
import java.util.List;


public class AccountRepository {

    private DataBase dataBase;

    public Account findByAccountNumber(String accountNumber) {
        List<Account> accounts = dataBase.getAccounts();

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public Account findByAccountId(int accountId) {
        List<Account> accounts = dataBase.getAccounts();
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        return null;
    }

    public List<Account> findAllAccountByUsers(User user) {
        List<Account> list = new ArrayList<>();
        for (Account account : dataBase.getAccounts()) {
            if (account.getUser().getUserId() == user.getUserId()) {
                list.add(account);
            }
        }
        return list;
    }
}
