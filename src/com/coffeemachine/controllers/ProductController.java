package com.coffeemachine.controllers;

import java.util.List;

import com.coffeemachine.interfaces.ProductDao;
import com.coffeemachine.models.Product;

public class ProductController implements ProductDao{

	@Override
	public String AddProduct(List<Product> products,Product product) throws Exception {
		if(product != null) {
			products.add(product);
			return "Product Added to the machine ! \n  ---------------- ";
		}else {
			return "Error while adding product !";
		}
	}
}
