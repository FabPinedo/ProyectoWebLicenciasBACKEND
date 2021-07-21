package com.aquarius.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

import com.aquarius.app.models.entity.Empresa;
import com.aquarius.app.models.service.IEmpresaService;

@RestController
@RequestMapping("/Empresa")
@CrossOrigin(origins="*")
public class EmpresaController {
	@Autowired
	private IEmpresaService empresaService;
	
	@GetMapping("/find/listado")

	public List<Empresa> index() {
	return empresaService.findAll();
		}
	
	@GetMapping("/find/id/{id}")
	public ResponseEntity<?> show(@PathVariable long id){
		Empresa empresa= null;
		Map<String,Object> respuesta= new HashMap<>();
		try {
			 empresa=empresaService.findById(id);
			
		} catch (DataAccessException e) {
			// TODO: handle exception
			respuesta.put("Mensaje","Error al realizar la busqueda de datos");
			respuesta.put("error",e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(respuesta,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(empresa==null) {
			respuesta.put("Mensaje","La empresa de ID: ".concat(Long.toString(id).concat("  No existe en la base de datos")));
			return new ResponseEntity<Map<String,Object>>(respuesta,HttpStatus.NOT_FOUND);		
		}
	
	return new ResponseEntity<Empresa>(empresa, HttpStatus.OK);
		}
	
	@PostMapping("/post")
	public ResponseEntity<?> addEmpresa(@RequestBody Empresa empresa) {
		Empresa empresaNueva= null;
		Map<String,Object> respuesta= new HashMap<>();
		try {
			empresaNueva=empresaService.SaveEmpresa(empresa);
		} catch (DataAccessException e) {
			// TODO: handle exception
			respuesta.put("Mensaje","Error al realizar el insert en base de datos");
			respuesta.put("error",e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(respuesta,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		respuesta.put("Mensaje","Se ha creado con Exito la nueva empresa");
		respuesta.put("Empresa", empresaNueva);
		
		return new ResponseEntity<Map<String,Object>>(respuesta,HttpStatus.CREATED);
		}
	
	
	@DeleteMapping(value="/find/id/{id}")
	public ResponseEntity<?> eliminar(@PathVariable("id") long id) {
		Map<String,Object> respuesta= new HashMap<>();
		try {
			empresaService.deleteEmpresa(id);
		} catch (DataAccessException e) {
			// TODO: handle exception
			respuesta.put("Mensaje","Error al realizar el delete en base de datos");
			respuesta.put("error",e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(respuesta,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		respuesta.put("Mensaje","La Empresa ha sido eliminada!");
		return new ResponseEntity<Map<String,Object>>(respuesta,HttpStatus.OK);
			
		}
	
	@PutMapping("/find/id/{id}")
	public ResponseEntity<?> updateEmpresa(@RequestBody Empresa empresa,@PathVariable long id) {
		Empresa empresaActualizada=null;
		Map<String,Object> respuesta= new HashMap<>();
		Empresa empresaActual=empresaService.findById(id);
		if(empresaActual==null) {
			respuesta.put("Mensaje","La empresa de ID: ".concat(Long.toString(id).concat("  No existe en la base de datos")));
			return new ResponseEntity<Map<String,Object>>(respuesta,HttpStatus.NOT_FOUND);		
		}
		try {
			
			empresaActual.setCodigoruc(empresa.getCodigoruc());
			empresaActual.setRazonsocial(empresa.getRazonsocial());
			empresaActual.setNomcomercial(empresa.getNomcomercial());
			empresaActual.setNomempresa(empresa.getNomempresa());
			empresaActual.setFechabaja(empresa.getFechabaja());
			empresaActual.setIndbaja(empresa.getIndbaja());
			empresaActualizada=empresaService.SaveEmpresa(empresaActual);
		} catch (DataAccessException e) {
			// TODO: handle exception
			respuesta.put("Mensaje","Error al realizar la actualizacion en base de datos");
			respuesta.put("error",e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(respuesta,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		respuesta.put("Mensaje","Se actualizo con Exito la empresa");
		respuesta.put("Empresa", empresaActualizada);
		
		return new ResponseEntity<Map<String,Object>>(respuesta,HttpStatus.CREATED);
		
		
	}
}
