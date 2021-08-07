package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.RegDAO;
import com.demo.model.RegVO;

@Service
public class RegServiceImpl implements RegService{

	@Autowired RegDAO regDAO;
	
	@Transactional
	public void insert(RegVO regVO)
	{
		this.regDAO.insert(regVO);
	}
	
	
	@Transactional
	public List search()
	{
		return this.regDAO.search();
		
	}

	@Transactional
	public void delete(RegVO regVO)
	{
		this.regDAO.delete(regVO);
	}
	
	@Transactional
	public List edit(RegVO regVO)
	{
		return this.regDAO.edit(regVO);
	
	}

}
