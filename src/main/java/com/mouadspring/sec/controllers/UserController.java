package com.mouadspring.sec.controllers;
import com.mouadspring.sec.entities.AppUser;
import com.mouadspring.sec.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
@Autowired
    private AccountService accountService;
@PostMapping("/register")
    public AppUser signUP(@RequestBody RegistrationForm data){
        String username=data.getUsername();
        AppUser user=accountService.findUserByUsername(username);
        if(user!=null) throw new RuntimeException("This usrer already exists,try with an other username");
        String password =data.getPassword();
        String repassword=data.getRepssword();
        if(!password.equals(repassword))
            throw new RuntimeException("you must confrim your password");
        AppUser u=new AppUser();
        u.setUsername(username);
        u.setPassword(password);
        accountService.saveUser(u);
        accountService.addRoleToUser(username,"USER");
        return(u);
}
}
