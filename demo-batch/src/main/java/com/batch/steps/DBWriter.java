package com.batch.steps;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.batch.dto.User;
import com.batch.repository.UserRepository;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

	@Autowired
	private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception{
        System.out.println("Data Saved for Users: " + users);
        userRepository.saveAll(users);
    }
}