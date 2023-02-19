package com.banks.displayapp.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import com.banks.displayapp.ui.client.Client;
import com.banks.displayapp.ui.client.Manager;
import com.banks.displayapp.ui.view.TransactionDownloader;
import com.banks.displayapp.ui.view.TransactionTable;
import com.banks.displayapp.ui.view.TransactionTableController;

import java.io.IOException;

public class TransactionTableApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        var modelTable = new TransactionTable();
        Client client = new Client();
        Manager manager = new Manager(client);
        configureModel(modelTable,client,manager);
        try {
            var loader = new FXMLLoader();
            loader.setLocation(TransactionTableApp.class.getResource("/view/tableView.fxml"));
            BorderPane rootLayout = loader.load();

            TransactionTableController controller = loader.getController();
            controller.setModel(modelTable,client,manager);

            configureStage(primaryStage, rootLayout);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void configureStage(Stage primaryStage, BorderPane rootLayout) {
        var scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.setTitle("KoluniosBankonieros");
        primaryStage.minWidthProperty().bind(rootLayout.minWidthProperty());
        primaryStage.minHeightProperty().bind(rootLayout.minHeightProperty());
    }

    private void configureModel(TransactionTable transactionTable,Client client, Manager manager) {

        fillModelTable(transactionTable,client,manager);
    }

    private void fillModelTable(TransactionTable transactionTable,Client client,Manager manager) {
        var transactionDownloader = new TransactionDownloader(client,manager);
        transactionTable.addTransactions(transactionDownloader.getTransactions());
    }
}
