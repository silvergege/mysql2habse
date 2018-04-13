package com.example.mysql2hbase.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysql2hbase.bean.QueryModel;
import com.example.mysql2hbase.mapper.VisPushMessageLogMapper;
import com.example.mysql2hbase.po.VisPushMessageLog;
import com.example.mysql2hbase.service.F1MessageService;
import com.github.pagehelper.PageHelper;

@Service
public class F1MessageServiceImpl implements F1MessageService{
	
	@Autowired
	private VisPushMessageLogMapper visMapper;

	@Override
	public List<VisPushMessageLog> getVisPushMessageLog10ByVin(String vin) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -2);
		PageHelper.startPage(0,10);
		List<VisPushMessageLog> logs = visMapper.selectLogsByVin(vin, sdf.format(calendar.getTime()).toString());
		return logs;
	}

	@Override
	public List<VisPushMessageLog> getList(QueryModel model) {
		List<VisPushMessageLog> logs = visMapper.selectLogsByTime(model);
		return logs;
	}

	@Override
	public Integer countList(QueryModel model) {
		Integer countNum = visMapper.countLogsByTime(model);
		return countNum;
	}
}
