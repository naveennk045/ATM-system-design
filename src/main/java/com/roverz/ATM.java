package com.roverz;

import com.roverz.repositories.DataBase;

public class ATM {

    private static ATM instance = null;

    private ATM() {
    }

    public static ATM getInstance() {
        if (instance == null) {
            instance = new ATM();
        }
        return instance;
    }

    public void setupDateBases() {
        DataBase dataBase = new DataBase();

    }

}
