package com.company.product.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.product.ProductVO;
import com.company.product.SaleVO;
import com.company.product.service.ProductService;
import com.fasterxml.jackson.databind.util.JSONPObject;

@Controller
public class ProductController {
	
	@Autowired ProductService prdService;
	
	@RequestMapping("getProductList")
	public String getProductList(ProductVO vo, Model model){
		model.addAttribute("list", prdService.getProductList(vo));
		return "product/getProductList";
	}
	
	@GetMapping("insertProduct")
	public String insertProduct(ProductVO vo) {
		return "product/insertForm";
	}
	
	@PostMapping("insertProduct")
	public String insertProductProc(ProductVO vo) {
		prdService.insertProduct(vo);
		return "redirect:getProductList";
	}
	
	@RequestMapping("/getProduct")
	@ResponseBody
	public Map getProduct(ProductVO vo) {
		Map<String, Object> map = prdService.getProduct(vo);
		return map;
	}
	
	// 문제3
	@RequestMapping("/insertSale")
	@ResponseBody
	public int insertSale(SaleVO vo) {
		int result = prdService.insertSale(vo);
		Map<String, Object> map = new HashMap<String, Object>();
		if(result != 0) {
			map.put("result", "true");
		}
		map.put("result", "false");
		return result;
	}

}
