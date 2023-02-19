package com.banks.displayapp.server.csvReader;

import com.banks.displayapp.server.transaction.Transaction;
public interface CSVFromBank {

    Transaction createTransactionRecord(String[] data);

}
