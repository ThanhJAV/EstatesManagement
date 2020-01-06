package com.estates.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.estates.dao.INewDAO;
import com.estates.model.NewModel;
import com.estates.service.INewService;

public class NewService implements INewService {

	@Inject
	private INewDAO newDao;
	
	
	@Override
	public List<NewModel> findByCategoryId(Long categoryid) {
		
		return newDao.findByCategoryId(categoryid);
	}

}
