package prem.SpringMvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ServiceLayer {

    @Autowired
    ProductDB db;
    /*public void show(){
        System.out.println("in show");
    }
*/


    public void addProduct(Product p){
    /*    products.add(p);*/
        db.save(p);
    }
    public List<Product> getAllProducts() {
        return db.findAll();
    }


    public Product getProduct(String name) {
        return db.findByName(name);
    }


}

 /*   List<Product> products = new ArrayList<>();


    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
        }
        return null;
    }

   *//* public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();
        for(Product p :products){
            String name =p.getName().toLowerCase();
            String type =p.getType().toLowerCase();
            String place =p.getPlace().toLowerCase();

            if(name.contains(str)|| type.contains(str)|| place.contains(str)){
                prods.add(p);
            }
        }
        return prods;
        }
        *//*
*/


