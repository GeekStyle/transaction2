package com.geekstylecn.transaction2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geekstylecn.transaction2.dao.LogDao;
import com.geekstylecn.transaction2.model.Log;

@Service
public class LogServiceImpl implements LogService{

	@Autowired
	LogDao logDao;
	
	@Override
	@Transactional
	public void insertLog(Log log) {
		logDao.insertLog(log);
	}

	@Override
	public void deleteLog(Long id) {
		logDao.deleteLog(id);
	}
	
}
