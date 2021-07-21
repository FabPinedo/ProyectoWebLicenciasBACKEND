package com.example.demo.models.entity;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MAE_PAIS")
public class Pais implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int COD_PAIS;
	String NOM_PAIS;
	String NOM_ABR;
	String IND_PAIS_SIST;
	String COD_RTPS;
	int COD_REGISTRO;
	String Nacionalidad;
	String CAN_LIMITE_PERSONAL;
	String COD_PAIS_EM_DOC;
	String COD_RTPS_PED;



public int getCOD_PAIS() {
	return COD_PAIS;
}

public void setCOD_PAIS(int cOD_PAIS) {
	COD_PAIS = cOD_PAIS;
}

public String getNOM_PAIS() {
	return NOM_PAIS;
}

public void setNOM_PAIS(String nOM_PAIS) {
	NOM_PAIS = nOM_PAIS;
}

public String getNOM_ABR() {
	return NOM_ABR;
}

public void setNOM_ABR(String nOM_ABR) {
	NOM_ABR = nOM_ABR;
}

public String getIND_PAIS_SIST() {
	return IND_PAIS_SIST;
}

public void setIND_PAIS_SIST(String iND_PAIS_SIST) {
	IND_PAIS_SIST = iND_PAIS_SIST;
}

public String getCOD_RTPS() {
	return COD_RTPS;
}

public void setCOD_RTPS(String cOD_RTPS) {
	COD_RTPS = cOD_RTPS;
}

public int getCOD_REGISTRO() {
	return COD_REGISTRO;
}

public void setCOD_REGISTRO(int cOD_REGISTRO) {
	COD_REGISTRO = cOD_REGISTRO;
}

public String getNacionalidad() {
	return Nacionalidad;
}

public void setNacionalidad(String nacionalidad) {
	Nacionalidad = nacionalidad;
}




public String getCAN_LIMITE_PERSONAL() {
	return CAN_LIMITE_PERSONAL;
}

public void setCAN_LIMITE_PERSONAL(String cAN_LIMITE_PERSONAL) {
	CAN_LIMITE_PERSONAL = cAN_LIMITE_PERSONAL;
}

public String getCOD_PAIS_EM_DOC() {
	return COD_PAIS_EM_DOC;
}

public void setCOD_PAIS_EM_DOC(String cOD_PAIS_EM_DOC) {
	COD_PAIS_EM_DOC = cOD_PAIS_EM_DOC;
}


public String getCOD_RTPS_PED() {
	return COD_RTPS_PED;
}

public void setCOD_RTPS_PED(String cOD_RTPS_PED) {
	COD_RTPS_PED = cOD_RTPS_PED;
}




@Override
public String toString() {
	return "Pais [COD_PAIS=" + COD_PAIS + ", NOM_PAIS=" + NOM_PAIS + ", NOM_ABR=" + NOM_ABR + ", IND_PAIS_SIST="
			+ IND_PAIS_SIST + ", COD_RTPS=" + COD_RTPS + ", COD_REGISTRO=" + COD_REGISTRO + ", Nacionalidad="
			+ Nacionalidad + ", CAN_LIMITE_PERSONAL=" + CAN_LIMITE_PERSONAL + ", COD_PAIS_EM_DOC=" + COD_PAIS_EM_DOC
			+ ", COD_RTPS_PED=" + COD_RTPS_PED + "]";
}



	
}

