package Application.Controllers;

import Application.Model.Product;
import Application.Repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
public class ApplicationController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping(path = "/products") // Map ONLY POST Requests
    public String createProduct(@Valid @RequestBody Product p) {
        //p.setId(0);//este campo es auto incremental
        //p.setName(name);
        //p.setPrice(price);
        productRepository.save(p);
        return "Producto guardado exitosamente";

    }


   // @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/products")
    public Iterable<Product> getAllProducts() {
        // This returns a JSON or XML with the users
        return productRepository.findAll();
    }
}






