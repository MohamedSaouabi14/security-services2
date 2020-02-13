package org.sid.web;

import lombok.Data;
import org.sid.entities.AppRole;
import org.sid.entities.AppUser;
import org.sid.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserControler {
    @Autowired
    private AccountService accountService;
    @PostMapping("/register")
    public AppUser register(@RequestBody UserForm userForm){
        return accountService.saveUser(userForm.getUsername(),userForm.getPassword(),userForm.getConfirmedPassword());
    }
    @PostMapping("/addrole")
    public AppRole addrole(@RequestBody Userrole userrole){
       return accountService.addRoleToUser(userrole.getUsername(),userrole.getRolename());
    }
    @PostMapping("/profile")
    public AppUser profile(@RequestBody Userrole userrole){
        return accountService.loadUserByUsername(userrole.getUsername());
    }

}
@Data
class UserForm{
    private String username;
    private String password;
    private String confirmedPassword;
}
@Data
class Userrole{
    private String username;
    private String rolename;
}

