package com.banks.displayapp.server.csvReader;

import com.banks.displayapp.server.transaction.Transaction;

public class CSVFromCitibank implements CSVFromBank {
    public Transaction createTransactionRecord(String[] data) {
        String accountNumber = "accountNumber";
        String date = data[0];
        String transactionType = data[7];
        String correspondent = "correspondent";
        String description = data[1];
        String amount = data[2];

        return new Transaction(accountNumber, date, transactionType,
                correspondent, description, amount);
    }
}
