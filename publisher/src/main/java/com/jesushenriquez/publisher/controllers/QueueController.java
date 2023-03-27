package com.jesushenriquez.publisher.controllers;

import com.jesushenriquez.publisher.QueueSender;
import com.jesushenriquez.publisher.dtos.requests.TestRequest;
import com.jesushenriquez.publisher.dtos.responses.TestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class QueueController {

    @Autowired
    private QueueSender queueSender;

    @GetMapping
    public ResponseEntity<?> send(@RequestBody TestRequest request){
        queueSender.send(request.getMessage());
        var response = TestResponse.builder()
                .message("Process Ok")
                .build();
        return ResponseEntity.ok(response);
    }
}
