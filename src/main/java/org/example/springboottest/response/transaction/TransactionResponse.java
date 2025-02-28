package org.example.springboottest.response.transaction;

import lombok.*;
import org.example.springboottest.domain.transaction.Transaction;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private long no;
    private String name;
    private String city;
    private String storeName;
    private int price;
    private LocalDateTime tradeDt;
    private String state;

    public static TransactionResponse of(Transaction transaction) {
        return TransactionResponse.builder()
                .no(transaction.getNo())
                .name(transaction.getName())
                .city(transaction.getCity())
                .storeName(transaction.getStoreName())
                .price(transaction.getPrice())
                .tradeDt(transaction.getTradeDt())
                .state(transaction.getState())
                .build();
    }
}
