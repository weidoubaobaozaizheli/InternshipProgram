package com.ncs.weidou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@ResponseBody
	@RequestMapping("/show")
	public String aa() {
		return "hello";
	}
}
