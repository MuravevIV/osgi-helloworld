package com.ilyamur.osgi.helloworld.impl;

import com.ilyamur.osgi.helloworld.service.OsgiHelloworldService;

public class OsgiHelloworldServiceImpl implements OsgiHelloworldService {

    public String getGreeting(String name) {
        return String.format("Hello, %s!", name);
    }
}
