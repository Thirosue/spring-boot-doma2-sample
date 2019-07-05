package com.sample.domain.dto.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.seasar.doma.Transient;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class SystemQuery implements Serializable {

    private static final long serialVersionUID = -1;

    @Transient
    @JsonIgnore
    String sort;
}
