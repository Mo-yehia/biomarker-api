package com.jendi.ai.biomarker_api.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Biomarker {
    private String name;
    private String unit;
    private double value;
}
