package com.twitter.api;

import twitter4j.TwitterFactory;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.auth.AccessToken;

public class Test {
	
	public static void main(String[] args) {
		
		Twitter twitter = new TwitterFactory().getInstance();
	    twitter.setOAuthConsumer("KA3cfbu9l5kNnnb9oDvKRFEic", "N4dYGzI6ZcwZHXJkrtfzetsDMEOaPAbR2G5GSG8Y1kWmTzc2BP");
	    twitter.setOAuthAccessToken(new AccessToken("1087580310894714881-AJ3YPzsopQZTkJJDWbDEvrLvdY5s5U",
	    "sJsybxO6zGIlixTLxaKAFPuA5FVct721KFLcm3OXkvpLY"));
	    
		try {
			ResponseList<Status> statusReponseList = twitter.getUserTimeline(new Paging(1, 10));
			for (Status status : statusReponseList) {
				System.out.println(status.getText());
			}
			
//			Status status = twitter.updateStatus("Hello");
//			System.out.println("Successfully updated the status to [" + status.getText() + "].");
		} catch (Exception e) {
		}
	}

}
