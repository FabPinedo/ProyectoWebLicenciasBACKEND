package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Pais;

public interface IpaisDao extends CrudRepository<Pais,Integer>{
//Recordar repasar metodos de CRUDREPOSITORY
	//Aqui escribir cualquier logica del negocio q se requiera(query)
}
