package org.example.springboottest.repository;

import org.example.springboottest.domain.transaction.Transaction;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class RepositoryDummyData {
    public static List<Transaction> getDummyTransactions() {
        return Collections.singletonList(
                Transaction.builder()
                        .name("이과장")
                        .city("서울")
                        .storeName("다이소")
                        .price(3000)
                        .tradeDt(LocalDateTime.now())
                        .state("결제완료")
                        .creator("이과장")
                        .createdDt(LocalDateTime.now())
                        .isDeleted("N")
                        .build()
        );
    }
}
