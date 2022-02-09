package com.board.utill;

public class Pager {

	private int curPage;    //현재 페이지
	private int totalCnt;   //전체 숫자
	private int pageSize;   //한 페이지에 보여질 컨탠츠 수
	
	private int start;		//시작
	
	private int blockSize;  // 한페이지에 보여질 블럭수 
	private int totalBlock; // 총 블럭수
	private int block;	    //블럭 구분을 나눔  
	private int startBlock; //시작 블럭 번호 
	private int endBlock;   //끝 블럭 번호
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getTotalCnt() {
		return totalCnt;
	}
	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getBlockSize() {
		return blockSize;
	}
	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}
	public int getTotalBlock() {
		return totalBlock;
	}
	public void setTotalBlock(int totalBlock) {
		this.totalBlock = totalBlock;
	}
	public int getBlock() {
		return block;
	}
	public void setBlock(int block) {
		this.block = block;
	}
	public int getStartBlock() {
		return startBlock;
	}
	public void setStartBlock(int startBlock) {
		this.startBlock = startBlock;
	}
	public int getEndBlock() {
		return endBlock;
	}
	public void setEndBlock(int endBlock) {
		this.endBlock = endBlock;
	}
	
	public void paging(int totalCnt,int pageSzie) {
		this.totalCnt = totalCnt;
		//선택한 페이지 값이 없다면 1
		if(curPage==0){
			curPage=1;
		}
		if(pageSize==0) {
		   pageSize=10;
		}
		
		if(totalCnt<pageSize) {
			this.start=0;
		}else {
			this.start = (pageSize*curPage)-pageSize;
		}
		
		if(blockSize==0) {
			blockSize=10;
		}
		
		totalBlock=(int)Math.ceil((double)totalCnt/pageSize);
		
		block=(int)Math.ceil((double)curPage/blockSize);
		
		startBlock = (block-1)*blockSize+1;
		
		if(startBlock+blockSize-1>totalBlock) {
			endBlock = totalBlock;
		}else {
			endBlock=startBlock+blockSize-1;
		}		
		
	}
	
	
}