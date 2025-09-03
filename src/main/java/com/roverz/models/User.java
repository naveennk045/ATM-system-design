package com.roverz.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class User {
    private static final AtomicLong userCount = new AtomicLong(0);
    private final long userId;
    private String userName;
    private String email;
    private String mobileNumber;
    private final List<Account> accounts;

    public User(String userName, String email, String mobileNumber, Account account) {
        this.userId = userCount.incrementAndGet();
        this.userName = Objects.requireNonNull(userName, "userName cannot be null");
        this.email = Objects.requireNonNull(email, "email cannot be null");
        this.mobileNumber = Objects.requireNonNull(mobileNumber, "mobileNumber cannot be null");
        this.accounts = new ArrayList<>();
        if (account != null) {
            this.accounts.add(account);
        }
    }

    public static long getUserCount() {
        return userCount.get();
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = Objects.requireNonNull(userName, "userName cannot be null");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Objects.requireNonNull(email, "email cannot be null");
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = Objects.requireNonNull(mobileNumber, "mobileNumber cannot be null");
    }

    public List<Account> getAccounts() {
        return Collections.unmodifiableList(accounts);
    }

    public void addAccount(Account account) {
        if (account != null) {
            this.accounts.add(account);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return userId == user.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
