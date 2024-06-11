package org.example.springboottest.repository;

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
        logger.info(transactionRepository.findAll()::toString);
        logger.info(() -> "Test find all");
    }
}
