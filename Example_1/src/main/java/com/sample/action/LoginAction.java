package com.sample.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sample.form.LoginForm;
import com.sample.pojo.User;

public class LoginAction  extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginForm helloWorldForm= (LoginForm) form;
		User user;
		List<User> users=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			user=new User();
			user.setName("name "+i);
			user.setPwd("pwd: "+i);
			user.setIsAdmin(false);
			users.add(user);
		}
		helloWorldForm.setUserList(users);
		request.getSession().setAttribute("user", users);
		System.out.println("HelloWorldAction.execute()");
		return mapping.findForward("success");
	}
}
