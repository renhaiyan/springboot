package com.self.datasource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter@Getter@ToString
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class MyDruidDataSource {

    private String username;
    private String password;
    private String url;
    private String driverClassName;
}
