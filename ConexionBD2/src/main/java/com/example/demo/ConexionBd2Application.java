package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.models.entity.Pais;

@SpringBootApplication
public class ConexionBd2Application implements CommandLineRunner{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(ConexionBd2Application.class, args);
	}
	@Override
	public void run (String ...ars) throws Exception{
		String sql="Select * From MAE_PAIS";
		List<Pais>paises= jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Pais.class));
		System.out.print(paises.get(1).getNOM_PAIS());
	
		//paises.forEach(System.out:: println);
	}

}
