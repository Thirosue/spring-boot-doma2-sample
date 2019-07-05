package com.sample.domain.service.system;

import com.sample.domain.dto.system.TransactionLock;
import com.sample.domain.repository.system.TransactionLockRepository;
import com.sample.domain.service.BaseTransactionalService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.time.LocalDateTime.now;

@Service
public class TransactionLockService extends BaseTransactionalService {

    @Autowired
    TransactionLockRepository transactionLockRepository;

    public void set(String key) {
        val lock = new TransactionLock();
        lock.setKey(key);
        lock.setExpires(now().plusSeconds(2)); //2秒間 該当機能をロックする
        transactionLockRepository.create(lock);
    }

    public boolean exists(String key) {
        val optional = transactionLockRepository.findOne(key);
        if(optional.isPresent()) {
            val target = optional.get();
            transactionLockRepository.delete(target.getKey());
            return now().isBefore(target.getExpires());
        } else {
            return false;
        }
    }
}
