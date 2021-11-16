package com.cm.api;

import com.cm.api.doctor.entites.Doctor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setFirstName("D1");
        System.out.println(doctor);
    }
}

