package com.example.springredisdood.bill;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author aroussi
 * @version %I% %G%
 */
@Getter
@SuperBuilder
@NoArgsConstructor
class Bill {
    private String ref;
    private String clientRef;
    private Double amount;
}
