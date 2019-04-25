package lv.lesson12.service;


import lv.lesson12.Product;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.Optional;



public class ProductServiceImpl implements ProductService {



    Map<Long, Product> repository = new HashMap<>();



    @Override

    public Long add(Product product) {

        return null;

    }



    @Override

    public Optional<Product> findBy(Long id) {

        return Optional.empty();

    }



    @Override

    public List<Product> findAll() {

        return null;

    }



    @Override

    public void deleteBy(Long id) {



    }

}