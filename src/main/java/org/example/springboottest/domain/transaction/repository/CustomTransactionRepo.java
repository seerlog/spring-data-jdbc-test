package org.example.springboottest.domain.transaction.repository;

import org.example.springboottest.request.transaction.TransactionSearchRequest;
import org.springframework.data.domain.Page;

public interface CustomTransactionRepo {
    Page<TransactionSearchRequest> search(TransactionSearchRequest request);
}
