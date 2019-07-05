package com.sample.domain.repository.system;

import com.sample.domain.dao.system.TransactionLockDao;
import com.sample.domain.dto.system.TransactionLock;
import com.sample.domain.service.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

import static com.sample.domain.util.DomaUtils.createSelectOptions;

/**
 * ロック情報リポジトリ
 */
@Repository
public class TransactionLockRepository extends BaseRepository {

    @Autowired
    TransactionLockDao kvsDao;

    /**
     * ロック情報を取得します。
     *
     * @param key
     * @return
     */
    public Optional<TransactionLock> findOne(String key) {
        return kvsDao.selectById(key);
    }

    /**
     * ロック情報を追加します。
     *
     * @param lock
     * @return
     */
    public int create(final TransactionLock lock) { return kvsDao.insert(lock); }

    /**
     * ロック情報を削除します。
     *
     * @return
     */
    public int delete(String key) {
        return kvsDao.delete(key);
    }

    /**
     * ロック情報をクリアします。
     *
     * @return
     */
    public int clear(LocalDateTime expires) {
        return kvsDao.clear(expires);
    }
}
