package com.example.worknet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class Brock {

    private String regNo;
    private String name;
    private String addr;
    private String ceo;
    private String regDt;
    private String statusCd;
    private String administrativeDispositionStartDate;
    private String administrativeDispositionEndDate;

}
