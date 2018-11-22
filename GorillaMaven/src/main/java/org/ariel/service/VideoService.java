package org.ariel.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import org.ariel.response.Output;
import org.ariel.response.Video;

public class VideoService {
	
	public Output getVideos() {
		
		Client c = ClientBuilder.newClient();
		Output o = c.target("https://k1bryvip52.execute-api.us-east-1.amazonaws.com/Prod/").request(MediaType.APPLICATION_JSON).get(Output.class);
		
		return o;
		
	}
	
}
