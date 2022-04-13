package com.ehsproy.msAccountTransfers.service;

import com.ehsproy.msAccountTransfers.model.Transfer;

import reactor.core.publisher.Flux;

public interface ITransferService {

	Flux<Transfer> fibdByIdCustomer(String id);
}
