package com.keva.ProductApp.HomeController;

import com.keva.ProductApp.Model.Product;
import com.keva.ProductApp.Service.KevaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/keva")
public class KevaController {

    private KevaService KevaService;

    public KevaController(KevaService KevaService){
        this.KevaService=KevaService;
    }

    @PostMapping("/create")
    public String createProduct(@RequestBody Product product){
        KevaService.serveproduct(product);
        return "Saved successfully";

    }
    @GetMapping("/get/{id}")
    public Optional<Product> getProduct(@PathVariable Integer id){
        return KevaService.serveget(id);
    }
    @GetMapping("/getAll")
    public List<Product>getAllProducts(){
        return KevaService.servegetAll();
    }

}
