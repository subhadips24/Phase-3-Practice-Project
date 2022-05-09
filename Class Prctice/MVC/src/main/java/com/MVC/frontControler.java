package com.MVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class frontControler {
		@ResponseBody
		@RequestMapping("/first")
		public String abc(HttpServletRequest request,HttpServletResponse response) {
			
			return "Your Id is: "+request.getParameter("id");
		}
}
