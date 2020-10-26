package ru.styxman.patterns.hw.five.adapter;

import ru.styxman.patterns.hw.five.DbUserEntity;
import ru.styxman.patterns.hw.five.DbUserInfoEntity;
import ru.styxman.patterns.hw.five.IDbEntity;
import ru.styxman.patterns.hw.five.orm.first.IFirstOrm;

/**
 * FirstOrmAdapter.
 */
public class FirstOrmAdapter implements ITarget {

    private IFirstOrm<IDbEntity> firstOrm;

    public FirstOrmAdapter(IFirstOrm<IDbEntity> firstOrm) {
        this.firstOrm = firstOrm;
    }

    @Override
    public void createUser(DbUserEntity entity) {
        firstOrm.create(entity);
    }

    @Override
    public DbUserEntity readUser(Long id) {
        return (DbUserEntity) firstOrm.read(id.intValue());
    }

    @Override
    public void updateUser(DbUserEntity entity) {
        firstOrm.update(entity);
    }

    @Override
    public void deleteUser(DbUserEntity entity) {
        firstOrm.delete(entity);
    }

    @Override
    public void createUserInfo(DbUserInfoEntity entity) {
        firstOrm.create(entity);
    }

    @Override
    public DbUserInfoEntity readUserInfo(Long id) {
        return (DbUserInfoEntity) firstOrm.read(id.intValue());
    }

    @Override
    public void updateUserInfo(DbUserInfoEntity entity) {
        firstOrm.update(entity);
    }

    @Override
    public void deleteUserInfo(DbUserInfoEntity entity) {
        firstOrm.delete(entity);
    }
}
