<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <!-- 使用jsp指令导入jsp的核心标签库文件 -->
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/common.css" />
</head>
<body>
<table class="commontable">
<tr>
<td>订单编号</td>
<td>订单地址</td>
<td>电话</td>
<td>收货人</td>
<td>订单装状态</td>
</tr>
<c:forEach items="${list }" var="lv">
<tr class="hovertr" height="40px">
<td>${lv.orders_id}</td>
<td>${lv.orders_address}</td>
<td>${lv.orders_tel}</td>
<td>${lv.orders_consignee}</td>
<td style="color:red">${lv.orders_status}</td>

</tr>
<c:forEach items="${lv.listmap}" var="va">
<tr>
   <td></td>
   <td colspan="4">
   <table width="100%" class="innertable">
   <tr>
   <td><img src="${va.goods_img}" width="50px" height="50px"></td>
   <td> ${va.details_goods}</td>
   <td> ${va.details_num}</td>
   <td> ${va.details_price}</td>
   <td> ${va.goods_name}</td>

   </tr>
   </table>
   </c:forEach>
</c:forEach>
</table>
</body>
</html>