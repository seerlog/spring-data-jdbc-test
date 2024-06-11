package org.example.springboottest.repository;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DataJdbcTest
@ExtendWith(SpringExtension.class)
public class TransactionRepository {

    @BeforeAll
    public static void executeQuery() {
        System.out.println("Executing query");
    }

    @Test
    public void testFindAll() {
        System.out.println("Test find all");
    }
}
