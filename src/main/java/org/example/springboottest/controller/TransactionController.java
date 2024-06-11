package org.example.springboottest.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.example.springboottest.response.transaction.TransactionResponse;
import org.example.springboottest.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/transaction")
public class TransactionController {
    private final TransactionService transactionService;

    @PostMapping("/search")
    public ResponseEntity<List<TransactionResponse>> searchTransactions() {
        return ResponseEntity.ok(transactionService.getTransactions());
    }

}
