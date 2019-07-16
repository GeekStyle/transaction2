package com.geekstylecn.transaction2.service;

import com.geekstylecn.transaction2.model.Log;

public interface LogService {
	
	public void insertLog(Log log);
	
	public void deleteLog(Long id);
	
}
