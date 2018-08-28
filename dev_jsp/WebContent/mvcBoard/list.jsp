<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글목록</title>
<script type="text/javascript">
function search() {
	
}
function boardinsert() {
	alert("글쓰기");
	$('#d_insert').dialog({
		closed: false
		
	});
}
function insertcommit() {
	alert("작성되었습니다.");
	$("#f_insert").submit();
	}
</script>
<%@ include file="../include/commonUI.jsp" %>
</head>
<body>
<script type="text/javascript">
//&cb_type='+$("#cb_type").val()+'&sb_keyword='+$("#sb_keyword"),
$(document).ready(function(){
	$('#dg_list').datagrid({
		url:'./mvcBoard.bd?gubun=getBoardList',
		columns:[[
			{field:'B_NO',title:'글번호',width:100},
			{field:'B_TITLE',title:'제목',width:250},
			{field:'B_NAME',title:'작성자',width:100},
			{field:'B_FILE',title:'첨부파일',width:250},
			{field:'B_HIT',title:'조회수',width:150}
		]]
	});
	$('#pg_board').pagination({
	    total:2000,
	    pageSize:10
	});
	$('#d_insert').dialog({
		closed: true,
		 width: 300,
		 height: 400
	});
});
</script>
글목록
<table align="center" width="900px" border="1">
<!-- 검색조건 화면 추가하기 -->
<form id="f_search">
	<tr>
		<td>
		<select id="cb_type" name="cb_type" class="easyui-combobox" name="type" style="width:100px;">
   			<option value="b_title">제목</option>
    		<option value="b_content">내용</option>
    		<option value="b_name">작성자</option>
   		</select>
   		<input id="sb_keyword" name="sb_keyword" class="easyui-searchbox" style="width:300">
		<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="search()">검색</a>
		<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'" align="right"onclick="boardinsert()">글쓰기</a>
		</td>
	</tr>
<!-- 목록처리 화면 추가하기 -->
	<tr>
		<td><table id="dg_list"></table></td>
		
	</tr>
<!-- 페이지 네이션 처리(pagination) -->
	<tr>
		<td><div id="pg_board" style="background:#efefef;border:1px solid #ccc;"></div></td>
	</tr>
	</form>
</table>


<!-- 글쓰기 다이얼 로그 처리(writeForm.jsp화면 처리)
처음엔 닫힌 상태로 있다가 글쓰기 버튼을 클릭하면 창을 띄움.
 -->
 <div id="d_insert" class="easyui-dialog" title="게시글 작성" style="width:400px;height:200px;"
        data-options="iconCls:'icon-save',resizable:true,modal:true">
        <form action="./mvcBoard.bd?gubun=BoardInsert" method="post" id="f_insert">
    	작성자 : <input id="in_name" name="in_name" class="easyui-textbox" style="width:300"><br>
    	글제목 : <input id="in_title" name="in_title" class="easyui-textbox" style="width:300"><br>
    	글내용 : <input id="in_content" name="in_content" class="easyui-textbox" multiline="true" style="width:300;height:200px;"><br>
    	패스워드 : <input id="in_pwd" name="in_pwd" class="easyui-passwordbox"style="width:300;"><br>
    	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="insertcommit()"style="margin-left: 60px;margin-top: 20px;">작성</a>
    	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" onclick="search()"style="margin-top: 20px;">취소</a>
</form>
</div>

</body>
</html>