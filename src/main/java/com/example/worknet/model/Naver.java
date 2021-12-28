package com.example.worknet.model;


import com.example.worknet.model.code.AreaCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class Naver implements AreaCode {

    private String title;
    private String transactionType;
    private String price;
    private String houseType;
    private String houseSize;
    private String deposit;
    private String loanAmount;
    private String managementPrice;
    private String managementPriceInclude;
    private String direction;
    private String totalAndTheFloor;
    private String roomAndBathroom;
    private String entrance;
    private String heating;
    private String totalParking;
    private String approvalDay;
    private String totalAndEqualHouseholds;
    private String constructionCompany;
    private String moveInDay;
    private String itemNumber;

}
