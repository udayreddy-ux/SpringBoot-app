package com.jobproject.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/student")
	public String home() {
		System.out.println("Reaching Method");
		return "index.jsp";
	}
}
