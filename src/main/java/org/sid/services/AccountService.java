package org.sid.services;

import org.sid.entities.AppRole;
import org.sid.entities.AppUser;

public interface AccountService {
    AppUser saveUser(String username, String password, String confirmedpassword);

    AppRole save(AppRole role);

    AppUser loadUserByUsername(String username);

    AppRole addRoleToUser(String username, String rolename);
}
