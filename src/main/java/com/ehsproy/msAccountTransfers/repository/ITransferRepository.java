package com.ehsproy.msAccountTransfers.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ehsproy.msAccountTransfers.model.Transfer;

public interface ITransferRepository extends ReactiveCrudRepository<Transfer, String>{

}
