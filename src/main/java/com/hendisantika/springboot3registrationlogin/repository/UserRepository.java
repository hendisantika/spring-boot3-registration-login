package com.hendisantika.springboot3registrationlogin.repository;

import com.hendisantika.springboot3registrationlogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-registration-login
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/31/23
 * Time: 08:47
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
