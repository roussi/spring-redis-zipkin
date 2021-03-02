package com.example.springredisdood.bill;

import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author aroussi
 * @version %I% %G%
 */
@Service
class BillService {

    @Resource(name = "redisTemplate")
    private ValueOperations<String, Object> valueOps;

    public void saveBill(Bill bill) {
        Assert.notNull(bill, "Bill should not be null");
        valueOps.set(bill.getRef(), bill);
    }

    public Optional<Bill> findBillById(String ref) {
        Assert.notNull(ref, "ref should not be null");
        return Optional.ofNullable((Bill)valueOps.get(ref));
    }
}
