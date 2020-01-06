package com.estates.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.estates.dao.ICategoryDAO;
import com.estates.model.CategoryModel;
import com.estates.service.ICategoryService;

public class CategoryService implements ICategoryService{
	
//	private ICategoryDAO categoryDao;
//	
//	public CategoryService() {
//		categoryDao = new CategoryDAO();
//	}
	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		
		return categoryDao.findAll();
	}

}
