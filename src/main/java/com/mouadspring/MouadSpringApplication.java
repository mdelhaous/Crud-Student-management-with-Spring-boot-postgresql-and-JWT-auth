package com.mouadspring;


import com.mouadspring.sec.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableAsync
public class MouadSpringApplication {
    @Autowired
    private AccountService accountService;

    public static void main(String[] args) {

        SpringApplication.run(MouadSpringApplication.class, args);
    }
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {

        return new BCryptPasswordEncoder();
    }


    //@Override
    /*public void run(String... args) throws Exception {
        accountService.saveRole(new AppRole(null,"USER"));
        accountService.saveUser(new AppUser(null,"pokoch","1234",null));
        accountService.addRoleToUser("pokoch","USER");



    }*/
}



