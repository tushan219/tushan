package com.zd.ts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Control {
	@RequestMapping("/a")
	@ResponseBody
	public String show(){
		
		return"zd";
	}
}
