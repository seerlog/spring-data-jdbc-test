package org.example.springboottest.domain.transaction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Transaction {

    @Id
    @Column(name = "NO", nullable = false)
    private long no;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "STORE_NAME", nullable = false)
    private String storeName;

    @Column(name = "PRICE", nullable = false)
    private int price;

    @Column(name = "TRADE_DT", nullable = false)
    private LocalDateTime tradeDt;

    @Column(name = "STATE", nullable = false)
    private String state;

    @Column(name = "CREATOR", nullable = false)
    private String creator;

    @Column(name = "MODIFIER")
    private String modifier;

    @CreationTimestamp
    @Column(name = "CREATED_DT", nullable = false)
    private LocalDateTime createdDt;

    @UpdateTimestamp
    @Column(name = "MODIFIED_DT")
    private LocalDateTime modifiedDt;

    @Column(name = "IS_DELETED", nullable = false)
    private String isDeleted;

}
