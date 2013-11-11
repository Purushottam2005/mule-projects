package com.org;

import javax.jws.WebService;

@WebService
public interface HelloService {
	
	String hiMule(String str) throws Exception;
	
}
