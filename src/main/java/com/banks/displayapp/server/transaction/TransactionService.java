package com.banks.displayapp.server.transaction;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }
    List<Transaction> getTransactions(){
        return transactionRepository.findAll();
    }

    public void addNewTransactions(List<Transaction> transactions) {
        transactionRepository.saveAll(transactions);
    }
}