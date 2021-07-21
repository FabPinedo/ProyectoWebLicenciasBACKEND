package com.aquarius.app.models.service;

import java.util.List;

import com.aquarius.app.models.entity.ContratoLicencia;


public interface IContratoLicenciaService {
	
	public ContratoLicencia findById(Long id);
	public String exportJSONfindByCodigo(String token);
	public ContratoLicencia findByCodigo(String token);
	public String generateToken();
	public List<ContratoLicencia> findAll();
	public void deleteContrato(long id);
	public ContratoLicencia SaveContrato(ContratoLicencia contrato);
	
	
}
