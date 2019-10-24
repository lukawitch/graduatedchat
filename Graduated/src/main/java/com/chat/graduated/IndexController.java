package com.chat.graduated;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chat.graduated.model.Countgroupaccept;
import com.chat.graduated.model.GetGroupAccept;
import com.chat.graduated.model.GetUserInfo;
import com.chat.graduated.model.Grouplist;
import com.chat.graduated.model.Join;
import com.chat.graduated.model.ProfileEdit;
import com.chat.graduated.model.SearchUser;
import com.chat.graduated.model.SearchUserMember;
import com.chat.graduated.model.StateEdit;
import com.chat.graduated.model.User;
import com.chat.graduated.vo.GetGroupMember;
import com.chat.graduated.vo.Groupvo;
import com.chat.graduated.vo.Uservo;

@Controller
public class IndexController {
	String a;
	String res;

	@RequestMapping(value = "loginProcess", method = RequestMethod.POST)
	public String hello(@ModelAttribute Uservo vo, Model model, HttpSession session) {
		/*System.out.println(vo.getId());
		System.out.println(vo.getPw());*/
		User user = new User();
		a = user.check(vo.getId(), vo.getPw());
		if (a.equals("admin_NO")) {
			res = "redirect:/main";

		} else {
			Uservo userinfo = new Uservo();
			GetUserInfo info = new GetUserInfo();
			userinfo = info.check(vo.getId());
			//System.out.println(userinfo.getId());
			session.setAttribute("id", userinfo.getId());
			session.setAttribute("name", userinfo.getName());
			session.setAttribute("email", userinfo.getEmail());
			GetGroupAccept groupaccept = new GetGroupAccept();
			ArrayList<GetGroupMember> group = groupaccept.check(userinfo.getId());
			
			session.setAttribute("groupaccept", group);
			System.out.println("controller - group 첫번째 이름"+group.get(0).getGroupname());
			
			
			res = "redirect:/main";
		}
		model.addAttribute("user", vo);

		return res;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/main")
	public ModelAndView main(HttpSession session, ModelAndView mav) {
		String userid = (String) session.getAttribute("id");
		System.out.println("/main : " + userid);
		
/*		Grouplist model = new Grouplist();
		List<Groupvo> glist = model.grouplist(userid);
		for(int i=0;i<glist.size();i++) {
//			System.out.println("/success - controller : "+glist.get(i).getName());
		}*/
		ArrayList<GetGroupMember> list = new ArrayList<GetGroupMember>();
		list = (ArrayList<GetGroupMember>) session.getAttribute("groupaccept");

		mav.setViewName("/success"); // 뷰의 이름
		mav.addObject("glist", list);
		
		return mav;
	}
	
	@RequestMapping(value = "/accept", method = RequestMethod.GET)
	public String accept( HttpSession session,
			@RequestParam(value = "state", required = true) String state,
			@RequestParam(value = "group", required = true) String group) {
		String id = (String)session.getAttribute("id");
		if(state.equals("apply")) {
			StateEdit edit = new StateEdit();
			edit.update("apply",id,group);
		}
		
		return "redirect:/main";

	}

	

	private Uservo info() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@RequestParam(value = "id", required = true) String userId,
			@RequestParam(value = "pw", required = true) String password,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "birth", required = true) int birth,
			@RequestParam(value = "password_check", required = true) String password_check, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/*System.out.println(userId);
		System.out.println(password);
		System.out.println(name);*/
		Join join = new Join();
		int a;
		if (password.equals(password_check)) {
			a = join.insert(userId, password, email, name, birth);
			if (a == 1) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('ID媛� 以묐났�엯�떎'); history.go(-1);</script>");
				out.flush();
			}

		} else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('鍮꾨�踰덊샇瑜� �솗�씤�빐 二쇱꽭�슂.'); history.go(-1);</script>");
			out.flush();
		}

		return "joinsuccess";
	}
	@RequestMapping(value = "/chat")
	public String chat(@RequestParam(value = "groupname", required = true) String groupname, Model model) {
		Grouplist gg = new Grouplist();
		ArrayList<GetGroupMember> vo = new ArrayList<>();
		vo = gg.gmemberlist(groupname);
		model.addAttribute("GG", vo);
		return "chat";
	}

	
	@RequestMapping(value = "/personal", method = RequestMethod.GET)
	public void personal() {

	}

	@RequestMapping(value = "/search_member", method = RequestMethod.POST)
	public String search_member(
			@RequestParam(value = "id", required = true) String userId,HttpSession session) {
		SearchUser search = new SearchUser();
		Uservo user = new Uservo();
		user = search.check(userId);
		/*System.out.println(user.getId());
		System.out.println(user.getName());*/
		session.setAttribute("searchname",user.getName());
		session.setAttribute("searchuser",user.getId());
		return "memberadd";
	}

	@RequestMapping(value = "/memberadd", method = RequestMethod.GET)
	public void memberadd(HttpSession session) {		
		if (session.getAttribute("searchname") ==null ) {
			session.setAttribute("searchname", "mmm");
		}

	}
	
	@RequestMapping(value = "/select_friend", method = RequestMethod.GET)
	public String select_friend () {
		return "makegroup";
	}
	@RequestMapping(value = "/make_group", method = RequestMethod.GET)
	public void make_group () {
	}
	
	
	@RequestMapping(value = "/mode", method = RequestMethod.GET)
	public String mode(HttpSession session) {
		String a = null;
		if (session.getAttribute("mode") == null) {
			//System.out.println("ddd");
			session.setAttribute("mode", "personal");
			a = "redirect:/personal";
		} else if (String.valueOf(session.getAttribute("mode")).equals("personal")) {
			session.setAttribute("mode", "main");
			a = "redirect:/main";
		} else {
			session.setAttribute("mode", "personal");
			a = "redirect:/personal";
		}
		return a;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "index";
	}

	@RequestMapping(value = "/makegroup", method = RequestMethod.GET)
	public void group(HttpSession session) {
		if (session.getAttribute("friendlist") == null) {
			session.setAttribute("listcheck","reallynull");
			//System.out.println("show");
		}
		else {
			session.setAttribute("listcheck","reallylisthave");
		}

	}
	@RequestMapping(value = "/getfriendlist", method = RequestMethod.GET)
	public String getlist(HttpSession session) {

		SearchUser usersearch = new SearchUser();
		//System.out.println(a);
		ArrayList<Uservo> list;
		if(session.getAttribute("friendlist")==null) {
			list=new ArrayList<Uservo>();
		}
		else {
			list=(ArrayList<Uservo>)session.getAttribute("friendlist");
		}
		Uservo user = new Uservo();
		String id= (String)session.getAttribute("searchuser");
		String name = (String)session.getAttribute("searchname");
		user.setId(id);
		user.setName(name);

			list.add(user);
			session.removeAttribute("searchid");
            session.removeAttribute("searchname");
            	
		session.setAttribute("friendlist",list);
		return "redirect:/makegroup";
	}
	@RequestMapping(value = "/tteesstt", method = RequestMethod.POST)
	public String tt(HttpSession session,
			@RequestParam(value = "groupname", required = true) String groupname) {
		ArrayList<Uservo> list =(ArrayList<Uservo>)session.getAttribute("friendlist");
		Countgroupaccept aaa = new Countgroupaccept();
		String toid=(String)session.getAttribute("id");
	
		int a=aaa.numcheck();
		System.out.println(a);
		
		for(int i=0;i<list.size();i++) {
			a++;
			aaa.insertcheck(a,toid,list.get(i).getId(),groupname);
		}
		session.removeAttribute("friendlist");
		return "redirect:/worksuccess";
		
	}
	@RequestMapping(value = "/worksuccess", method = RequestMethod.GET)
	public void success() {
		
	}
	@RequestMapping(value = "/usermemberlist", method = RequestMethod.GET)
	public void usermemberlist(HttpSession session) {
		SearchUserMember search = new SearchUserMember();
		String id=(String) session.getAttribute("id");
		ArrayList<Uservo>list= new ArrayList<>();
		list=search.check(id);
		/*for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getId());
			System.out.println(list.get(i).getName());
			
		}*/
		session.setAttribute("list", list);
	}

	@RequestMapping(value = "/useradd", method = RequestMethod.GET)
	public void useradd(HttpSession session) {
		if (session.getAttribute("searchname") ==null ) {
			session.setAttribute("searchname", "mmm");
		}
	}

	@RequestMapping(value = "/searchuser", method = RequestMethod.POST)
	public String searchuser(@RequestParam(value = "id", required = true) String userId,HttpSession session) {
		SearchUser search = new SearchUser();
		Uservo user = new Uservo();
		user = search.check(userId);
		/*System.out.println(user.getId());
		System.out.println(user.getName());*/
		session.setAttribute("searchname",user.getName());
		session.setAttribute("searchuser",user.getId());
		return "redirect:/useradd";

	}

	@RequestMapping(value = "/calender", method = RequestMethod.GET)
	public void calender() {

	}

	@RequestMapping(value = "/messageview", method = RequestMethod.GET)
	public void messageview() {

	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void test() {

	}

	@RequestMapping(value = "/personalchat", method = RequestMethod.GET)
	public void personalchat() {

	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public void profile() {

	}

	@RequestMapping(value = "/modified", method = RequestMethod.GET)
	public String modified(@RequestParam(value = "user", required = true) String username,
			@RequestParam(value = "email", required = true) String useremail,
			@RequestParam(value = "password", required = true) String userpassword,
			@RequestParam(value = "passwordchk", required = true) String userpasswordchk,
			@RequestParam(value = "id", required = true) String id, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws IOException {
		/*System.out.println(username);
		System.out.println(useremail);*/
		String a = "redirect:/test";
		if (!userpassword.equals(userpasswordchk)) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('鍮꾨�踰덊샇瑜� �떎�떆 �솗�씤�빐二쇱꽭�슂!'); history.go(-1);</script>");

			response.sendRedirect("/profile");
			out.flush();
			a = "profile";
		} else {
			ProfileEdit pro = new ProfileEdit();
			pro.update(id, userpassword, useremail, username);
			Uservo userinfo = new Uservo();
			GetUserInfo info = new GetUserInfo();
			userinfo = info.check(id);
			//System.out.println(userinfo.getId());
			session.setAttribute("id", userinfo.getId());
			session.setAttribute("name", userinfo.getName());
			session.setAttribute("email", userinfo.getEmail());
		}
		return a;
	}
	@RequestMapping(value="/usergroupadd",method= RequestMethod.GET)
	public void usergrupadd( HttpSession session) {
		
		List<Groupvo> grouplist =new ArrayList<Groupvo>();
		Grouplist group=new Grouplist();
		String id = (String)session.getAttribute("id");
		grouplist=group.grouplist(id);
		for(int i=0;i<grouplist.size();i++) {
			System.out.println(grouplist.get(i).getName());
		}
		
		session.setAttribute("grouplist", grouplist);

	}
	
	
	/*@RequestMapping(value = "/success")
	public ModelAndView success1(HttpSession session,ModelAndView mav) {
		String userid = (String) session.getAttribute("id");
		Groupvo gvo = new Groupvo();
		Grouplist model = new Grouplist();
		List<Groupvo> glist = model.grouplist(userid);
		for(int i=0;i<glist.size();i++) {
			System.out.println("/success - controller : "+glist.get(i).getName());
		}
		
		mav.setViewName("/success"); // 뷰의 이름
		mav.addObject("glist", glist);
		
		return mav;
	}*/
	@RequestMapping(value = "/centerchk", method = RequestMethod.GET)
	public String centerchk(HttpSession session,
			@RequestParam(value = "check", required = true) String groupname) {
		System.out.println(groupname);
		Countgroupaccept aaa = new Countgroupaccept();
		String toid=(String)session.getAttribute("id");
		int a=aaa.numcheck();
		String fromid=(String)session.getAttribute("searchuser");
		aaa.insertcheck(a,toid,fromid,groupname);
;
		return "redirect:/worksuccess";
	}
	

}