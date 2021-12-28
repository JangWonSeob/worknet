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
public class Dabang1 {       // 부동산 (다방)

    private boolean isMessengerSenderAgented;
    private String agent;
    private Room room;

    @Data
    public class Room {
        @JsonProperty("is_favorited")
        String isFavorited;

        @JsonProperty("favorited_count")
        int favoritedCount;

        @JsonProperty("seq")
        int seq;

        @JsonProperty("id")
        String id;

        @JsonProperty("user_id")
        String userId;

        @JsonProperty("title")
        String title;

        @JsonProperty("memo")
        String memo;
    }
}
