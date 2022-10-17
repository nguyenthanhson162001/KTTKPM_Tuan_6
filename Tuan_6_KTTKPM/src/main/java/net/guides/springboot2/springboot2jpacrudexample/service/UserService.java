package net.guides.springboot2.springboot2jpacrudexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.guides.springboot2.springboot2jpacrudexample.model.User;
import net.guides.springboot2.springboot2jpacrudexample.model.UserRest;
import net.guides.springboot2.springboot2jpacrudexample.repository.UserRepository;


@Service
public class UserService implements UserDetailsService  {
    

    @Autowired
    private UserRepository userRepository;

    public User loadUserByUsername(String username) {
        User user = userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
    }

    public User loadUserById(Long id){
        return userRepository.findById(id).get();
    }

    public Object createUser(User user){
        String url = "http://localhost:8081/api/register";
        RestTemplate restTemplate = new RestTemplate();
        UserRest userRest = new UserRest(user.getId(),user.getUsername(), user.getPassword());
        Object result = restTemplate.postForObject(url, userRest, Object.class);
        return result;
    }



}
