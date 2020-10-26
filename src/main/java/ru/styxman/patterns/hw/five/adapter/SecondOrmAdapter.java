package ru.styxman.patterns.hw.five.adapter;

import ru.styxman.patterns.hw.five.DbUserEntity;
import ru.styxman.patterns.hw.five.DbUserInfoEntity;
import ru.styxman.patterns.hw.five.orm.second.ISecondOrm;

/**
 * SecondOrmAdapter.
 */
public class SecondOrmAdapter implements ITarget {

    private ISecondOrm secondOrm;

    public SecondOrmAdapter(ISecondOrm secondOrm) {
        this.secondOrm = secondOrm;
    }

    @Override
    public void createUser(DbUserEntity entity) {
        secondOrm.getContext().getUsers().add(entity);
    }

    @Override
    public DbUserEntity readUser(Long id) {
        return secondOrm.getContext().getUsers()
                .stream()
                .filter(dbUserEntity -> dbUserEntity.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public void updateUser(DbUserEntity entity) {
        deleteUser(entity);
        secondOrm.getContext().getUsers().add(entity);
    }

    @Override
    public void deleteUser(DbUserEntity entity) {
        secondOrm.getContext().getUsers().remove(entity);
    }

    @Override
    public void createUserInfo(DbUserInfoEntity entity) {
        secondOrm.getContext().getUserInfos().add(entity);
    }

    @Override
    public DbUserInfoEntity readUserInfo(Long id) {
        return secondOrm.getContext().getUserInfos()
                .stream()
                .filter(dbUserInfoEntity -> dbUserInfoEntity.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void updateUserInfo(DbUserInfoEntity entity) {
        deleteUserInfo(entity);
        secondOrm.getContext().getUserInfos().add(entity);
    }

    @Override
    public void deleteUserInfo(DbUserInfoEntity entity) {
        secondOrm.getContext().getUserInfos().remove(entity);
    }
}
