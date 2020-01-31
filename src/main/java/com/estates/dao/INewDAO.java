package com.estates.dao;

import java.util.List;

import com.estates.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {
	NewModel findOne(Long id);

	List<NewModel> findByCategoryId(Long categoryId);

	Long save(NewModel newModel);

	void update(NewModel updateNew);

	void delete(Long id);

}
