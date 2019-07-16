package com.geekstylecn.transaction2.dao;

import com.geekstylecn.transaction2.model.Log;

public interface LogDao {
	
	public void insertLog(Log log);
	
	public void deleteLog(Long id);
	
}
