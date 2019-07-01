package com.chat.graduated;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chat.graduated.model.GetUserInfo;
import com.chat.graduated.model.Join;
import com.chat.graduated.model.Profile;
import com.chat.graduated.model.User;
import com.chat.graduated.vo.Uservo;

@Controller
public class IndexController {
	String a;
	String res;
    @RequestMapping(value = "loginProcess",method=RequestMethod.POST)
    public String hello(@ModelAttribute Uservo vo,Model model,HttpSession session) {
    	System.out.println(vo.getId());
    	System.out.println(vo.getPw());
    	User user=new User();
    	a=user.check(vo.getId(),vo.getPw());
    	if(a.equals("admin_NO")) {
    		res="index";
    		
    	}
    	else {
    		Uservo userinfo= new Uservo();
    		GetUserInfo info = new GetUserInfo();
    		userinfo=info.check();
    		System.out.println(userinfo.getId());
    		session.setAttribute("id",userinfo.getId());
    		session.setAttribute("name",userinfo.getName());
    		session.setAttribute("email",userinfo.getEmail());
    		res="success";
    	}
    	model.addAttribute("user", vo);
    	
        return res;
    }
    
    private Uservo info() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value="/join",method=RequestMethod.POST)
    public String join( @RequestParam(value="id", required=true) String userId
            , @RequestParam(value="pw",required=true) String password
            , @RequestParam(value="email",required=true) String email
            , @RequestParam(value="name",required=true) String name
            , @RequestParam(value="birth",required=true) int birth
            , @RequestParam(value="password_check",required=true) String password_check
            , HttpServletRequest request
            , HttpServletResponse response
             ) throws Exception{
         System.out.println(userId);
         System.out.println(password);
         System.out.println(name);
         Join join = new Join();
         int a;
     	if(password.equals(password_check)) {
     		a=join.insert(userId, password, email,name,birth);
     		if(a==1) {
     			 response.setContentType("text/html; charset=UTF-8");
                 PrintWriter out = response.getWriter();
                 out.println("<script>alert('ID가 중복입다'); history.go(-1);</script>");
                 out.flush(); 
     		}
     		
     	}
     		else {
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('비밀번호를 확인해 주세요.'); history.go(-1);</script>");
            out.flush(); 
     		}
         
        return "joinsuccess";
    }
    
    /*@RequestMapping(value="/profile",method= RequestMethod.GET)
    public String profile(@ModelAttribute Uservo vo,Model model
    		 ,HttpServletRequest request
             , HttpServletResponse response
             ,HttpSession session) {
    	Profile profile = new Profile();
    	String id = (String)session.getAttribute("id");
    	vo=profile.select(id);
    	session.setAttribute("user",vo);
    	System.out.println(vo.getEmail());
    	return "profile";
    }*/
    
    @RequestMapping(value="/chat",method= RequestMethod.GET)
    public String chat() {
    	
    	return "chat";
    }
    @RequestMapping(value="/personal",method= RequestMethod.GET)
    public String personal(HttpSession session) {
    	session.setAttribute("mode", "personal");
    	String a=String.valueOf(session.getAttribute("mode"));
    	
    	return a;
    }
    @RequestMapping(value="/index",method= RequestMethod.GET)
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "index";
    }
    @RequestMapping(value="/group",method= RequestMethod.GET)
    public String group() {
    	
    	return "makegroup";
    }
    @RequestMapping(value="/useradd",method= RequestMethod.GET)
    public String useradd() {
    	
    	return "useradd";
    }
    @RequestMapping(value="/calender",method= RequestMethod.GET)
    public String calender() {
    	
    	return "calender";
    }
    @RequestMapping(value="/messageview",method= RequestMethod.GET)
    public String messageview() {
    	
    	return "messageview";
    }
    @RequestMapping(value="/personalchat",method= RequestMethod.GET)
    public String personalchat() {
    	
    	return "personalchat";
    }
    @RequestMapping(value="/profile",method= RequestMethod.GET)
    public String profile() {
    	return "profile";
    }
    
}