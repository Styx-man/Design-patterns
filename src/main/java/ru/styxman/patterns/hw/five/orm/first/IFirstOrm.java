package ru.styxman.patterns.hw.five.orm.first;

import ru.styxman.patterns.hw.five.IDbEntity;

/**
 * IFirstOrm.
 */
public interface IFirstOrm<T extends IDbEntity> {

    void create(T entity);

    T read(int id);

    void update(T entity);

    void delete(T entity);
}
