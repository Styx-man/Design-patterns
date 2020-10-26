package ru.styxman.patterns.hw.five.orm.second;

import ru.styxman.patterns.hw.five.DbUserEntity;
import ru.styxman.patterns.hw.five.DbUserInfoEntity;

import java.util.Set;

/**
 * ISecondOrmContext.
 */
public interface ISecondOrmContext {

    Set<DbUserEntity> getUsers();

    Set<DbUserInfoEntity> getUserInfos();

}
