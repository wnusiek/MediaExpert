package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
//    Integer id;
    private LocalDate orderDate;
    private Customer customer;
    private List<Item> basket;

    public Order(Customer customer) {
        this.basket = new ArrayList<>();
        this.customer = customer;
        this.orderDate = LocalDate.now();
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getBasket() {
        return basket;
    }

    public void addItem(Integer id, Integer quantity){
    
        //TODO wyszukać produkt po id, dodać do koszyka

    }

    public void removeItem(Item item){
        this.basket.remove(item);
    }

    public void sendOrder(){
        System.out.println("Data złożenia zamówienia: " + orderDate);
        System.out.println("Zamówione produkty: " + getBasket());
        System.out.println("zostały wysłane do " + customer.getName() +  "na adres: " + customer.getAddress());
    }

    public static void example(){
        ItemMockDAO dao = new ItemMockDAO();
        Customer customer1 = new Customer("Janusz Kowalski", "Krakowskie Przedmieście 20, 22-222 Pcim Dolny");
        dao.create(new Item(0,"Pendrive 128 GB", 20, 1000));
        dao.create(new Item(1,"Mysz USB", 40, 500));
        dao.create(new Item(2,"Laser TV Hisense", 22999, 5));

        Order order1 = new Order(customer1);
        order1.addItem(1, 3);
        order1.addItem(2,1);
        order1.sendOrder();
    }
}
