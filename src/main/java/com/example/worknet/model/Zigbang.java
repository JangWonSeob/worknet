package com.example.worknet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Zigbang {

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
