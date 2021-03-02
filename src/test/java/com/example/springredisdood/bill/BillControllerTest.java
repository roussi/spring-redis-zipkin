package com.example.springredisdood.bill;

import com.example.springredisdood.SpringRedisDoodApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public class BillControllerTest extends SpringRedisDoodApplicationTests {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void checkSaveToRedis() {
        Bill bill = Bill.builder().ref("123").clientRef("abdelghani").amount(100.0).build();
        ResponseEntity<Object> objectResponseEntity = testRestTemplate.postForEntity("/bills", bill, Object.class, Map.of());
        Assert.assertTrue(objectResponseEntity.getStatusCode().is2xxSuccessful());
    }
}
