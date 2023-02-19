package com.banks.displayapp.server.csvReader;

import com.banks.displayapp.server.transaction.Transaction;

public class ReaderContext {
    private CSVFromBank csvReader;
    public void setReader(CSVFromBank csvReader){
        this.csvReader=csvReader;
    }
    public Transaction readCSVFile(String[] data){
        return this.csvReader.createTransactionRecord(data);
    }
}
