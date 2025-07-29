package com.kyh.system.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyh.system.mapper.ManagementMapper;
import com.kyh.system.model.Management;
import com.kyh.system.service.ManagementService;

@Service(value = "ManagementService")
public class ManagementServiceImpl implements ManagementService{
	
	@Autowired
	private ManagementMapper managementMapper;

	@Override
	public Management getManagementById(int category1, int category2, int category3) {
		// TODO 自動生成されたメソッド・スタブ
		return managementMapper.selectManagementById(category1, category2, category3);
	}
}
