package com.product;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.product.controller.ProductController;
import com.product.dto.Product;

public class ProductControllerTest {

	@Test
	public void testAllProducts() {
		ProductController pc = new ProductController();
		List<Product> products = pc.getAllProducts();
		assertEquals(products.size(), 2);
	}
	@Test
	public void testProductById() {
		ProductController pc = new ProductController();
		Product product = pc.getProductById("1");
		//assertEquals(products.size(), 2);
		assertNotNull(product);
	}
	
	@Test
	public void testCreateNewProduct() {
		ProductController pc = new ProductController();
		Product product = new Product("Laptop", 10, 200);
		product = pc.createNewProduct(product);
		assertNotNull(product);
	}
	
	@Test
	public void testdeleteProduct() {
		ProductController pc = new ProductController();
		boolean result = pc.deleteProduct("2");
		assertEquals(result, true);
	}
}
