package tk.telegraph2.docs.service;

import org.springframework.security.core.userdetails.UserDetailsService;


import tk.telegraph2.docs.model.User;
import tk.telegraph2.docs.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);

    String findLoggedInUsername();
}
