package com.aquarius.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.aquarius.app.models.entity.Empresa;

public interface IEmpresaDao extends CrudRepository<Empresa, Long> {

}
