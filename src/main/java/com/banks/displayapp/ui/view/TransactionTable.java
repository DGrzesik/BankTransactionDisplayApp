package com.banks.displayapp.ui.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TransactionTable {

    ObservableList<Transaction> transactions = FXCollections.observableArrayList();

    public void addTransactions(ObservableList<Transaction> transactions)
    {
        this.transactions=transactions;
    }

    public ObservableList<Transaction> getTransactions() {
        return transactions;
    }
}
