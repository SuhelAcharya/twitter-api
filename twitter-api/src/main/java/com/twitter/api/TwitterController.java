package com.twitter.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.Status;


@RestController
public class TwitterController {

	@Autowired
	private TwitterService twitterService;
	
	@RequestMapping("/tweets")
	public List<Status> getTweets(){
		
		return twitterService.getLatestTweets();
	}
	
}
