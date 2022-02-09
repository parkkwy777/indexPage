<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/webjars/bootstrap/4.5.2/css/bootstrap.css"/>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="/webjars/jquery/3.3.1/dist/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container" style="border solid;">
	<h1>게시판</h1>
	<a href="<%= request.getContextPath() %>/Cursor"><button style="background-color:green; margin-bottom:1px; color:white; float:right ">커서 페이징</button></a>
	<table class="table table-bordered table-hover text-center">
		<colgroup>
			<col width='10%' />
			<col width='60%' />
			<col width='10%' />
			<col width='10%' />
		</colgroup>
		<thead>
				<tr>
					<th scope='col' class='noline'>번호</th>
					<th scope='col'>제목</th>
					<th scope='col'>작성자</th>
					<th scope='col'>등록일</th>
				</tr>
			<c:if test="${lists ne null}">
			<c:forEach var="list" items="${lists}" varStatus="i">
				<tr>
						<td>${paging.totalCnt-((paging.curPage-1)*paging.pageSize)-i.index}</td>
						<td onclick="detailGo(${list.no});">${list.title}</td>
						<td>${list.writer}</td>
						<td>${list.dday}</td>
					</tr>
			</c:forEach>
			</c:if>
			<c:if test="${lists eq null}">
					<tr><td colspan="4">데이터가 없습니다.</td></tr>
			</c:if>
		</thead>
	</table>
	<%@ include file="/WEB-INF/views/common/Pager.jsp"%>
</div>

</body>
</html>