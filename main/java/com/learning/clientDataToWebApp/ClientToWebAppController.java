package com.learning.clientDataToWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//public class ClientToWebAppController {
//
//	@RequestMapping("/client")
//	public String clientToWebApp(HttpServletRequest req) {
//		HttpSession httpSession = req.getSession();
//		String clientName = req.getParameter("cname");
//		httpSession.setAttribute("clientName", clientName);
//		return "clientToWeb";
//	}
//}
