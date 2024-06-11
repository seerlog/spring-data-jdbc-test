package org.example.springboottest.domain.transaction.repository;

import org.example.springboottest.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
