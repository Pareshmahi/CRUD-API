package com.Project.App.service;

import com.Project.App.model.Product;
import com.Project.App.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<> (Arrays.asList(new Product(101,"phone",10000),
//            new Product(102,"mobile",15000),
//            new Product(103,"telphone",20000)));
    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
//        return products.stream()
//                .filter(p -> p.getProdId()== prodId)
//                .findFirst().orElse(new Product(100,"No item found",0));
    }

    public void addProduct(Product prod) {
        repo.save(prod);
//        products.add(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
//        int index=0;
//        for (int i = 0; i < products.size(); i++)
//            if (products.get(i).getProdId() == prod.getProdId())
//                index =i;
//
//        products.set(index,prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
//        int index=0;
//        for (int i = 0; i < products.size(); i++)
//            if (products.get(i).getProdId() == prodId)
//                index =i;
//        products.remove(index);
    }
}
