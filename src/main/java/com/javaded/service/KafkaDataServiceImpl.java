package com.javaded.service;

import com.javaded.model.Data;
import org.springframework.stereotype.Service;

@Service
public class KafkaDataServiceImpl implements KafkaDataService {

    @Override
    public void handle(Data data) {
        System.out.println("Data object is received: " + data.toString());
    }

}
