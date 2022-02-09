package com.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.board.service.BoardVO;
import com.board.utill.Pager;

@Repository("boardDAO")
public interface BoardDAO {
	//커서
	public List<BoardVO> listCursor(Pager pager) throws Exception;

	public List<BoardVO> listLimit(Pager pager) throws Exception;

	public int totalCnt(Pager pager) throws Exception;
}
 
