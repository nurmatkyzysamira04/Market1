package model;

import java.util.Arrays;

public class Order {
    private long id;
    private long customerId;//кому продали
    private long employeeID;//кто продавец
    private long [] products;// список номеров прод.которые продали


    public Order(long id,long employeeID, long customerId, long[] products) {
        this.customerId = customerId;
        this.employeeID = employeeID;
        this.products = products;
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public long[] getProducts() {
        return products;
    }

    public void setProducts(long[] products) {
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", employeeID=" + employeeID +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
