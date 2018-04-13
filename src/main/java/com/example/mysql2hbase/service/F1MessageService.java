package com.example.mysql2hbase.service;

import java.util.List;

import com.example.mysql2hbase.bean.QueryModel;
import com.example.mysql2hbase.po.VisPushMessageLog;

public interface F1MessageService {
	
	List<VisPushMessageLog> getVisPushMessageLog10ByVin(String vin);
	
	List<VisPushMessageLog> getList(QueryModel model);
	
	Integer countList(QueryModel model);
}
