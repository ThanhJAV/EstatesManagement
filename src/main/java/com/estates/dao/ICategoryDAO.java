package com.estates.dao;

import java.util.List;

import com.estates.model.CategoryModel;

public interface ICategoryDAO {
	List<CategoryModel> findAll();
}
