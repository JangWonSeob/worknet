package com.example.worknet.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class ReqBody {

    private String shInit;          // N 사용
    private String pageIndex;       // 페이지 번호 - 0부터 시작
    private String shSido;          // 시도 선택 (서울특별시, 경기도, 강원도 ...)
    private String shSigungu;       // 구 선택 (강남구, 강동구, 강북구 ...)
    private String shDong;          // 동 선택 (개포동, 논현동, 대치동 ...)
    private String shSelect;        // 상세 구분 (중개업사무소(1), 중개사/보조원(2))

    // 상세 구분 - 중개업사무소 선택 시 사용
    private String shWord;          // 상호명
    private String shWord1;         // 등록번호
    private String orderSelect;     // 정렬 컬럼 (상호(1), 등록일자(2), 등록번호(0))
    private String orderSelect1;    // 정렬 순서 (오름차순(0), 내림차순(1))

    // 상세 구분 - 중개사/보조원 선택 시 사용
    private String shWord2;         // 성명
    private String shSelect3;       // 직위 (전체() ,대표(01), 감사(02), 이사(03), 일반(04))

    private String pageSize;        // 출력 갯수
}
