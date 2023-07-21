package prem.SpringMvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {



    @Autowired
    ServiceLayer service;
    @GetMapping("/products")
    public List<Product> getAllProduct(){
           return service.getAllProducts();
    }

    @GetMapping(value = "/products/{name}")
    public Product getProduct(@PathVariable String name)
    {
        return  service.getProduct(  name);
    }
    @PostMapping("/product")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }



}
