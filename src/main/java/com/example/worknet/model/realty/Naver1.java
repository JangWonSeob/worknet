package com.example.worknet.model.realty;


import lombok.*;

import java.util.List;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Naver1 {       // 부동산 (네이버)

    // 공인중개사
    private String shopName;                // 상호
    private String shopRegNumber;           // 등록번호
    private String shopPhoneNumber;         // 전화번호
    private String shopCellPhoneNumber;     // 휴대전화번호
    private String shopLocation;            // 소재지

    private String itemRegDt;               // 매물 등록일
    private String itemNumber;              // 매물번호
    private String itemLocation;            // 매물 소새지

    private String houseType;               // 집 유형(주택, 아파트 ...)
    private String price;                   // 매매가
    private String houseSize;               // 공급/전용면적
    private String totalAndTheFloor;        // 해당층/총층
    private String loanAmount;              // 융자금
    private String moveInDay;               // 입주가능일
    private String roomAndBathroom;         // 방수/욕실수
    private String entrance;                // 현관구조
    private String totalAndEqualHouseholds; // 총세대수/해당면적 세대수
    private String totalParking;            // 총주차대수
    private String approvalDay;             // 사용승인일
    private String heating;                 // 난방
    private String deposit;                 // 기보증금/월세
    private String direction;               // 방향
    private List<Tax> tax;                  // 세금 정보
    private String mediationPay;            // 중개보수
    private String amenities;               // 주변 편의시설(1km 이내)
    private String accessibility;           // 주변 지역 접근성
    private String publicTransport;         // 대중 교통
    private String constructionCompany;     // 건설사
    private List<String> floorPlan;         // 평면도
    private String officialPrice;           // 공시 가격
    private String holdingTax;              // 보유세
    private String assignedSchool;          // 배정학교(초등학교)
    private String startMarketPrice;        // 시세 시작 가격
    private String endMarketPrice;          // 시세 끝 가격
    private List<String> realTransaction;   // 실거래가

    private String title;                   // 건물 명
    private String transactionType;         // 거래 타입
    private String managementPrice;         // 관리비
    private String managementPriceInclude;  // 관리비 포함

    @Data
    public class Tax {
        private String title;
        private String price;
    }
}
