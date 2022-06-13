package com.bachelor.messenger_v2.service.api;

import com.mashape.unirest.http.Unirest;
import org.springframework.stereotype.Service;

@Service
public class EjabberdApiServiceImpl implements EjabberdApiService {

    @Override
    public String ping() {
        return Unirest.post("http://localhost:5280/api/status").toString();
    }
}
