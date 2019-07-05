package com.sample.domain.dao.system;

import com.sample.domain.dto.system.TransactionLock;
import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;

import java.time.LocalDateTime;
import java.util.Optional;

@ConfigAutowireable
@Dao
public interface TransactionLockDao {

    /**
     * ロック情報を1件取得します。
     *
     * @param key
     * @return
     */
    @Select
    Optional<TransactionLock> selectById(String key);

    /**
     * ロック情報を登録します。
     *
     * @param lock
     * @return
     */
    @Insert(sqlFile = true)
    int insert(TransactionLock lock);

    /**
     * ロック情報を削除します。
     *
     * @param key
     * @return
     */
    @Delete(sqlFile = true)
    int delete(String key);

    /**
     * ロック情報を削除します。
     *
     * @param expires
     * @return
     */
    @Delete(sqlFile = true)
    int clear(LocalDateTime expires);
}
