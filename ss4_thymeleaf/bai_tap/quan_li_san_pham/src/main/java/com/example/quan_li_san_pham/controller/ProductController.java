package com.example.quan_li_san_pham.controller;

import com.example.quan_li_san_pham.model.Product;
import com.example.quan_li_san_pham.service.IProductService;
import com.example.quan_li_san_pham.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    public String getProduct(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("productlist", productList);
        return "/home";
    }

    @GetMapping("/create")
    public String getCreateForm(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String createProduct(Product product) {
        productService.create(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/product";
    }

    @GetMapping("{id}/delete")
    public String delete(@PathVariable int id) {
        productService.remove(id);
        return "redirect:/product";
    }

    @GetMapping("/{id}/detail")
    public String getDetail(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/detail";
    }

    @GetMapping("/search")
    public String getSeach(@RequestParam("search") String search, Model model) {
        List<Product> productList = productService.findSearch(search);
        model.addAttribute("productlist", productList);
        return "/home";
    }
}
