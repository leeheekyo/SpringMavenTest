package com.naver.blog.kyoworld;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringTestController {
	@GetMapping("/")
	@ResponseBody
	public String getRoot(@RequestParam("name") @Nullable String name) {
		StringBuffer returnStrBuffer = new StringBuffer();
		returnStrBuffer.append("hello");
		if(name != null) {
			returnStrBuffer.append(" " + name + "!");
		}
		return returnStrBuffer.toString();
	}
}
