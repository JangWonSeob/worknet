package com.example.worknet.component;

import com.example.worknet.model.Brock;
import com.example.worknet.model.ReqBody;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@RequiredArgsConstructor
public class RealEstateBrokerComponent {

    public Map<String, Object> getData(ReqBody param) {
        String url = "http://www.nsdi.go.kr/lxportal/?menuno=4085";

        List<Brock> list = new ArrayList<>();
        Map<String, String> body = new HashMap<>();
        Map<String, Object> result = new HashMap<>();

        String regNo = null;
        String name = null;
        String addr = null;
        String ceo = null;
        String regDt = null;
        String statusCd = null;
        String administrativeDispositionStartDate = null;
        String administrativeDispositionEndDate = null;

        body.put("shInit", param.getShInit());
        body.put("pageIndex", param.getPageIndex());
        body.put("shSido", param.getShSido());
        body.put("shSigungu", param.getShSigungu());
        body.put("shDong", param.getShDong());
        body.put("shSelect", param.getShSelect());
        body.put("shWord", param.getShWord());
        body.put("shWord1", param.getShWord1());
        body.put("shWord2", param.getShWord2());
        body.put("shSelect3", param.getShSelect3());
        body.put("orderSelect", param.getOrderSelect());
        body.put("orderSelect1", param.getOrderSelect1());
        body.put("pageSize", param.getPageSize());

        int total = 0;

        try {
            Document doc = Jsoup.connect(url).timeout(30000)
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .data(body)
                    .post();

            String totalData = !"".equals(doc.getElementsByAttributeValue("class", "allTxt").text()) ? doc.getElementsByAttributeValue("class", "allTxt").text() : null;  // 총 갯수
            if (totalData.contains("전체 ")) {
                String[] totalArr = totalData.split("전체 ");
                System.out.println(totalArr[totalArr.length - 1].contains("건"));
                if (totalArr[totalArr.length - 1].contains("건") && totalArr[totalArr.length - 1].contains(",")) {
                    System.out.println(totalArr[totalArr.length - 1].split("건")[0]);
                    String[] totalArr2 = totalArr[totalArr.length - 1].split("건")[0].split(",");
                    String totalStr = "";
                    for (String x : totalArr2) {
                        totalStr += x;
                    }
                    total = Integer.parseInt(totalStr);
                }
            }
            Elements dataList = doc.getElementsByAttributeValue("class", "bl_list").select("tr");
            System.out.println(total);

            if (dataList.size() >= 1) {
                Elements title = dataList.get(0).select("th");
                for (int i = 1; i < dataList.size(); i++) {
                    Brock brock = null;
                    Elements data = dataList.get(i).select("td");
                    for (int j = 0; j < data.size(); j++) {
                        String getData = data.get(j).text();
                        switch (title.get(j).text()) {
                            case "등록번호":
                                if (getData.contains("-")) {
                                    getData = getData.replace("-", "");
                                }
                                regNo = getData;
                                break;
                            case "상호":
                                name = getData;
                                break;
                            case "소재지":
                                addr = getData;
                                break;
                            case "대표자":
                                ceo = getData;
                                break;
                            case "등록일자":
                                regDt = getData;
                                break;
                            case "상태":
                                statusCd = getData;
                                break;
                            case "행정처분시작일자":
                                administrativeDispositionStartDate = getData;
                                break;
                            case "행정처분종료일자":
                                administrativeDispositionEndDate = getData;
                                break;
                            default:
                                break;
                        }
                    }

                    brock = Brock.builder()
                            .regNo(regNo)
                            .name(name)
                            .addr(addr)
                            .ceo(ceo)
                            .regDt(regDt)
                            .statusCd(statusCd)
                            .administrativeDispositionStartDate(administrativeDispositionStartDate)
                            .administrativeDispositionEndDate(administrativeDispositionEndDate)
                            .build();

                    list.add(brock);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        result.put("list", list);
        result.put("total", total);

        return result;
    }


}
