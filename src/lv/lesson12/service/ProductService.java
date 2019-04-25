package lv.lesson12.service;

import lv.lesson12.Product;

import java.util.List;
import java.util.Optional;


public interface ProductService {

    //private Map<Long, Product> productService = new HashMap<>();

    Long addProduct(Product product);
    Optional<Product> findBy(Long id);
    List<Product> findAll();
    deleteBy(Long id);







}
