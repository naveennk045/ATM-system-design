package com.roverz.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class Account {

    private static final AtomicLong accountCount = new AtomicLong(0);
    private final long accountId;
    private String accountNumber;
    private User user;
    private AccountType accountType;
    private final List<Card> cards;

    public Account(String accountNumber, User user, AccountType accountType) {
        this.accountId = accountCount.incrementAndGet();
        this.accountNumber = Objects.requireNonNull(accountNumber, "accountNumber cannot be null");
        this.user = Objects.requireNonNull(user, "user cannot be null");
        this.accountType = Objects.requireNonNull(accountType, "accountType cannot be null");
        this.cards = new ArrayList<>();
    }

    public static long getAccountCount() {
        return accountCount.get();
    }

    public long getAccountId() {
        return accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = Objects.requireNonNull(accountNumber, "accountNumber cannot be null");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = Objects.requireNonNull(user, "user cannot be null");
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = Objects.requireNonNull(accountType, "accountType cannot be null");
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    public void addCard(Card card) {
        if (card != null) {
            this.cards.add(card);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return accountId == account.accountId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountNumber='" + accountNumber + '\'' +
                ", user=" + user +
                ", accountType=" + accountType +
                ", cards=" + cards +
                '}';
    }
}
