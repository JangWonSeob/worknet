package com.example.worknet.model.realty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PeterPan1 {         // 부동산 (피터팬의 좋은방구하기)

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
