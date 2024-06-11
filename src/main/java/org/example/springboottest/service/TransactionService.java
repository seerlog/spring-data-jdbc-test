package org.example.springboottest.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.example.springboottest.domain.transaction.Transaction;
import org.example.springboottest.domain.transaction.repository.CustomTransactionRepo;
import org.example.springboottest.domain.transaction.repository.TransactionRepository;
import org.example.springboottest.response.transaction.TransactionResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
@Transactional
@RequiredArgsConstructor
public class TransactionService {
    private final CustomTransactionRepo customTransactionRepo;
    private final TransactionRepository transactionRepository;

    public List<TransactionResponse> getTransactions() {
        return transactionRepository.findAll().stream()
                .map(TransactionResponse::of)
                .toList();
    }
}
