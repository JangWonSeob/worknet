package com.example.worknet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PeterPan {

    private House house;

    @Data
    public class House{
        @JsonProperty("building_name")
        String buildingName;

        @JsonProperty("sido")
        String sido;

        @JsonProperty("sigungu")
        String sigungu;

        @JsonProperty("dong")
        String dong;
    }
}
