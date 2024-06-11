package org.example.springboottest.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.example.springboottest.domain.transaction.TransactionRepository;
import org.example.springboottest.response.transaction.TransactionResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.StreamSupport;

@Log4j2
@Service
@Transactional
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public List<TransactionResponse> getTransactions() {
        return StreamSupport.stream(transactionRepository.findAll().spliterator(), false)
                .map(TransactionResponse::of)
                .toList();
    }
}
