package org.example.springboottest.domain.transaction;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTransaction is a Querydsl query type for Transaction
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTransaction extends EntityPathBase<Transaction> {

    private static final long serialVersionUID = 81985907L;

    public static final QTransaction transaction = new QTransaction("transaction");

    public final StringPath city = createString("city");

    public final DateTimePath<java.time.LocalDateTime> createdDt = createDateTime("createdDt", java.time.LocalDateTime.class);

    public final StringPath creator = createString("creator");

    public final StringPath isDeleted = createString("isDeleted");

    public final DateTimePath<java.time.LocalDateTime> modifiedDt = createDateTime("modifiedDt", java.time.LocalDateTime.class);

    public final StringPath modifier = createString("modifier");

    public final StringPath name = createString("name");

    public final NumberPath<Long> no = createNumber("no", Long.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final StringPath state = createString("state");

    public final StringPath storeName = createString("storeName");

    public final DateTimePath<java.time.LocalDateTime> tradeDt = createDateTime("tradeDt", java.time.LocalDateTime.class);

    public QTransaction(String variable) {
        super(Transaction.class, forVariable(variable));
    }

    public QTransaction(Path<? extends Transaction> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTransaction(PathMetadata metadata) {
        super(Transaction.class, metadata);
    }

}

