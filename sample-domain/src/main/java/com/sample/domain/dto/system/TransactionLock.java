package com.sample.domain.dto.system;

import com.sample.domain.dto.common.DomaDtoImpl;
import lombok.Getter;
import lombok.Setter;
import lombok.val;
import org.seasar.doma.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import static com.sample.domain.Const.SESSION_EXPIRES;

@Table(name = "transaction_lock")
@Entity
@Getter
@Setter
public class TransactionLock implements Serializable {

    private static final long serialVersionUID = 4825745231712286767L;

    @Id
    @Column(name = "transaction_key")
    String key;

    LocalDateTime expires;

}
