package com.icatpark.springboot.contact.config;

import com.icatpark.boot.model.MyContact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean
    public MyContact myContact() {
        MyContact myContact = new MyContact();
        myContact.setName("master");
        myContact.setPhone("010-1111-2222");
        return myContact;
    }

}
