package org.example.springboottest.domain.transaction;

import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    Transaction findByNo(Long no);
}
