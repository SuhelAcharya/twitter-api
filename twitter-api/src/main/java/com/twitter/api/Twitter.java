package com.twitter.api;

import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class Twitter {
	
	@Id
	private int id;
	private String tweet;
	
	public Twitter() {
		
	}
	
	public String getTweet() {
		return tweet;
	}

	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
}
