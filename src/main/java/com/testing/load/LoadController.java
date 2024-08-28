package com.testing.load;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
@Slf4j
public class LoadController {

    @GetMapping
    public ResponseEntity<String> testLoad() throws Exception{
        log.info("Load Testing starting.....");
        int res = 0 ;
        for(int  i = 0 ; i < 10000; i++){
            res++;
        }
        log.info("Load testing done.");
        return ResponseEntity.ok("Load Testing success....");
    }

    @GetMapping("/2")
    public ResponseEntity<String> testLoad2() throws Exception{
        log.info("Load Testing 2 starting.....");
        int res = 0 ;
        for(int  i = 0 ; i < 10000; i++){
            res++;
        }
        log.info("Load testing 2 done.");
        return ResponseEntity.ok("Load Testing success....");
    }
}
