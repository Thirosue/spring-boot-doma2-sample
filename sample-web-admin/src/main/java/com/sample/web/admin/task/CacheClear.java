package com.sample.web.admin.task;

import com.sample.domain.repository.system.TransactionLockRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class CacheClear {

    @Autowired
    TransactionLockRepository transactionLockRepository;

    @Scheduled(initialDelay=0, fixedDelay=60000*5) //5 min
    public void clear() {
        log.info("clear expired cache");
        transactionLockRepository.clear(LocalDateTime.now().minusMinutes(5));
    }
}
