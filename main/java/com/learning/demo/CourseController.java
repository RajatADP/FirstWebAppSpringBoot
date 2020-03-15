package com.learning.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

	@RequestMapping("/courses")
	// @ResponseBody - only if u want to return specific data eg-course.jsp
	public String courses() {
		return "course";
	}
}
