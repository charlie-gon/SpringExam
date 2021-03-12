package com.company.product.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.product.ProductVO;
import com.company.product.SaleVO;
import com.company.product.service.ProductService;

@Service
public class productServiceImpl implements ProductService {
	
	@Autowired ProductMapper dao;

	public int insertProduct(ProductVO vo) {
		return dao.insertProduct(vo);
	}

	public List<ProductVO> getProductList(ProductVO vo) {
		return dao.getProductList(vo);
	}

	public Map<String, Object> getProduct(ProductVO vo) {
		return dao.getProduct(vo);
	}

	public int insertSale(SaleVO vo) {
		return dao.insertSale(vo);
	}

}
