package com.aps.qrc.model;

import lombok.Data;

/*
 * Using @Data annotation (lomback annotation) all setters, getters and toString will
   be created automatically
*/

@Data
public class Merchant {

    private int qrVersion;

    private String qrType;

    private String merchantCompanyName;

    private String merchantCategory;

    private String bankAccount;


}
