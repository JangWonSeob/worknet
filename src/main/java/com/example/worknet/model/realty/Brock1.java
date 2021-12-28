package com.example.worknet.model.realty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class Brock1 {        // 중개사

    private String regNo;                               // 등록번호
    private String name;                                // 상호
    private String addr;                                // 소재지
    private String ceo;                                 // 대표자
    private String regDt;                               // 등록일자
    private String statusCd;                            // 상태
    private String administrativeDispositionStartDate;  // 행정처분시작일자
    private String administrativeDispositionEndDate;    // 행정처분종료일자
}
