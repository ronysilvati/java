package com.algaworks.validation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Usuario {
	@NotNull
	@Size(min=5, max=20)
	private String nome;
	
	@NotNull
	@Size(min=5,max=40)
	private String sobrenome;
}
