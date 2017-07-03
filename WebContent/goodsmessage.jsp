<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/main.css" />
		<link rel="stylesheet" type="text/css" href="css/goodsmessage.css" />

	</head>

	<body>

		<!--头部-->
		<div id="booktop">
			<div class="widthmid">

				<span id="nickname">欢迎光临当当，请<a dd_name="登录" href="javascript:PageTopLogIn();" target="_self" rel="nofollow" class="login_link">登录</a></span>
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
						<a href="avascript:void(0)" name="购物车">
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

			<div id="bookbodym" class="clearfloat ">
				<div class="goodsmessageout">
				<form action="AddShopServ" method="post">
					<div class="goodsmessageoutleft">
						<img src="${goods.goods_img }" style="width: 80%;" />
					</div>
					<div class="goodsmessageoutright">

						<div class="name_info" ddt-area="001">
							<!-- 主标题 -->
							<h3 title="">
                                ${goods.goods_name }(价格：${goods.goods_price })
                                  <input type="hidden" name = "shopping_price" 
                                value="${goods.goods_price }">
                                <input type="hidden" name = "shopping_goods" 
                                value="${goods.goods_id }">
                                </h3>
							<!-- 副标题、促销语 -->
							<h4>
                <span class="head_title_name" title="">
    		${goods.goods_message }    	</span>
    	<span class="hot" title="">
    		<a href="http://book.dangdang.com/20170612_nrsg">青春动漫传记分会场畅品3折起5折封</a>        </span>
        <span class="yushou" id="presale-title" style="display: none;">

        </span>
    </h4>
						</div>

						<div class="messbox_info">
							<span class="t1" id="author" dd_name="作者" ddt-area="002">作者:<a href="" target="_blank" dd_name="作者">${goods.goods_author }</a></span>&nbsp;&nbsp;
							<span class="t1" dd_name="出版社" ddt-area="003">出版社:
							<a href="" target="_blank" dd_name="出版社"> ****文艺出版社</a></span>&nbsp;&nbsp;<span class="t1">出版时间:2017年05月&nbsp;</span>
							<!-- 评论数 -->
							<div class="pinglun">
								<!-- 排名 -->
								<span class="t1" id="pubbang" style="display:none" dd_name="图书排行榜排名"></span>
								<!-- 星级 -->
								<span class="star_box">
        	<span class="star" style="width:92.4%"><img src="img/xingxing.png"/></span>
								</span>
								<a href="javascript:void(0)" id="comm_num_down" dd_name="评论数">134</a>条评论
							</div>
						</div>

						<hr />
						<div class="messbox_info">
							配送至 <input type="text" id="address" style="outline: none;" value="" /> 有货满39元免运费

						</div>
						<hr style="color: #FFFFFF;border: 0px;" />
						<div class="messbox_info">
							<ul>
								<li class="commonli"><input type="text" id="" value="-" style="width: 10px;height: 30px;" readonly="readonly" onclick="document.all.num.value=document.all.num.value-1" /></li>
								<li class="commonli"><input name = "shopping_num" type="text" style="width: 40px;height: 30px;" id="num" value="1" readonly="readonly" /></li>
								<li class="commonli"><input type="text" id="" value="+" style="width: 10px;height: 30px;" readonly="readonly" onclick="document.all.num.value=parseInt(document.all.num.value)+1" /></li>
								<li class="commonli"><input type="image" src="img/addshop.png" />
								
								</li>
							
							</ul>

						</div>

					</div>
                   </form>
				</div>

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