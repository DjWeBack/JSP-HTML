<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" href="../Semantic-UI-CSS-master/Semantic-UI-CSS-master/semantic.css" />
<script src="../js/jquery-1.12.0.js"></script>
<script src="../Semantic-UI-CSS-master/Semantic-UI-CSS-master/semantic.js"></script>
<title>Insert title here</title>
<script>

</script>
</head>
<body>
	<div class="ui inverted vertical masthead center aligned segment teal">
		<div class="ui text container">
			<h1 class="ui inverted header">Project Name</h1>
		</div>
		<div class="ui container">
			<div class="ui secondary  menu">
				<!-- 아이디와 비밀번호 -->
				<div class="item">
					<div class="ui mini input">
						<input type="text" placeholder="아이디" style="margin-right: 10px;"> <input type="text" placeholder="비밀번호">
					</div>
				</div>
				<div class="right menu">
					<div class="item">
						<div class="ui icon input">
							<input type="text" placeholder="검색"> <i class="search link icon"></i>
						</div>
					</div>
					<a class="ui item"> Logout </a>
				</div>
			</div>
		</div>
	</div>
	<div class="ui container">
		<div class="ui grid" style="margin-top: 15px;">
			<div class="four wide column">
				<div class="ui vertical fluid tabular menu" id="menu">
					<a class="item"> Bio </a> <a class="item"> Pics </a> <a class="item"> Companies </a> <a class="item"> Links </a>
				</div>
			</div>
			<div class="twelve wide stretched column">
				<div class="ui segment">This is an stretched grid column. This segment will always match the tab height</div>
			</div>
		</div>
	</div>
	<script>
		$('#menu').find('a').click(function() {
			$('#menu').find('a').attr('class', 'item');
			$(this).attr('class', 'item active')
		})
	</script>
</body>
</html>