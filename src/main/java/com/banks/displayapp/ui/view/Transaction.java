package com.banks.displayapp.ui.view;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Transaction {

    private StringProperty accountNumber;
    private StringProperty correspondent;
    private StringProperty date;
    private StringProperty transactionType;
    private StringProperty amount;
    private StringProperty description;

    public Transaction(String accountNumber, String date, String transactionType,
                       String correspondent, String description, String amount) {
        this.accountNumber = new SimpleStringProperty(accountNumber);
        this.date = new SimpleStringProperty(date);
        this.transactionType = new SimpleStringProperty(transactionType);
        this.correspondent = new SimpleStringProperty(correspondent);
        this.description = new SimpleStringProperty(description);
        this.amount = new SimpleStringProperty(amount);
    }

    public StringProperty getAccountNumberProperty() {
        return accountNumber;
    }

    public StringProperty getCorrespondentProperty() {
        return correspondent;
    }

    public StringProperty getDateProperty() {
        return date;
    }

    public StringProperty getTransactionTypeProperty() {
        return transactionType;
    }

    public StringProperty getAmountProperty() {
        return amount;
    }

    public StringProperty getDescriptionProperty() {
        return description;
    }

    @Override
    public String toString() {
        return accountNumber.get() + correspondent.get() + date.get() + transactionType.get()  + amount.get() + description.get() ;
    }
    public String getAccountNumber() {
        return accountNumber.get();
    }

    public String getCorrespondent() {
        return correspondent.get();
    }

    public String getDate() {
        return date.get();
    }

    public String getTransactionType() {
        return transactionType.get();
    }

    public String getAmount() {
        return amount.get();
    }

    public String getDescription() {
        return description.get();
    }
}
