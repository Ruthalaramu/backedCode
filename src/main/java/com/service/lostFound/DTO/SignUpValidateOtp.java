package com.service.lostFound.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpValidateOtp {
    private String userName;
    private String mobileNumber;
    private String userEnterOtp;
}
