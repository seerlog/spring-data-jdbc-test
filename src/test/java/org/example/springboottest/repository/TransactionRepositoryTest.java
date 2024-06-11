package org.example.springboottest.repository;

import org.example.springboottest.domain.transaction.Transaction;
import org.example.springboottest.domain.transaction.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

@DataJdbcTest
@ActiveProfiles("test")
@Sql(scripts = "classpath:schema.sql")
@ExtendWith(SpringExtension.class)
public class TransactionRepositoryTest {
    private final Logger logger = LoggerFactory.getLogger(TransactionRepositoryTest.class);

    @Autowired
    private TransactionRepository transactionRepository;

    @Test
    public void testFindAll() {
        transactionRepository.save(Transaction.builder()
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
                .build());

        transactionRepository.findAll().forEach(transaction -> {
            logger.info(transaction::toString);
        });
    }
}
