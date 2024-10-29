package io.github.mfaisalkhatri.pojo;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CustomerDetails {

    private int customerid;
    private String name;
    private String phone;
    private String email;
    private String country;
    private boolean coupon ;
}
