package com.banks.displayapp.ui.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.banks.displayapp.ui.client.Client;
import com.banks.displayapp.ui.client.Manager;

import java.util.List;
import java.util.stream.Stream;

public class TransactionDownloader {
    private Client client;
    private Manager manager;

    public TransactionDownloader(Client client, Manager manager) {
        this.client = client;
        this.manager = manager;
    }

    public ObservableList<Transaction> getTransactions() {
        List<ReceivedTransaction> receivedTransactions = manager.getAllTransactions();
        Stream<ReceivedTransaction> ts = receivedTransactions.stream();
        ObservableList<Transaction> transactions = FXCollections.observableArrayList();
        ts.forEach((t)->{
            Transaction transaction = new Transaction(t.getAccountNumber(), t.getDate(), t.getTransactionType(), t.getCorrespondent(), t.getDescription(), t.getAmount());
            transactions.add(transaction);
        });
        return transactions;
    }
}
