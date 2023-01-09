package com.masai;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TwitterService implements MessageService {

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Twitter : " + message);
	}

}
