package net.guides.springboot2.springboot2jpacrudexample.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

@Data
public class UserRest implements  Serializable{
    /**
	 * 
	 */
	@Id
    private Long id;
    private String userName;
    private String password;
    public UserRest(Long id, String userName, String password) {
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
    }
    

}