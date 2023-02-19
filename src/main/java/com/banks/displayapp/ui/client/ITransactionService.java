package com.banks.displayapp.ui.client;

import com.banks.displayapp.ui.view.ReceivedTransaction;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ITransactionService {

    @GET("/transactions")
    Call<List<ReceivedTransaction>> getTransactions();

}
