package com.service.lostFound.Config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "twilio")
@Getter
@Setter
public class TwilioConfig {
    private String accountSid;
    private String authToken;
    private String trailNumber;

}
