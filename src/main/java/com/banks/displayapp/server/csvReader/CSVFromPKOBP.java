package com.banks.displayapp.server.csvReader;

import com.banks.displayapp.server.transaction.Transaction;

public class CSVFromPKOBP implements CSVFromBank{
    public Transaction createTransactionRecord(String[] data) {
        String accountNumber = "accountNumber";
        String date = data[0];
        String transactionType = data[2];
        String correspondent = "correspondent";
        String description = data[6];
        String amount = data[3];

        return new Transaction(accountNumber, date, transactionType,
                correspondent, description, amount);
    }
}
