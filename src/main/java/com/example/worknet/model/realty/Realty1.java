package com.example.worknet.model.realty;

import lombok.*;

import java.util.List;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Realty1 {       // 부동산(return 값)

    // 공인중개사
    private String shopName;                // 상호
    private String shopRegNumber;           // 등록번호
    private String shopPhoneNumber;         // 전화번호
    private String shopCellPhoneNumber;     // 휴대전화번호
    private String shopLocation;            // 소재지

    // 매물
    private String itemRegDt;               // 매물 등록일
    private String itemNumber;              // 매물번호
    private String itemLocation;            // 매물 소재지

    private String title;                   // 매물 이름

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
//    private List<Tax> tax;                // 세금 정보
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

    // 건폐율/용적율(정보 없음)
    // 전세금 반환보증(정보 없음)

/*    @Data
    @ToString
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public class Tax {
        private String title;
        private String price;
    }*/

    public static Realty1 toRealty(Naver1 param) {

        return Realty1.builder()
                .shopName(param.getShopName())
                .shopRegNumber(param.getShopRegNumber())
                .shopPhoneNumber(param.getShopPhoneNumber())
                .shopCellPhoneNumber(param.getShopCellPhoneNumber())
                .shopLocation(param.getShopLocation())

                .itemRegDt(param.getItemRegDt())
                .itemNumber(param.getItemNumber())
                .itemLocation(param.getItemLocation())

                .title(param.getTitle())
                .houseType(param.getHouseType())
                .price(param.getPrice())
                .houseSize(param.getHouseSize())
                .totalAndTheFloor(param.getTotalAndTheFloor())
                .loanAmount(param.getLoanAmount())
                .moveInDay(param.getMoveInDay())
                .roomAndBathroom(param.getRoomAndBathroom())
                .entrance(param.getEntrance())
                .totalAndEqualHouseholds(param.getTotalAndEqualHouseholds())
                .totalParking(param.getTotalParking())
                .approvalDay(param.getApprovalDay())
                .heating(param.getHeating())
                .deposit(param.getDeposit())
                .direction(param.getDirection())
//                .
//                .tax()
                .mediationPay(param.getMediationPay())
                .amenities(param.getAmenities())
                .accessibility(param.getAccessibility())
                .publicTransport(param.getPublicTransport())
                .constructionCompany(param.getConstructionCompany())
                .floorPlan(param.getFloorPlan())
                .officialPrice(param.getOfficialPrice())
                .holdingTax(param.getHoldingTax())
                .assignedSchool(param.getAssignedSchool())
                .startMarketPrice(param.getStartMarketPrice())
                .endMarketPrice(param.getEndMarketPrice())
                .realTransaction(param.getRealTransaction())
                .build();

    }

    public static Realty1 toRealty(Dabang1 param) {

        return Realty1.builder()

                .build();

    }

    public static Realty1 toRealty(Zigbang1 param) {

        return Realty1.builder()

                .build();

    }

    public static Realty1 toRealty(PeterPan1 param) {

        return Realty1.builder()

                .build();

    }

    public static Realty1 toRealty(RealtyServe1 param) {

        return Realty1.builder()

                .build();

    }
}
