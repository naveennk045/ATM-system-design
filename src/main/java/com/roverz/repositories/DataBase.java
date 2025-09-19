package com.roverz.repositories;

import com.roverz.models.Account;
import com.roverz.models.Card;
import com.roverz.models.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private final List<Account> accounts;
    private final List<User> users;
    private final List<Card> cards;

    public DataBase() {
        this.accounts = new ArrayList<>();
        this.users = new ArrayList<>();
        this.cards = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Card> getCards() {
        return cards;
    }
}
