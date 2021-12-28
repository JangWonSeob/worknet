package com.example.worknet.model.realty;


import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RealtyServe1 {       // 부동산 (부동산써브)

    private String managementPrice;         // 월관리비
    private String price;                   // 매매가
    private String houseType;               // 물건종류
    private String moveInDay;               // 입주가능일
    private String houseSize;               // 공급/전용면적
    private String totalFloor;              // 총층
    private String theFloor;                // 해당층
    private String roomCount;               // 방수
    private String bathroomCount;           // 욕실수

    private String itemNumber;              // 매물번호

}
