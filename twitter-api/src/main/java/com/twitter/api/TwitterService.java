package com.twitter.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

@Service
public class TwitterService {
	
	@Autowired
	private Twitter twitter;
	
	public List<Status> getLatestTweets(){
		
		ResponseList<Status> statusReponseList = null;
		try {
			statusReponseList = twitter.getUserTimeline(new Paging(1, 10));
			for (Status status : statusReponseList) {
				//System.out.println(status.getText());
				statusReponseList.add(status);
			}
		} catch (TwitterException e) {
			e.printStackTrace();
		}
		return statusReponseList;
		
//		List<Twitter> tweets = new ArrayList<>();
//		try {
//			ResponseList<Status> homeTimeline = twitter.getHomeTimeline();
//			for (Status status : homeTimeline) {
//				status.getText().
//			}
//		} catch (TwitterException e) {
//			throw new RuntimeException(e);
//		}
//		return tweets;
	}
	
	public void tweetPost(String tweet) {
		
		Status status;
		try {
			status = twitter.updateStatus(tweet);
		} catch (TwitterException e) {
		}
	}
}