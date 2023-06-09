package com.lucasmurakami.course.services;

import com.lucasmurakami.course.entities.Product;
import com.lucasmurakami.course.entities.User;
import com.lucasmurakami.course.repositories.ProductRepository;
import com.lucasmurakami.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
