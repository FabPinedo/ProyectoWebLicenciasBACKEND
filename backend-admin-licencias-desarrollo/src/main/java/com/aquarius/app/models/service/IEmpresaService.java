package com.aquarius.app.models.service;

import java.util.List;

import com.aquarius.app.models.entity.Empresa;



public interface IEmpresaService {
	public List<Empresa> findAll();

	public Empresa SaveEmpresa(Empresa empresa);

	public void deleteEmpresa(long id);

	public Empresa findById(long id);
}
