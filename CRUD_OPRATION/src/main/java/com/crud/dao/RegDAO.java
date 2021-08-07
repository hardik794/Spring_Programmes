package com.crud.dao;

import java.util.List;

import com.crud.model.RegVO;

public interface RegDAO {

	public void insert(RegVO regVO);
	
	public List search();
	
	public void delete(RegVO regVO);
	
	public List edit(RegVO regVO);
	
}
