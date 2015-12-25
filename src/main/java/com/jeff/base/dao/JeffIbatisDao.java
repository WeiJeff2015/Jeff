package com.jeff.base.dao;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * 
 * Description: ibatis 基础类
 * All Rights Reserved.
 * @version 1.0  2015年12月25日 下午12:14:17  by  weihuining（hnwei@mo9.com）创建
 */
public class JeffIbatisDao extends SqlMapClientDaoSupport{

	//通过bean名称注入
	@Resource(name="sqlMapClient")  
    private SqlMapClient sqlMapClient;
	
	
    //sqlMapClient初始化工作
    @PostConstruct 
    public void initSqlMapClient(){
           super.setSqlMapClient(sqlMapClient);
    }
}
