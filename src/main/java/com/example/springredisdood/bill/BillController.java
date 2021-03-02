package com.example.springredisdood.bill;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author aroussi
 * @version %I% %G%
 */
@RequestMapping(value = "/bills")
@RestController
@RequiredArgsConstructor
class BillController {

    private final BillService billService;

    @GetMapping(value = "/{ref}")
    public ResponseEntity findBillByRef(@PathVariable String ref) {
        return billService.findBillById(ref).map(ResponseEntity::ok).orElse(ResponseEntity.badRequest().build());
    }

    @PostMapping
    public ResponseEntity saveBill(@RequestBody Bill bill) {
        billService.saveBill(bill);
        return ResponseEntity.ok().build();
    }
}
