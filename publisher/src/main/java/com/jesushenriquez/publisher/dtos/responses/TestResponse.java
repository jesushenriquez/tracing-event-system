package com.jesushenriquez.publisher.dtos.responses;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TestResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 5662669054655182714L;

    private String message;
}
