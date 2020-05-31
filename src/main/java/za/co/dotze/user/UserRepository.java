package za.co.dotze.user;

import org.springframework.data.repository.CrudRepository;

/**
 * Author : Christiaan Dotze christiaan@psybergate.co.za
 * Date   : 31 May 2020
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
