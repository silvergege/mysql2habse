package com.example.mysql2hbase.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysql2hbase.bean.JsonResult;
import com.example.mysql2hbase.bean.QueryModel;
import com.example.mysql2hbase.po.VisPushMessageLog;
import com.example.mysql2hbase.service.F1MessageService;

@RestController
public class F1MessageController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private F1MessageService service;
	
	/**
	 * 查询10条日志
	 * @return
	 */
	@RequestMapping(value = "get10ByVin/vin", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> get10ByVin (@PathVariable(value = "vin") String vin){
		logger.info("查询的vin：" + vin);
		JsonResult r = new JsonResult();
		try {
			List<VisPushMessageLog> logs = service.getVisPushMessageLog10ByVin(vin);
			r.setResult(logs);
			r.setStatus("ok");
		} catch (Exception e) {
			logger.error("查询vin异常：" + e.getMessage());
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
		}
		return ResponseEntity.ok(r);
	}
	
	/**
	 * 按时间查询信息
	 * @return
	 */
	@RequestMapping(value = "getDataList", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> getDataList (String startTime, String endTime, Integer pageNum, Integer pageSize, String year){
		logger.info("按时间查询接口," + "开始时间：" + startTime + ",结束时间：" + endTime
		+ ",查询条数：" + pageSize + ",查询开始条数：" + pageNum * pageSize);
		JsonResult r = new JsonResult();
		QueryModel model = new QueryModel();
		model.setStartTime(startTime);
		model.setEndTime(endTime);
		model.setPageNum(pageNum);
		model.setPageSize(pageSize);
		model.setYear(year);
		try {
			List<VisPushMessageLog> logs = service.getList(model);
			r.setResult(logs);
			r.setStatus("ok");
		} catch (Exception e) {
			logger.error("按时间查询接口异常" + e.getMessage());
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
		}
		return ResponseEntity.ok(r);
	}
	
	/**
	 * 按时间查询信息
	 * @return
	 */
	@RequestMapping(value = "getDataListNum", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> getDataListNum (String startTime, String endTime, Integer pageNum, Integer pageSize, String year){
		logger.info("按时间查询总数接口," + "开始时间：" + startTime + ",结束时间：" + endTime);
		JsonResult r = new JsonResult();
		QueryModel model = new QueryModel();
		model.setStartTime(startTime);
		model.setEndTime(endTime);
		model.setYear(year);
		try {
			Integer countNum = service.countList(model);
			r.setResult(countNum);
			r.setStatus("ok");
		} catch (Exception e) {
			logger.error("按时间查询总数接口异常" + e.getMessage());
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
		}
		return ResponseEntity.ok(r);
	}
}
