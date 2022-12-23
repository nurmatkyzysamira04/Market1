import model.Costomer;
import model.Order;
import model.Products;
import model.Сatalog;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Products> product=new ArrayList<>();
        product.add(new Products(1,"meat",350, Сatalog.MEAT));
        product.add(new Products(2,"fish",400,Сatalog.MEAT));
        product.add(new Products(3,"grilled chicken",250,Сatalog.MEAT));

        product.add(new Products(4,"Coca kola",25,Сatalog.THE_DRINKS));
        product.add(new Products(5,"penci",30,Сatalog.THE_DRINKS));
        product.add(new Products(16,"fanta",35,Сatalog.THE_DRINKS));
        product.add(new Products(6,"water",20,Сatalog.THE_DRINKS));

        product.add(new Products(7,"milik",65,Сatalog.DAIRY_PRODUCTS));
        product.add(new Products(8,"cheese",124,Сatalog.DAIRY_PRODUCTS));
        product.add(new Products(9,"kefir",77,Сatalog.DAIRY_PRODUCTS));
        product.add(new Products(10,"yogurt",65,Сatalog.DAIRY_PRODUCTS));

        product.add(new Products(12,"medovik",550,Сatalog.COOKING));
        product.add(new Products(13,"ponchik",50,Сatalog.COOKING));
        product.add(new Products(14,"bulochka",45,Сatalog.COOKING));
        product.add(new Products(15,"liver",252,Сatalog.COOKING));

        ArrayList<Costomer> costomers=new ArrayList<>();
        costomers.add(new Costomer(20,"Samira Nurmat kyzy",5000));
        costomers.add(new Costomer(21,"Saikal Muratova",2500));
        costomers.add(new Costomer(22,"Syimyk Zairbekov",3000));
        costomers.add(new Costomer(23,"Ilim Shabdanov",5500));

        ArrayList<Сashier> cashiers=new ArrayList<>();
        cashiers.add(new Сashier(24,"Daniyar Nurbek uluu",1000));
        cashiers.add(new Сashier(25,"Kyzmonchok Nurlan kyzy",2000));
        cashiers.add(new Сashier(26,"Aiturgan Amirjanova",1500));
        cashiers.add(new Сashier(27,"Yryskeldi Mairambek uluu",4000));

        ArrayList<Order> orders=new ArrayList<>();
        orders.add(new Order(30,24,20,new long[]{2,4,6,14}));
        orders.add(new Order(31,25,21,new long[]{1,3,9,16,13}));
        orders.add(new Order(32,26,22,new long[]{8,11,7}));
        orders.add(new Order(33,27,23,new long[]{12,10,5}));

    }

}