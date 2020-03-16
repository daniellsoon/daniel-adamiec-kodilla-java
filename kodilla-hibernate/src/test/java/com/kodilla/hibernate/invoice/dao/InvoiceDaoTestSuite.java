package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;
    private static final BigDecimal BIG_DECIMAL = new BigDecimal("100");

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("prod1");
        Product product2 = new Product("prod2");
        Product product3 = new Product("prod3");

        Item item1 = new Item(BIG_DECIMAL , 1);
        Item item2 = new Item(BIG_DECIMAL , 2);
        Item item3 = new Item(BIG_DECIMAL , 3);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        Invoice invoice = new Invoice("Invoice");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int product1Id = product1.getId();
        String actualNameOFProduct1 = product1.getName();
        int numberOfItems = invoice.getItems().size();
        int id = invoice.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);

        //Then
        Assert.assertTrue(readInvoice.isPresent());
        Assert.assertEquals("prod1", actualNameOFProduct1);
        Assert.assertNotEquals(0, product1Id);
        Assert.assertEquals(3, numberOfItems);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
