package cn.tf.jk.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tf.jk.dao.FactoryCDao;
import cn.tf.jk.pagination.Page;
import cn.tf.jk.po.FactoryC;
import cn.tf.jk.service.FactoryCService;

@Service
public class FactoryCServiceImpl implements FactoryCService{

	@Autowired
	private FactoryCDao  factoryCDao;
	
	
	
	
	@Override
	public List<FactoryC> findPage(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FactoryC> find(Map paraMap) {
		
		return factoryCDao.find(paraMap);
	}

	@Override
	public FactoryC get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(FactoryC entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(FactoryC entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}

}