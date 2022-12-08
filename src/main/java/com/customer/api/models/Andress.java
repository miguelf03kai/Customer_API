package com.customer.api.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Andress {
	@Id
	@Getter
	@Setter
	private String cep;
	@Getter
	@Setter
	private String logradouro;
	@Getter
	@Setter
	private String complemento;
	@Getter
	@Setter
	private String bairro;
	@Getter
	@Setter
	private String localidade;
	@Getter
	@Setter
	private String uf;
	@Getter
	@Setter
	private String ibge;
	@Getter
	@Setter
	private String gia;
	@Getter
	@Setter
	private String ddd;
	@Getter
	@Setter
	private String siafi;
}
