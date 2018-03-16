package com.zym.kbm.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zym.kbm.dto.Labean;
import com.zym.kbm.service.interfaces.LuceneService;

@Service
public class LuceneServiceImpl implements LuceneService {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public List<Labean> getDataByParam(String param) throws ParseException {
		List<Labean> result = new ArrayList<>();
		if(param.equals("1")){
			result.add(new Labean("开发部-张一铭-2017年度工作总结01.pptx", sdf.parse("2017-12-01"), "新年伊始，特向过去的一年...", "100"));	
		}else if(param.equals("2")){
			result.add(new Labean("开发部-张一铭-2017年度工作总结01.pptx", sdf.parse("2017-12-02"), "新年伊始，特向过去的一年...", "101"));
			result.add(new Labean("开发部-张一铭-2017年度工作总结02.pptx", sdf.parse("2017-12-03"), "新年伊始，特向过去的一年...", "102"));
		}else{
			result.add(new Labean("开发部-张一铭-2017年度工作总结01.pptx", sdf.parse("2017-12-04"), "新年伊始，特向过去的一年...", "103"));
			result.add(new Labean("开发部-张一铭-2017年度工作总结02.pptx", sdf.parse("2017-12-05"), "新年伊始，特向过去的一年...", "104"));
			result.add(new Labean("开发部-张一铭-2017年度工作总结03.pptx", sdf.parse("2017-12-06"), "新年伊始，特向过去的一年...", "105"));
			result.add(new Labean("开发部-张一铭-2017年度工作总结04.pptx", sdf.parse("2017-12-07"), "新年伊始，特向过去的一年...", "106"));
		}
		
		return result;
	}
	
}
