package com.estates.dao;

import java.util.List;

import com.estates.model.NewModel;

public interface INewDAO {
	List<NewModel> findByCategoryId(Long categoryId);
}
