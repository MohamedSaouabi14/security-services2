package org.sid.services;

import org.sid.entities.AppRole;
import org.sid.entities.AppUser;

public interface AccountService  {
    public AppUser saveUser(String username, String password, String confirmedpassword);
    public AppRole save(AppRole role);
    public AppUser loadUserByUsername(String username);
    public AppRole addRoleToUser(String username, String rolename);
}
