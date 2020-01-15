package com.estates.service;

import java.util.List;

import com.estates.model.NewModel;

public interface INewService {
	List<NewModel> findByCategoryId(Long categoryidNew);
	NewModel save(NewModel newModel);
	
}
