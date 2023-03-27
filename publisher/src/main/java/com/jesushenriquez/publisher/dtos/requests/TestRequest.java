package com.jesushenriquez.publisher.dtos.requests;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TestRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 67861353357335290L;
    String message;
}
