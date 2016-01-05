package com.kan.base.domain;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import org.springframework.hateoas.Identifiable;

@MappedSuperclass
public abstract class AbstractEntity implements Identifiable<String>, Serializable {

	private static final long serialVersionUID = 1L;

}
