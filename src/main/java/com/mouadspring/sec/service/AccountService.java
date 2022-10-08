package com.mouadspring.sec.service;
import com.mouadspring.sec.entities.AppRole;
import com.mouadspring.sec.entities.AppUser;

public interface AccountService {
    public AppUser saveUser(AppUser u);
    //public AppRole save(AppRole r);
    public AppRole saveRole(AppRole r);
    public AppUser findUserByUsername(String username);
    public void addRoleToUser(String username,String roleName);
}
