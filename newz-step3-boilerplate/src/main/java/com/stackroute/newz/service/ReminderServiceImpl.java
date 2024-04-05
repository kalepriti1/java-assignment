package com.stackroute.newz.service;

import com.stackroute.newz.model.Reminder;
import com.stackroute.newz.repository.ReminderRepository;
import com.stackroute.newz.util.exception.ReminderNotExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * This class is implementing the ReminderService interface. This class has to be annotated with 
 * @Service annotation.
 * @Service - is an annotation that annotates classes at the service layer, thus 
 * clarifying it's role.
 * 
 * */
@Service
public class ReminderServiceImpl implements ReminderService {
	@Autowired
	ReminderRepository reminderRepository;

	/*
	 * Autowiring should be implemented for the ReminderRepository.
	 */
	

	/*
	 * Add a new reminder.
	 */
	public Reminder addReminder(Reminder reminder) {
		return reminderRepository.save(reminder);
	}

	/*
	 * Update an existing reminder by it's reminderId. Throw ReminderNotExistsException 
	 * if the reminder with specified reminderId does not exist.
	 */
	public Reminder updateReminder(Reminder reminder) throws ReminderNotExistsException {
		if(reminderRepository.getOne(reminder.getReminderId())!=null) {
			return reminderRepository.saveAndFlush(reminder);
		}
		throw new ReminderNotExistsException();

	}

	/*
	 * Delete an existing reminder by it's reminderId. Throw ReminderNotExistsException if 
	 * the reminder with specified reminderId does not exist.
	 */
	public void deleteReminder(int reminderId) throws ReminderNotExistsException {
		if(reminderRepository.getOne(reminderId) != null) {
			reminderRepository.deleteById(reminderId);
		}
		else {
			throw new ReminderNotExistsException();
		}
	
	}

	/*
	 * Retrieve an existing reminder by it's reminderId. Throw ReminderNotExistsException 
	 * if the reminder with specified reminderId does not exist.
	 */
	public Reminder getReminder(int reminderId) throws ReminderNotExistsException {
		return reminderRepository.findById(reminderId).orElseThrow(()-> new ReminderNotExistsException());
	}

	/*
	 * Retrieve all existing reminders
	 */
	public List<Reminder> getAllReminders() {
		return reminderRepository.findAll();
	}

}
