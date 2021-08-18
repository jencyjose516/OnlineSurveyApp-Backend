/**
 * 
 */
package com.lambton.surveyapp.db.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lambton.surveyapp.db.entities.User;

/**
 * @author Jency Jose-C0783516
 * @Since May 29, 2021 11:17:26 PM
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);

	/**
	 * @param email
	 * @return
	 */
	boolean existsByEmail(String email);

	Optional<User> findByUniqueId(String uniqueId);

}