package org.example.springboottest.request.transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
    private String name;
    private String city;
    private String storeName;
    private int price;
}
