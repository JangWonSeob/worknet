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
public class SearchId implements AreaCode {

    private String id;
    private String url;

}
