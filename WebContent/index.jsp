<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <!-- 使用jsp指令导入jsp的核心标签库文件 -->
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/main.css" />

	</head>

	<body>

		<!--头部-->
		<div id="booktop">
			<div class="widthmid">

				<span id="nickname">欢迎光临当当，请<a dd_name="登录" href="login.jsp" target="_self" rel="nofollow" class="login_link">登录</a></span>
				<ul class="topbox">
					<li class="boxlia">
						<a href="">企业采购</a>

					</li>
					<li class="boxlia">
						<a href="">我的当当</a>
					</li>
					<li class="boxlia boxlihv">
						<a href="">手机当当</a>
						<ul class="dangdang_box">
							<li>扫描</li>
							<li>我的手机</li>
						</ul>
					</li>
					<li class="boxlia boxlihv">
						<a href="">当当出版</a>
						<ul class="dangdang_box">
							<li>我的积分</li>
							<li>我的收藏</li>
							<li>我的余额</li>
						</ul>
					</li>
				</ul>

			</div>
		</div>
		<!--头部end-->

		<div id="bookout" class="widthmid">

			<!--搜索开始-->
			<div id="booksearch">
				<a href="" class="logo">
					<img src="img/logo.jpg" style="border: none;">
				</a>
				<div class="searchdiv">
					<input type="text" value="作品、作者、出版社" class="searchtext">
					<span type="button" value="提交" class="searchbtn"></span>
				</div>

				<ul class="header_fun header_funina">
					<li class="icon">&nbsp;</li>
					<li class="header_cart">
						<a href="ShoppingListServ" name="购物车">
							购物车0
						</a>
					</li>
					<li class="icon2">&nbsp;</li>
					<li class="header_order">
						<a href="javascript:void(0)" id="headerMyOrder">
							我的订单
						</a>
					</li>

				</ul>

			</div>
			<!--搜索end-->

			<!--横向菜单开始-->
			<div id="bookmenu">
				<ul class="uloutw">
					<li class="onimg">
						<img src="img/menua.png" />
					</li>
					<li class="on">
						<a href="">首页</a>
					</li>
					<li class="chubannav">
						<a href="">出版</a>
					</li>
					<li class="yuanchuangnav">
						<a href="">网络文学</a>
					</li>
					<li class="phoneshow">
						<a target="_blank" href="">手机看书</a>
					</li>
					<li class="for_hot_nav">
						<a target="_blank" href="">当当阅读器</a>
					</li>
					<li class="want_to_recharge">
						<a href="" target="_blank">我要充值</a>
					</li>
					<li class="writer_sys">
						<a href="" target="_blank">作者后台</a>
					</li>
				</ul>
			</div>
			<!--横向菜单end-->

			<!--中间纵向菜单和滚动开始-->
			<div id="booktree">

				<!--纵向菜单开始-->
				<div class="booktreeleft">
					<dl class="dttree">
						<dt class="booktype">图书分类</dt>
						<dd class="booktypedd booktypeindiv">
							<a target="_blank" href="" class="wy">文艺\文艺</a>
							<div class="booktypeddindiv">
								<a href="">文艺文艺1</a>&nbsp;|
								<a href="">文艺文艺1</a>&nbsp;|
								<a href="">文艺文艺1</a>&nbsp;|
								<a href="">文艺文艺1</a><br>
								<a href="">文艺文艺1</a>&nbsp;|
								<a href="">文艺文艺1</a><br>
								<a href="">文艺文艺1</a>&nbsp;|
								<a href="">文艺文艺1</a>&nbsp;|
							</div>
						</dd>
						<dd class="booktypedd booktypeindiv">
							<a target="_blank" href="" class="wy">经管\经管</a>
							<div class="booktypeddindiv">
								<a href="">经管</a>&nbsp;|
								<a href="">经管</a>&nbsp;|
								<a href="">经管</a>&nbsp;|
								<a href="">经管</a>&nbsp;<br>
								<a href="">经管</a>&nbsp;|
								<a href="">经管</a>&nbsp;<br>
								<a href="">经管</a>&nbsp;|
								<a href="">经管</a>&nbsp;|
							</div>
						</dd>
						<dd class="booktypedd">
							<a target="_blank" href="" class="wy">社科\社科</a>
						</dd>
						<dd class="booktypedd">
							<a target="_blank" href="" class="wy">生活\生活</a>
						</dd>
						<dd class="booktypedd">
							<a target="_blank" href="" class="wy">教育\教育</a>
						</dd>
						<dd class="booktypedd">
							<a target="_blank" href="" class="wy">科技\科技</a>
						</dd>
						<dd class="booktypedd">
							<a target="_blank" href="" class="wy">童书\童书</a>
						</dd>
						<dd class="booktypedd">
							<a target="_blank" href="" class="wy">进口书\进口书</a>
						</dd>
					</dl>
				</div>
				<!--纵向菜单end-->

				<!--滚动菜单开始-->
				<div class="booktreemid">
					<div class="booktreemidtop">
						<img src="img/midimg.png" style="width: 100%; height: 150px;" />
					</div>
					<div class="booktreemidend">
						<img src="img/midgg.png" style="width: 100%; height: 120px;" />
					</div>

				</div>
				<!--滚动菜单end-->
			</div>
			<!--中间纵向菜单和滚动end-->

			<div id="bookbodym" class="clearfloat ">
				<div class="weekdaytitle booktypebody">
					<span class="bodytitlespan">正在热卖</span>
				</div>
				<!-- c：for java里面的for循环  items表示变李的对象名字
				var表示的是变李集合里任意一个对象-->
				<c:forEach items="${list}" var="lv">
			
						<div class="bookshow ">
					<img class="bookshowleftimg" src="${lv.goods_img}" />
					<ul class="bookshowrightul">
						<li class="bookname">${lv.goods_name}</li>
						<li class="bookauthor">${lv.goods_author}</li>
						<li class="bookimg"><img src="img/xingxing.png"></li>
						<li class="bookprice">￥${lv.goods_price}</li>
						<li class="bookmes">${lv.goods_message}</li>
						<li class="bookxiangxi">
							<a class="bookxiangxia" href="GoodsMessageServ?goods_id=${lv.goods_id}">查看详细</a>
						</li>
					</ul>
				</div>
				</c:forEach>
				
				
			
			
			</div>

			<div id="bookbodyr" class="clearfloat ">
				<div class="weekdaytitle booktypebody">
					<span class="bodytitlespan">本周热荐</span>
				</div>
						<c:forEach items="${list}" var="lv">
			
						<div class="bookshow ">
					<img class="bookshowleftimg" src="${lv.goods_img}" />
					<ul class="bookshowrightul">
						<li class="bookname">${lv.goods_name}</li>
						<li class="bookauthor">${lv.goods_author}</li>
						<li class="bookimg"><img src="img/xingxing.png"></li>
						<li class="bookprice">￥${lv.goods_price}</li>
						<li class="bookmes">${lv.goods_message}</li>
						<li class="bookxiangxi">
							<a class="bookxiangxia" href="">查看详细</a>
						</li>
					</ul>
				</div>
				</c:forEach>
				
			</div>
				
			

			<!--底部开始-->

			<div class="publicfootmod clearfloat">
<div class="kong">
	
</div>
				<div class="inner">
					<ul>
						<li class="func focusOn clearfix">
							<div class="left">
								<img src="img/footer_share.jpg" alt="" class="icon">
							</div>
							<div class="right">
								<p class="title">关注我们</p>
								<p class="desc">最受欢迎的阅读产品</p>
								<p class="subtitle">关注我们：</p>

							</div>
						</li>
						<li class="func author clearfix">
							<div class="left">
								<img src="img/footer_author.jpg" alt="" class="icon">
							</div>
							<div class="right">
								<p class="title">作者后台</p>
								<p class="desc">加入当当原创网，尊享作者</p>
								<p class="subtitle">福利，成就网文大神</p>
							</div>
						</li>
						<li class="func about_us clearfix">
							<div class="left">
								<img src="img/footer_us.jpg" alt="" class="icon">
							</div>
							<div class="right">
								<p class="title">关于我们</p>
								<p class="desc">欢迎反馈宝贵意见给我们</p>
								<p class="subtitle">客服书吧：当当读书5.0问答</p>
							</div>
						</li>
					</ul>
				</div>

			</div>
			<!--底部end-->

		</div>
	</body>

</html>