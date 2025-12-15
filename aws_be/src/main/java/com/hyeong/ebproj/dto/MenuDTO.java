package com.hyeong.ebproj.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class MenuDTO {

    private int menuCode;
    private  String menuName;
    private String menuPrice;
    private String categoryCode;
    private String orderableStatus;
}
