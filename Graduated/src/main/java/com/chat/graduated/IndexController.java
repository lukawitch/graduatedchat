package com.chat.graduated;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class IndexController {
	int a;
	String res;
    @RequestMapping(value = "/hello",method=RequestMethod.POST)
    public String hello() {
   
 
    	
    		res="index";

    	
        return res;
}
}