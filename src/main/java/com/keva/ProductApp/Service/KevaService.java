package com.keva.ProductApp.Service;

import com.keva.ProductApp.Model.Product;
import com.keva.ProductApp.Repository.KevaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KevaService {
    private KevaRepository KevaRepository;
    public KevaService(KevaRepository KevaRepository){
       this. KevaRepository =KevaRepository;
    }

    public String serveproduct(Product product){
        KevaRepository.save(product);
        return "saved Successfully";

    }
    public Optional<Product> serveget(Integer id){
        return KevaRepository.findById(id);

    }
    public List<Product>servegetAll(){
        return KevaRepository.findAll();
    }


}
