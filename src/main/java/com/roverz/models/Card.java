package com.roverz.models;

public class Card {
    private String cardNumber;
    private String pin;
    private CardStatus cardStatus = CardStatus.ACTIVE;
    private CardType cardType;


    public Card(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public Card(String cardNumber, String pin, CardStatus cardStatus, CardType cardType) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cardStatus = cardStatus;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getPin() {
        return pin;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
