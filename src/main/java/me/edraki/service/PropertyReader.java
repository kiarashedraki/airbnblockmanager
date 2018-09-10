package me.edraki.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyReader {

    @Value("${database}")
    public String mangoDbHost;

}
