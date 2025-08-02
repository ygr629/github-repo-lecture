package com.kyh.system.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyh.system.mapper.SyainMapper;
import com.kyh.system.model.Syain;
import com.kyh.system.service.SyainService;

@Service(value = "SyainService")
public class SyainServiceImpl implements SyainService{
	
	@Autowired
	private SyainMapper syainMapper;
	
	@Override
	public Syain getSyainById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(id);
		return syainMapper.selectSyainById(id);
	}
	@Override
	public List<Syain> getFilteredSyainList(Integer syokugyoKind, Integer syozokuKaisya, String syainName, Integer zaisekiNum) {
	    return syainMapper.selectAllSyainWithFilter(syokugyoKind,syozokuKaisya,syainName, zaisekiNum);
	}
	@Override
	public void deleteSyainById(Integer syainId) {
	    syainMapper.deleteSyainById(syainId);
		
		
	}
	@Override
	public void save(Syain form) {
		syainMapper.saveSyain(form);
		
		
	}

}
