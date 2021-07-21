package com.aquarius.app.models.service;

import java.util.List;

import com.aquarius.app.models.entity.Sistema;



public interface ISistemaService {
	public List<Sistema> findAll();

	public Sistema SaveSistema(Sistema sistema);

	public void deleteSistema(long id);

	public Sistema findById(long id);
}
