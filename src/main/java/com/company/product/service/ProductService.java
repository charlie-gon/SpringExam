package com.company.product.service;

import java.util.List;
import java.util.Map;

import com.company.product.ProductVO;
import com.company.product.SaleVO;

public interface ProductService {
	
	// 등록
	public int insertProduct(ProductVO vo);
	
	// 조회
	public List<ProductVO> getProductList(ProductVO vo);
	
	// 단건조회
	public Map<String, Object> getProduct(ProductVO vo);
	
	// 등록2
	public int insertSale(SaleVO vo);

}
