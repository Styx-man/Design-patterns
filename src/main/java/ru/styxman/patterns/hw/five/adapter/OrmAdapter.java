package ru.styxman.patterns.hw.five.adapter;

import ru.styxman.patterns.hw.five.IDbEntity;
import ru.styxman.patterns.hw.five.orm.first.IFirstOrm;
import ru.styxman.patterns.hw.five.orm.second.ISecondOrm;

public class OrmAdapter {

    public <T> ITarget getAdapter(T orm) {
        if (orm instanceof IFirstOrm) {
            return new FirstOrmAdapter((IFirstOrm<IDbEntity>) orm);
        } else if (orm instanceof ISecondOrm) {
            return new SecondOrmAdapter((ISecondOrm) orm);
        }
        throw new RuntimeException("Can not work with provided ORM");
    }
}