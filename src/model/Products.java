package model;

import javax.xml.catalog.Catalog;

public class Products {
    private long id;
    private String title;
    private int price;
    private Catalog catalog;

    public Products(long id, String title, int price, Сatalog catalog) {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", catalog=" + catalog +
                '}';
    }

    public Products(long id, String title, int price, Catalog catalog) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.catalog = catalog;

    }


}
