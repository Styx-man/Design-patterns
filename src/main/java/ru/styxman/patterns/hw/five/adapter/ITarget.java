package ru.styxman.patterns.hw.five.adapter;

import ru.styxman.patterns.hw.five.DbUserEntity;
import ru.styxman.patterns.hw.five.DbUserInfoEntity;

/**
 * Target.
 */
public interface ITarget {

    void createUser(DbUserEntity entity);

    DbUserEntity readUser(Long id);

    void updateUser(DbUserEntity entity);

    void deleteUser(DbUserEntity entity);

    void createUserInfo(DbUserInfoEntity entity);

    DbUserInfoEntity readUserInfo(Long id);

    void updateUserInfo(DbUserInfoEntity entity);

    void deleteUserInfo(DbUserInfoEntity entity);
}
