package com.kyh.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kyh.system.model.Syain;

public interface SyainMapper {

	Syain selectSyainById(Integer example);
	
	List<Syain> selectAllSyainWithFilter(
			@Param("syokugyoKind") Integer syokugyoKind,
            @Param("syozokuKaisya") Integer syozokuKaisya,
			String syainName,
			Integer zaisekiNum
            );
    void deleteSyainById(Integer syainId);
    
    void saveSyain(Syain syain);

}
