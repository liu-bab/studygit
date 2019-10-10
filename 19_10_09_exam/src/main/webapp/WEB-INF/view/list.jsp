<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 
<title>Insert title here</title>
<link rel="stylesheet" href="/resource/mystyles.css"/>
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">
	function add(){
		location.href="addJsp"
	}
	
	function upd(gid){
		location.href="updJsp?gid="+gid 
	}
	
	function dels(){
		if(confirm("确定要删除这些数据吗？")){
			var id = $(":checked").map(function(){
				return this.value
			}).get().join(",")
			
			$.post("delsGoods",{id:id},function(falg){
				if(falg){
					alert("删除成功")
					location.href="list"
				}else{
					alert()
				}
			},"json")
		}
	}
</script>
</head>
<body>
<form action="list" method="post">
	<table>
		<tr>
			<td>
				商品查找:<input type="text" value="${name }" name="name">
					   <input type="submit" value="查找">
			</td>
		</tr>
	</table>
</form>
<table>
	<tr>
		<td></td>
		<td>商品编号</td>	
		<td>商品中文名称</td>	
		<td>商品英文名称</td>	
		<td>商品尺寸</td>	
		<td>商品价格</td>	
		<td>商品标签</td>	
		<td>商品品牌</td>	
		<td>商品类型</td>	
		<td>
			<input type="button" value="添加" onclick="add()"> 
			<input type="button" value="批删" onclick="dels()">
		</td>	 
	</tr>
	<c:forEach items="${list }" var="s">
		<tr>
			<td>
				<input type="checkbox" value="${s.gid }">
			</td>
			<td>${s.gid }</td>
			<td>${s.name }</td>
			<td>${s.ename }</td>
			<td>${s.size }</td>
			<td>${s.price }</td>
			<td>${s.biao }</td>
			<td>${s.brand.bname }</td>
			<td>${s.goodskind.zname }</td>
			<td>
				<input type="button" value="修改" onclick="upd(${s.gid})">
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>