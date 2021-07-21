package com.aquarius.app.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.aquarius.app.models.entity.ContratoLicencia;

public interface IContratoLicenciaDao extends CrudRepository<ContratoLicencia, Long>{
	
	@Query(nativeQuery = true, value= "SELECT * FROM CONTRATO_LICENCIA A WHERE A.TOKEN = :token")
	public ContratoLicencia findByCodigo(@Param("token") String token);
	
}
