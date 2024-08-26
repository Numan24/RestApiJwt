package com.numan.ahmad.restjwt.model.DTOs;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Builder
@Component
@AllArgsConstructor
@NoArgsConstructor
public class CustomErrorResponses {

    private boolean ok;
    private String error;
}
