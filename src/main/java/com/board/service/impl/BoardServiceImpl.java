package com.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.service.BoardService;
import com.board.service.BoardVO;
import com.board.utill.Pager;

public class BoardServiceImpl implements BoardService {
	@Autowired(required = false)
	private BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> listCursor(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.listCursor(pager);
	}
	@Override
	public List<BoardVO> listLimit(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.listLimit(pager);
	}
	@Override
	public int totalCnt(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.totalCnt(pager);
	}
}
