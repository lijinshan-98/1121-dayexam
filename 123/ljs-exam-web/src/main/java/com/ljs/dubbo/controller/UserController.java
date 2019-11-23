package com.ljs.dubbo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.ljs.dubbo.bean.Spe;
import com.ljs.dubbo.bean.Types;
import com.ljs.dubbo.bean.User;
import com.ljs.dubbo.service.TypeService;
import com.ljs.dubbo.service.UserService;

@Controller
public class UserController {
	@Reference(url = "dubbo://localhost:20881")
	private UserService service;
	@Reference(url = "dubbo://localhost:20881")
	private TypeService mservice;
	
	@GetMapping("/list")
	public String getlist(Model model,Spe spe,
			@RequestParam(defaultValue = "1")int page,
			@RequestParam(defaultValue = "5")int size,
			@RequestParam(defaultValue = "")String people,
			@RequestParam(defaultValue = "")String doing,
			@RequestParam(defaultValue = "")String cname
			) {
		Map<String,Object> map = new HashMap<String,Object>();
		int cpage = (page-1)*size;
		map.put("cpage", cpage);
		map.put("size", size);
		map.put("people", people);
		map.put("doing", doing);
		map.put("cname", cname);
		
		List<User> list = service.getlist(map);
		int count = service.getcount(map);
		int totle = count/size == 0? count/size:count/size+1;
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("totle", totle);
		return "list";
		
	}
	@GetMapping("addOne")
	public String addOne(Model model) {
		//跳转
		List<Types> findtplist = mservice.findtp();
		model.addAttribute("findtplist", findtplist);
		return "addOne";
	}
	@PostMapping("add")
	public String add(User user) {
		
		service.add(user);
		
		return "index";
	}
	@GetMapping("index")
	public String index( ) {

		return "index";
	}
	@PostMapping("deleteOne")
	@ResponseBody
	public int deleteOne(Spe spe) {
		
		int flag = service.deleteOne(spe);
		return flag;
	}
	@GetMapping("updateOne")
	public String updateOne(Model model,Spe spe) {
		
		List<User> findUplist = service.findUplist(spe);
		List<Types> findtplist = mservice.findtp();
		model.addAttribute("findtplist", findtplist);
		model.addAttribute("findUplist", findUplist);
		return "update";
	}
	@PostMapping("update")
	public String update(User user) {
		int flag = service.update(user);
		if(flag>0) {
			return "index";
		}else {
			return "update";
		}
	}
}
