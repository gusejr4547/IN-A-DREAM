package com.dream.dream.transaction.repository;

import com.dream.dream.transaction.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findAllByBuyer_id(Long buyerId);
    List<Transaction> findAllBySeller_id(Long sellerId);


}