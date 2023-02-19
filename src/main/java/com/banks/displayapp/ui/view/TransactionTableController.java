package com.banks.displayapp.ui.view;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import com.banks.displayapp.ui.client.Client;
import com.banks.displayapp.ui.client.Manager;


public class TransactionTableController {
    private Client client;
    private Manager manager;
    @FXML
    private TableView<Transaction> modelTableView = new TableView<>();
    @FXML
    private TableColumn<Transaction, String> accountNumberCol;
    @FXML
    private TableColumn<Transaction, String> correspondentCol;
    @FXML
    private TableColumn<Transaction, String> dateCol;
    @FXML
    private TableColumn<Transaction, String> transactionTypeCol;
    @FXML
    private TableColumn<Transaction,String> amountCol;
    @FXML
    private TableColumn<Transaction, String> descriptionCol;

    @FXML
    public void initialize() {

        accountNumberCol.setCellValueFactory(
                new PropertyValueFactory<>("accountNumber"));


        correspondentCol.setCellValueFactory(
                new PropertyValueFactory<>("correspondent"));


        dateCol.setCellValueFactory(
                new PropertyValueFactory<>("date"));

        transactionTypeCol.setCellValueFactory(
                new PropertyValueFactory<>("transactionType"));


        amountCol.setCellValueFactory(
                new PropertyValueFactory<>("amount"));
        descriptionCol.setCellValueFactory(
                new PropertyValueFactory<>("description"));

    }

    public void setModel(TransactionTable transactionTable,Client client,Manager manager) {
        modelTableView.setItems(transactionTable.getTransactions());
        this.client=client;
        this.manager=manager;

    }
    @FXML
    private void refresh(ActionEvent event) {
        event.consume();
        TransactionTable transactionTable=new TransactionTable();
        var transactionDownloader = new TransactionDownloader(client,manager);
        transactionTable.addTransactions(transactionDownloader.getTransactions());
        modelTableView.setItems(transactionTable.getTransactions());
        modelTableView.refresh();

    }
}
