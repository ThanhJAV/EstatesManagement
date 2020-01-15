package com.estates.dao.impl;

import java.util.List;

import com.estates.dao.ICategoryDAO;
import com.estates.mapper.CategoryMapper;
import com.estates.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {

		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
		
	}
}
