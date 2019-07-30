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

import com.chat.graduated.model.GetUserInfo;
import com.chat.graduated.model.Grouplist;
import com.chat.graduated.model.Join;
import com.chat.graduated.model.ProfileEdit;
import com.chat.graduated.model.SearchUser;
import com.chat.graduated.model.User;
import com.chat.graduated.vo.Groupvo;
import com.chat.graduated.vo.Uservo;

@Controller
public class IndexController {
	String a;
	String res;

	@RequestMapping(value = "loginProcess", method = RequestMethod.POST)
	public String hello(@ModelAttribute Uservo vo, Model model, HttpSession session) {
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		User user = new User();
		a = user.check(vo.getId(), vo.getPw());
		if (a.equals("admin_NO")) {
			res = "redirect:/main";

		} else {
			Uservo userinfo = new Uservo();
			GetUserInfo info = new GetUserInfo();
			userinfo = info.check(vo.getId());
			System.out.println(userinfo.getId());
			session.setAttribute("id", userinfo.getId());
			session.setAttribute("name", userinfo.getName());
			session.setAttribute("email", userinfo.getEmail());
			res = "redirect:/main";
		}
		model.addAttribute("user", vo);

		return res;
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
		System.out.println(userId);
		System.out.println(password);
		System.out.println(name);
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

	/*
	 * @RequestMapping(value="/profile",method= RequestMethod.GET) public String
	 * profile(@ModelAttribute Uservo vo,Model model ,HttpServletRequest request
	 * , HttpServletResponse response ,HttpSession session) { Profile profile =
	 * new Profile(); String id = (String)session.getAttribute("id");
	 * vo=profile.select(id); session.setAttribute("user",vo);
	 * System.out.println(vo.getEmail()); return "profile"; }


	@RequestMapping(value = "/chat", method = RequestMethod.GET)
	public String chat(@RequestParam(value = "pin", required = true) String pin, Model model) {
		Grouplist gg = new Grouplist();
		List<Groupvo> vo = new ArrayList<Groupvo>();
		vo = gg.gmemberlist(pin);
		model.addAttribute("GG", vo);
		//System.out.println(vo.get);
		return "chat";
	} */
	@RequestMapping(value = "/chat")
	public String chat(@RequestParam(value = "pin", required = true) String pin, Model model) {
		Grouplist gg = new Grouplist();
		List<Groupvo> vo = new ArrayList<Groupvo>();
		vo = gg.gmemberlist(pin);
		model.addAttribute("GG", vo);
		//System.out.println(vo.get);
		//for(int i=0;i<vo.size();i++){System.out.println("controller에서 "+vo.get(i).getUserid());}
		return "chat";
	}



	/*
	@RequestMapping(value = "/chat")
	public ModelAndView boardList(@RequestParam(value = "pin", required = true) String pin) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("model", list);

		return new ModelAndView("list","ex",map);

	}*/

	@RequestMapping(value = "/personal", method = RequestMethod.GET)
	public void personal() {

	}

	@RequestMapping(value = "/mode", method = RequestMethod.GET)
	public String mode(HttpSession session) {
		String a = null;
		if (session.getAttribute("mode") == null) {
			System.out.println("ddd");
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

	@RequestMapping(value = "/group", method = RequestMethod.GET)
	public void group() {

	}

	@RequestMapping(value = "/useradd", method = RequestMethod.GET)
	public void useradd() {

	}

	@RequestMapping(value = "/searchuser", method = RequestMethod.POST)
	public String searchuser(@RequestParam(value = "id", required = true) String userId) {
		SearchUser search = new SearchUser();
		Uservo user = new Uservo();
		user = search.check(userId);
		System.out.println(user.getId());
		System.out.println(user.getName());
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
		System.out.println(username);
		System.out.println(useremail);
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
			System.out.println(userinfo.getId());
			session.setAttribute("id", userinfo.getId());
			session.setAttribute("name", userinfo.getName());
			session.setAttribute("email", userinfo.getEmail());
		}
		return a;
	}
	@RequestMapping(value="/usergroupadd",method= RequestMethod.GET)
	public void usergrupadd() {

	}
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "success";
	}

}
