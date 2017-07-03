<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>
	<fieldset style="font-size: 14px">
		<legend style="color: blue">增加商品</legend>
		<form action="AddGoodsServ" method="post"
			enctype="multipart/form-data">
			<table>
				<tr>
					<td>商品名字</td>
					<td><input type="text" name="goods_name"></td>
				</tr>
				<tr>
					<td>商品价格</td>
					<td><input type="text" name="goods_price"></td>
				</tr>
				<tr>
					<td>商品数量</td>
					<td><input type="text" name="goods_num"></td>
				</tr>
				<tr>
					<td>图片</td>
					<td><input type="file" name="goods_img"></td>
				</tr>
				<tr>
					<td>商品描述</td>
					<td><textarea rows="5" cols="30" name="goods_message"></textarea>
					</td>
				</tr>
				<tr>
					<td>作者</td>
					<td><input type="text" name="goods_author"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="增加商品"> <input
						type="reset"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>