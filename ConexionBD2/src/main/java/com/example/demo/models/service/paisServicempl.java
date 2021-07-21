package com.example.demo.models.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.models.entity.Pais;

@Service
public class paisServicempl implements IpaisService{
	private IpaisService PaisDao;

	@Override
	@Transactional(readOnly = true)
	public List<Pais> findAll() {
		return (List<Pais>) PaisDao.findAll();
	}
	
}
