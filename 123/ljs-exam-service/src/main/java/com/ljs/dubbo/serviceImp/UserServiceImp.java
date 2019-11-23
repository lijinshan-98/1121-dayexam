package com.ljs.dubbo.serviceImp;

import java.util.List;
import java.util.Map;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ljs.dubbo.bean.Spe;
import com.ljs.dubbo.bean.Types;
import com.ljs.dubbo.bean.User;
import com.ljs.dubbo.mapper.UserMapper;
import com.ljs.dubbo.service.UserService;
@Service
@Component
public class UserServiceImp implements UserService{
	@Autowired
	private UserMapper mapper;
	
	@Override
	public List<User> getlist(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.getlist(map);
	}
	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return mapper.add(user);
	}
	@Override
	public int deleteOne(Spe spe) {
		// TODO Auto-generated method stub
		return mapper.deleteOne(spe);
	}
	@Override
	public int getcount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.getcount(map);
	}
	@Override
	public List<User> findUplist(Spe spe) {
		// TODO Auto-generated method stub
		return mapper.findUplist(spe);
	}
	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return mapper.update(user);
	}
}
