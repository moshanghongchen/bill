package com;

import com.model.entity.BillHead;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BillApplication {
//    @Bean
    public BillHead getBillHead(){
        return new BillHead();
    }

    public static void main(String[] args) {
        SpringApplication.run(BillApplication.class, args);
    }

}
