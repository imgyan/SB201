package com.masai;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SMSService implements MessageService{

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("SMS : " + message);
	}

}
