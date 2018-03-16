package com.zym.kbm.service.interfaces;

import java.text.ParseException;
import java.util.List;

import com.zym.kbm.dto.Labean;


public interface LuceneService {
	
	/**
	 * 根据参数检索所有知识文件
	 * @param param
	 * @return
	 * @throws ParseException 
	 */
	List<Labean> getDataByParam(String param) throws ParseException;
	
	
	
}
