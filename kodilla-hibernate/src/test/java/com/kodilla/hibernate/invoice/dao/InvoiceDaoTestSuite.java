package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;


    @Test
    void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("12345678");

        Product p1 = new Product("Paper");
        Product p2 = new Product("Staples");
        Product p3 = new Product("Toners");

        Item item1 = new Item(p1, new BigDecimal("0.25"), 55);
        Item item2 = new Item(p2, new BigDecimal("0.10"), 250);
        Item item3 = new Item(p3, new BigDecimal("45.99"), 4);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        invoice.setItems(itemList);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteAll();
    }
}