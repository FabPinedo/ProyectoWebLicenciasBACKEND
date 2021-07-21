package com.aquarius.app.models.service;

import java.util.List;

import com.aquarius.app.models.entity.ConexionServidor;



public interface IConexionServidorService {
	public List<ConexionServidor> findAll();

	public ConexionServidor SaveConexionServidor(ConexionServidor conexionServidor);

	public void deleteConexionServidor(long id);

	public ConexionServidor findById(long id);
}
