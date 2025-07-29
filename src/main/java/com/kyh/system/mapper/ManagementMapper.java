package com.kyh.system.mapper;

import com.kyh.system.model.Management;

public interface ManagementMapper {
	Management selectManagementById(int category1, int category2, int category3);

}