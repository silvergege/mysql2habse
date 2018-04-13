package com.example.mysql2hbase.mapper;

import com.example.mysql2hbase.bean.QueryModel;
import com.example.mysql2hbase.po.VisPushMessageLog;
import com.example.mysql2hbase.po.VisPushMessageLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisPushMessageLogMapper {
    int countByExample(VisPushMessageLogExample example);

    int deleteByExample(VisPushMessageLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VisPushMessageLog record);

    int insertSelective(VisPushMessageLog record);

    List<VisPushMessageLog> selectByExample(VisPushMessageLogExample example);

    VisPushMessageLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VisPushMessageLog record, @Param("example") VisPushMessageLogExample example);

    int updateByExample(@Param("record") VisPushMessageLog record, @Param("example") VisPushMessageLogExample example);

    int updateByPrimaryKeySelective(VisPushMessageLog record);

    int updateByPrimaryKey(VisPushMessageLog record);
    
    List<VisPushMessageLog> selectLogsByVin(@Param("vin") String vin,@Param("nodeId") String nodeId);
    
    List<VisPushMessageLog> selectLogsByTime(QueryModel model);
    
    Integer countLogsByTime(QueryModel model);
}