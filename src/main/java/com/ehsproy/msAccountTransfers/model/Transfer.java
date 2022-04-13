package com.ehsproy.msAccountTransfers.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Transfer")
public class Transfer {

	@Id
	private String Id;
	private String idAccountOrigin;
	private String idAccountDestiny;
	private LocalDate operationDate;
	private String operationNumber;
	private Double amountTransfer;
	private String description;
	
}
