package com.icatpark.boot.config;

import com.icatpark.boot.model.MyContact;
import com.icatpark.boot.property.MyContactProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyContactProperties.class)
@ConditionalOnMissingBean(MyContact.class)
public class MyContactConfiguration {

    @Bean
    public MyContact myContact(MyContactProperties myContactProperties){
        MyContact myContact = new MyContact();
        myContact.setName(myContactProperties.getName());
        myContact.setPhone(myContactProperties.getPhone());
        return myContact;
    }

}
