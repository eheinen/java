package com.richard.errors;

import org.springframework.http.HttpStatus;

@SuppressWarnings("serial")
public class NotFoundException extends RestHttpException {

	public NotFoundException() {
		super("Recurso n�o encontrado", HttpStatus.NOT_FOUND);
	}

}
