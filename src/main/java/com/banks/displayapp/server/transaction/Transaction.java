package com.banks.displayapp.server.transaction;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID uuid;
    private String accountNumber;
    private String correspondent;
    private String date;
    private String transactionType;
    private String amount;
    private String description;

    public Transaction(String accountNumber, String date, String transactionType,
                       String correspondent, String description, String amount) {
        this.accountNumber = accountNumber;
        this.date = date;
        this.transactionType = transactionType;
        this.correspondent = correspondent;
        this.description = description;
        this.amount = amount;
    }

    public Transaction() {
    }

    @Override
    public String toString() {
        return accountNumber + correspondent + date + transactionType  + amount + description ;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCorrespondent() {
        return correspondent;
    }

    public String getDate() {
        return date;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
