package com.ljs.dubbo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ljs.dubbo.bean.Spe;
import com.ljs.dubbo.bean.Types;
import com.ljs.dubbo.bean.User;

public interface UserMapper {


	int add(User user);

	int deleteOne(Spe spe);

	List<User> getlist(Map<String, Object> map);

	int getcount(Map<String, Object> map);

	List<User> findUplist(Spe spe);

	int update(User user);
	
}
