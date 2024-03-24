package com.sathya.orm.mapper;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sathya.orm.entity.Product;
import com.sathya.orm.model.ProductDetails;


@Component
public class ProductMapper {
	
	
      //This Method taking model class as input and return entity class as output	

	public Product modeltoEntityConversion(ProductDetails productDetails) {
		//read the data from model class set to entity class
		
		Product product = new Product();
		product.setProId(productDetails.getProId());
		product.setProName(productDetails.getProName());
		product.setProPrice(productDetails.getProPrice());
		product.setCreateBy(System.getProperty("user.name"));
	    product.setCreateAt(LocalDateTime.now());
		
		return product;
	}
	
	//This Method taking model 
	public List<Product> modeltoEntityListConversion(List<ProductDetails> productDetails){
		List<Product> products = new ArrayList<Product>();
		for(ProductDetails proDetail : productDetails) {
			Product product = new Product();
			product.setProId(proDetail.getProId());
			product.setProName(proDetail.getProName());
			product.setProPrice(proDetail.getProPrice());
			product.setCreateBy(System.getProperty("user.name"));
			product.setCreateAt(LocalDateTime.now());
			products.add(product);
		}
		
		return products;
		//
		
	 	
	}
	
	
}
