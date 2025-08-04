package com.kyh.system.service;


import java.util.List;

import com.kyh.system.model.Syain;

public interface SyainService {
	public Syain getSyainById(Integer id);
	List<Syain> getFilteredSyainList(Integer syokugyoKind, Integer syozokuKaisya, String syainName, Integer zaisekiNum);
	public void deleteSyainById(Integer syainId);
	public void save(Syain form);
	public void update(Syain form);
}
