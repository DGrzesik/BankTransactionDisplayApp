package com.banks.displayapp.ui.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.banks.displayapp.ui.view.ReceivedTransaction;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@RestController
public class Manager {

    private Client retrofitClient;

    @Autowired
    public Manager(Client retrofitClient) {
        this.retrofitClient = retrofitClient;
    }



    private ITransactionService getTransactionServiceImpl() {
        return retrofitClient.getRetrofitClient().create(ITransactionService.class);
    }

    public List<ReceivedTransaction> getAllTransactions() {
        ITransactionService service = getTransactionServiceImpl();
        Response<List<ReceivedTransaction>> response = null;
        try {
            response = service.getTransactions().execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.body();
    }



}