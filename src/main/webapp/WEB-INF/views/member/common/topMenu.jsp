<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%  request.setCharacterEncoding("UTF-8"); %>
<%
// sticky-top은 상단 공간을 차지하면서 위에 고정하고,
// fixed-top은 상단 공간을 차지하지 않고 위에 고정된다.
// 일부 내용이 상단 메뉴바에 가려져서 안보일 수 있다.
// <nav class="navbar navbar-inverse navbar-fixed-top">
%>
<nav class="navbar navbar-inverse navbar-sticky-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<h1><a class="navbar-brand" href="${contextPath}/main.do">도서쇼핑몰</a></h1>
		</div>
		
		<!-- 실질적인 메뉴를 나열한다. -->
		<!-- form-group이 있어야 삼선 버튼에 메뉴가 나타난다. -->
		<!-- button에 있는 data-target에는 #을 붙여야 아이디와 연결이 된다. -->
		<div class="form-group collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav navbar-left">
				<li class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="#">기본 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="${contextPath}/exam01/doA">doA</a></li>
						<li><a href="${contextPath}/exam01/doB">doB</a></li>
						<li><a href="${contextPath}/exam02/doC">doC</a></li>
						<li><a href="${contextPath}/exam02/gugudanForm.do">구구단</a></li>
						<li><a href="${contextPath}/exam03/doD">doD</a></li>
						<li><a href="${contextPath}/exam03/doE">doE</a></li>
					</ul>
				</li>
				<li>
					<form class="navbar-form navbar-right" method="post" action="${contextPath}/member/login.do">
						<c:choose>
							<c:when test="${isLogOn == true && member != null}">
								<p class="navbar-text"><b>${member.name}님, 즐거운 시간되십시오.</b></p>
								<a href="${contextPath}/member/logout.do" class="btn btn-danger"><span class="glyphicon glyphicon-log-out"></span> 로그아웃</a>
							</c:when>
							<c:otherwise>
								<div class="form-group">
									<input type="text" class="form-control" name="id" size="10" maxlength="10" placeholder="아이디"/>
									<input type="password" class="form-control" name="pwd" size="12" maxlength="20" placeholder="비밀번호"/>
								</div>
								<button type="submit" class="btn btn-primary">
									<span class="glyphicon glyphicon-log-in"></span> 로그인
								</button>
							</c:otherwise>
						</c:choose>
					</form>
				</li>
				<li class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="#">회원관리 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="${contextPath}/member/memberForm.do">회원등록</a></li>
						<li><a href="${contextPath}/member/registerAjaxForm">회원등록(AJAX)</a></li>
						<li><a href="${contextPath}/member/listMembers.do">회원전체목록</a></li>
					</ul>
				</li>
				
			</ul>
		
		</div>
	</div>
</nav>










