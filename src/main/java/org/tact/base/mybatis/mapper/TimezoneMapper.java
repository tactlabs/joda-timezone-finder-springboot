package org.tact.base.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.tact.base.mybatis.domain.Timezone;

@Mapper
public interface TimezoneMapper {

	List<Timezone> findByNameLike(@Param("NAME") String name);	
	
}