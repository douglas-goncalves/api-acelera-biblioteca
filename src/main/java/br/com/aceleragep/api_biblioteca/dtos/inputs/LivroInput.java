package br.com.aceleragep.api_biblioteca.dtos.inputs;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroInput {
	@NotBlank @Length(min = 1, max = 200)
	private String titulo;
	@NotBlank @Length(min = 4, max = 4)
	private String anoLancamento;
	@NotNull @Size(min = 1)
	private List<Long> autores;
}