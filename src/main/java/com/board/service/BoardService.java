package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.service.impl.BoardDAO;
import com.board.utill.Pager;

@Service
public class BoardService {

	/*
	 * //총건수 public int totalCnt(Pager pager) throws Exception; //기존 페이징 방식 public
	 * List<BoardVO> listLimit(Pager pager) throws Exception; //커서 페이징 방식 public
	 * List<BoardVO> listCursor(Pager pager) throws Exception;
	 */
	@Autowired(required = false)
	private BoardDAO boardDAO;
	

	
	
	public List<BoardVO> listCursor(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		if(pager.getPageSize()==0) {
			//페이지사이즈 설정
			pager.setPageSize(10);
		}
		pager.paging(boardDAO.totalCnt(pager), pager.getPageSize());
		
		return boardDAO.listCursor(pager);
	}
	public List<BoardVO> listLimit(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		if(pager.getPageSize()==0) {
			//페이지사이즈 설정
			pager.setPageSize(10);
		}
		pager.paging(boardDAO.totalCnt(pager), pager.getPageSize());
		
		return boardDAO.listLimit(pager);
	}
	public int totalCnt(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.totalCnt(pager);
	}
}
