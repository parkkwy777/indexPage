<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div style="text-align:center;">
	<!-- 페이징 처리 -->
	<form id="pagingFrm" method="get" action="<%= request.getContextPath() %>/Cursor">
		<input type="hidden" name="curPage" value="">
		
			<ul class="pagination justify-content-center" style="margin:0 auto;">
			<li class="page-item"><a class="page-link" href="<%= request.getContextPath() %>/Cursor?curPage=1">처음으로</a></li>
				<li class="page-item"><a class="page-link" href="<%= request.getContextPath() %>/Cursor?curPage=${paging.startBlock eq 1 ? 1: paging.startBlock-paging.blockSize}">이전</a></li>
				<c:forEach var="cnt" begin="${paging.startBlock}" end="${paging.endBlock}">
					<li class="page-item ${paging.curPage==cnt ? 'active': ''}"><a class="page-link check" href="<%= request.getContextPath() %>/Cursor?curPage=${cnt}">${cnt}</a></li>
				</c:forEach>
				<c:if test="${paging.curPage!=paging.totalBlock }"><li class="page-item"><a class="page-link" href="<%= request.getContextPath() %>/Cursor?curPage=${(paging.block*paging.blockSize)+1 > paging.totalBlock ? paging.totalBlock : (paging.block*paging.blockSize)+1}">다음</a></li></c:if>
				<c:if test="${paging.curPage!=paging.totalBlock }"><li class="page-item"><a class="page-link" href="<%= request.getContextPath() %>/Cursor?curPage=${paging.totalBlock}">끝</a></li></c:if>
			</ul>
	</form>
</div>