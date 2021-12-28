package com.example.worknet.model.realty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.util.List;

@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Zigbang1 {       // 부동산 (직방)

    private Item item;

    @Data
    public class Item {
        @JsonProperty("item_id")
        String itemId;

        @JsonProperty("user_no")
        int userNo;

        @JsonProperty("images")
        List<String> images;

    }
}
