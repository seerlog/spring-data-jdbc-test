package org.example.springboottest.domain.transaction;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Builder
@Table("TRAN")
public class Transaction {
    @Id
    @Column("NO")
    private long no;
    @Column("NAME")
    private String name;
    @Column("CITY")
    private String city;
    @Column("STORE_NAME")
    private String storeName;
    @Column("PRICE")
    private int price;
    @Column("TRADE_DT")
    private LocalDateTime tradeDt;
    @Column("STATE")
    private String state;
    @Column("CREATOR")
    private String creator;
    @Column("MODIFIER")
    private String modifier;
    @Column("CREATED_DT")
    private LocalDateTime createdDt;
    @Column("MODIFIED_DT")
    private LocalDateTime modifiedDt;
    @Column("IS_DELETED")
    private String isDeleted;
}
