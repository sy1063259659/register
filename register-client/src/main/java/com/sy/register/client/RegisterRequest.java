package com.sy.register.client;


import lombok.Data;

@Data
public class RegisterRequest {

    private String serviceName;

    private String ip;

    private String hostname;

    private int port;


}
