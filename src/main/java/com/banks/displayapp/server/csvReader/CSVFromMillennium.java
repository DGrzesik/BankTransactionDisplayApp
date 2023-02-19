package com.banks.displayapp.server.csvReader;

import com.banks.displayapp.server.transaction.Transaction;

public class CSVFromMillennium implements CSVFromBank {
    public Transaction createTransactionRecord(String[] data) {
        String accountNumber = data[0];
        String date = data[1];
        String transactionType = data[3];
        String correspondent = data[5];
        String description = data[6];
        String amount = data[7];

        return new Transaction(accountNumber, date, transactionType,
                correspondent, description, amount);
    }
}
