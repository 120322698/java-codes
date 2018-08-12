package org.alanhou.monitor_tuning.chapter4;

import org.alanhou.monitor_tuning.chapter2.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ch4")
public class Ch4Controller {
	@RequestMapping("/arg1")
	public String arg1(@RequestParam("name")String name) {
		// 访问地址: http://localhost:12345/ch4/arg1?name=Java
		return "Hello, "+name;
	}
	
	@RequestMapping("/arg2")
	public User arg2(User user) {
		// 访问地址: http://localhost:12345/ch4/arg2?name=Java&id=1
		return user;
	}
	
	@RequestMapping("/contructor")
	public User contructor(User user) {
		// 访问地址: http://localhost:12345/ch4/contructor?name=Java&id=1
		return user;
	}
	
	@RequestMapping("/same1")
	public String same(@RequestParam("name")String name) {
		// 访问地址: http://localhost:12345/ch4/same1?name=Java
		return "Hello, "+name;
	}
	
	@RequestMapping("/same2")
	public String same(@RequestParam("name")String name, @RequestParam("id")int id) {
		// 访问地址: http://localhost:12345/ch4/same2?name=Java&=1
		return "Hello, "+name+", "+id;
	}
	
	@RequestMapping("/exception")
	public String exception() {
		// 访问地址: http://localhost:12345/ch4/exception
		try {
			System.out.print("start...");
			System.out.print(1/0);
			System.out.print("end...");
		}catch(Exception e) {
			
		}
		return "success";
	}
}
