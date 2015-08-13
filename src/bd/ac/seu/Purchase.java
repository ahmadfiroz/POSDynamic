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
public class Purchase {
    private int puschaseId;
    private Supplier supplier;
    private Product  product;
    private LocalDate purchaseDate;
    private float quantiy;
    private double purchasePrice;

    public Purchase(int puschaseId, Supplier supplier, Product product, LocalDate purchaseDate, float quantiy, double purchasePrice) {
        this.puschaseId = puschaseId;
        this.supplier = supplier;
        this.product = product;
        this.purchaseDate = purchaseDate;
        this.quantiy = quantiy;
        this.purchasePrice = purchasePrice;
    }

    public int getPuschaseId() {
        return puschaseId;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public float getQuantiy() {
        return quantiy;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }
    
}
