package com.CadProd.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.CadProd.service.*;
import com.CadProd.models.*;

@Controller
public class ProductsController {	
	
	@Autowired
	private ProductServices service;
	
	@RequestMapping("/lista")
	public String viewhomepage (Model model) {
		List<ProductsModel> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		return "lista";
	}
	
	@RequestMapping("/cadastro")
	public String showNewProductPage(Model model) {
		ProductsModel product = new ProductsModel();
		model.addAttribute("product", product);
		return "cadastro";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name="id")int id) {
		ModelAndView mav = new ModelAndView("edit");
		ProductsModel product = service.get(id);
		mav.addObject("product", product);
	return mav;
	}
	
	@PostMapping (value = "/save")
	public String saveProduct(ProductsModel product) {
		service.save(product);
		return "redirect:/lista";
		
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name="id")int id) {
		service.delete(id);
		return "redirect:/lista";
}
}