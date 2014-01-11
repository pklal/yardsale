/**
 * 
 */
package com.light.yardsale.usermgmnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.light.yardsale.usermgmnt.entity.User;



/**
 * @author kiranlal
 *
 */
@Component
public interface UserRepository  extends JpaRepository<User, Long>{ 

}
