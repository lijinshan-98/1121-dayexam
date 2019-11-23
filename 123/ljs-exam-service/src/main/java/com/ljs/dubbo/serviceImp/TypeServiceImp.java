package com.ljs.dubbo.serviceImp;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ljs.dubbo.bean.Types;
import com.ljs.dubbo.bean.User;
import com.ljs.dubbo.mapper.TypeMapper;
import com.ljs.dubbo.service.TypeService;

@Service
@Component
public class TypeServiceImp implements TypeService{
	@Autowired
	private TypeMapper tmapper;
	@Override
	public List<Types> findtp() {
		// TODO Auto-generated method stub
		return tmapper.findtp();
	}
}
