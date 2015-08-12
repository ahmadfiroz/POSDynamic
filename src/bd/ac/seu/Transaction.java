/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu;

import java.time.LocalDate;

/**
 *
 * @author Ahmad
 */
public class Transaction {
    private int transactionId;
    private LocalDate transactionDate;
    private Customer customer;
    private Product product;
    private float quantity;

    public Transaction(int transactionId, LocalDate transactionDate, Customer customer, Product product, float quantity) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        
    }

    public int getTransactionId() {
        return transactionId;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public float getQuantity() {
        return quantity;
    }
    
    
    
}
