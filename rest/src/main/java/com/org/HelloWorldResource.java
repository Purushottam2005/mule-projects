package com.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/myrest")
public class HelloWorldResource {

	@GET
	public String getWelcomeMsg() throws Exception {
		return "Hi MuleCookBook";
	}
	
	@GET
	@Path("/myowner")
	public String getOwner() throws Exception {
		return "Yes master!";
	}
}
