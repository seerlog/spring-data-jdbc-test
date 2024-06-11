package org.example.springboottest.repository;

import org.example.springboottest.domain.transaction.Transaction;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class RepositoryDummyData {
    public static List<Transaction> getDummyTransactions() {
        return Collections.singletonList(
                Transaction.builder()
                        .name("name")
                        .city("city")
                        .storeName("storeName")
                        .price(1000)
                        .tradeDt(LocalDateTime.now())
                        .state("state")
                        .creator("creator")
                        .modifier("modifier")
                        .createdDt(LocalDateTime.now())
                        .modifiedDt(LocalDateTime.now())
                        .isDeleted("N")
                        .build()
        );
    }
}
