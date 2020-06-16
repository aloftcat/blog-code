package com.icatpark.springboot.contact;

import com.icatpark.boot.model.MyContact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyContactRunner implements ApplicationRunner {

    @Autowired
    MyContact myContact;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(myContact.toString());
    }
}
