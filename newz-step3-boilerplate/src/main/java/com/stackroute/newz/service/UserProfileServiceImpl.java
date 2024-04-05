package com.stackroute.newz.service;

import com.stackroute.newz.model.UserProfile;
import com.stackroute.newz.repository.UserProfileRepository;
import com.stackroute.newz.util.exception.UserProfileAlreadyExistsException;
import com.stackroute.newz.util.exception.UserProfileNotExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/*
 * This class is implementing the UserProfileRepository interface. This class has to be annotated with 
 * @Service annotation.
 * @Service - is an annotation that annotates classes at the service layer, thus 
 * clarifying it's role.
 * 
 * */
@Service
@Transactional
public class UserProfileServiceImpl implements UserProfileService {
	@Autowired
	UserProfileRepository userProfileRepository;

	/*
	 * Autowiring should be implemented for the UserProfileRepository.
	 */
	


	/*
	 * Add a new user. Throw UserProfileAlreadyExistsException if the userProfile with specified
	 * userId already exists.
	 */
	public UserProfile registerUser(UserProfile user) throws UserProfileAlreadyExistsException {
		if(userProfileRepository.findById(user.getUserId()).isEmpty()) {
			return userProfileRepository.save(user);
		}
		throw new UserProfileAlreadyExistsException();
	}

	/*
	 * Update an existing userProfile by it's userId. Throw UserProfileNotExistsException 
	 * if the userProfile with specified userId does not exist.
	 */
	public UserProfile updateUserProfile(UserProfile user, String userId) throws UserProfileNotExistsException {
		if (userProfileRepository.getOne(userId) != null) {
			return userProfileRepository.saveAndFlush(user);
		}
		throw new UserProfileNotExistsException();
	}

	
	/*
	 * Delete an existing userProfile by it's userId. Throw UserProfileNotExistsException if 
	 * the userProfile with specified userId does not exist.
	 */
	public void deleteUserProfile(String userId) throws UserProfileNotExistsException {
		if (userProfileRepository.getOne(userId) != null) {
			userProfileRepository.deleteById(userId);
		}
		else {
			throw new UserProfileNotExistsException();
		}
		
	}
	
	
	/*
	 * Retrieve an existing userProfile by it's userId. Throw UserProfileNotExistsException 
	 * if the userProfile with specified userId does not exist.
	 */
	public UserProfile getUserProfile(String userId) throws UserProfileNotExistsException {
		return userProfileRepository.findById(userId).orElseThrow(()-> new UserProfileNotExistsException());
	}

	/*
	 * Retrieve all existing userProfiles
	 */
	public List<UserProfile> getAllUserProfiles() {
		return userProfileRepository.findAll();
	}

}
