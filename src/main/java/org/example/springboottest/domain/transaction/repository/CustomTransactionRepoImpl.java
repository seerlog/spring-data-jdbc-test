package org.example.springboottest.domain.transaction.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.example.springboottest.request.transaction.TransactionSearchRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CustomTransactionRepoImpl implements CustomTransactionRepo {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Page<TransactionSearchRequest> search(TransactionSearchRequest request) {
        return null;
    }
}
