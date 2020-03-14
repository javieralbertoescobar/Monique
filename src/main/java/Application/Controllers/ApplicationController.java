package Application.Controllers;

import Application.Model.Product;
import Application.Repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping(path = "/demo")
public class ApplicationController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewUser(@RequestParam Integer id, @RequestParam String name
            , @RequestParam Double price) {
        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setPrice(price);
        productRepository.save(p);
        return "Producto guardado exitosamente";

    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Product> getAllUsers() {
        // This returns a JSON or XML with the users
        return productRepository.findAll();
    }
}






