package br.com.muralkidsweb.boot.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ESCOLAS")
public class Escola extends AbstractEntity<Long> {

}
