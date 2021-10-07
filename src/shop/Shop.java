/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.util.Calendar;
import java.util.GregorianCalendar;
import myclasses.Client;
import myclasses.History;
import myclasses.Product;

/**
 *
 * @author pupil
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setFirstname("Dmitrii");
        client1.setLastname("Pushkin");
        client1.setPhone("59965685");
        Client client2 = new Client();
        client2.setFirstname("Diana");
        client2.setLastname("Imarenko");
        client2.setPhone("542585659");
        
        Product product1 = new Product();
        product1.setProductName("Hleb chernqj");
        product1.setPublishedYear(2021);
       
        Product product2 = new Product();
        product2.setProductName("Limonad Buratino");
        product2.setPublishedYear(2021);
        
        
        History history1 = new History();
        Product Product1 = null;
        history1.setProduct(Product1);
        history1.setClient(client1);
        Calendar c = new GregorianCalendar();
        history1.setGivenDate(c.getTime());
        System.out.println("History1 = " +history1.toString());
        
        History history2 = new History();
        history2.setProduct(product2);
        history2.setClient(client2);
        c = new GregorianCalendar();
        history2.setGivenDate(c.getTime());
        System.out.println("History2 = " +history2.toString());
        c = new GregorianCalendar();
        history1.setReturnedDate(c.getTime());
        System.out.println("----------------------------------------------------");
        System.out.println("History1 = " +history1.toString());
        System.out.println("History2 = " +history2.toString());
    }
    
}
