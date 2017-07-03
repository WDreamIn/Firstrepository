<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!-- 使用jsp指令导入jsp的核心标签库文件 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/common.css">
</head>
<body>
	<table class="commontable">
		<tr>
			<td>图片</td>
			<td>名字</td>
			<td>价格</td>
			<td>数量</td>
			<td>描述</td>
			<td>作者</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="lv">
			<tr class="hovertr">
				<td><img alt="" src="${lv.goods_img }" width="50px" height="50px"></td>
				<td>${lv.goods_name }</td>
				<td>${lv.goods_price }</td>
				<td>${lv.goods_num }</td>
				<td>${lv.goods_message }</td>
				<td>${lv.goods_author }</td>
				<td><a class="commona" href="GoodsDelServ?goods_id=${lv.goods_id }">删除</a>&nbsp;<a class="commona" href="GoodsMessageServ?goods_id=${lv.goods_id}">修改</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>