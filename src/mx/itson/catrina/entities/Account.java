/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.util.List;



/**
 * Aqui se inicializan todas las variables necesarias para el funcionamiento del programa
 * @author GibsCAT11
 */
public class Account {
    
    private String product;
    private String account;
    private String clabe;
    private String currency;
    private Customer customer;
    private List<Transactions> transactions;
    private List<Transactions> transactionsOp;
   
   
    public Account deserializar(String json){
        
        Account deserializado = new Account();
        
        try{
            
            deserializado = new Gson().fromJson(json, Account.class);
            
        }catch(Exception ex){
            
            System.err.print("Ocurrió un error: " + ex.getMessage());
            
        }
        
        return deserializado;
        
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCostumer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setMovimientos(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    public List<Transactions> getTransactionsOp() {
        return transactionsOp;
    }

    public void setTransactionsOp(List<Transactions> transactionsOp) {
        this.transactionsOp = transactionsOp;
    }
    
}