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
</head>
<body>
<form action="#">
	<table>
		<tr>
			<td>商品名称</td>
			<td>
				<input type="text" name="name">
			</td>
		</tr>
		<tr>
			<td>英文名称</td>
			<td>
				<input type="text" name="ename">
			</td>
		</tr>
		<tr>
			<td>商品品牌</td>
			<td>
				<select name="bid">
					<option value="0">请选择商品品牌</option>
					<c:forEach items="${brand }" var="b">
						<option value="${b.bid }">${b.bname }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>商品种类</td>
			<td>
				<select name="zid">
					<option value="0">请选择商品种类</option>
					<c:forEach items="${kind}" var="z">
						<option value="${z.zid }">${z.zname }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>商品尺寸</td>
			<td>
				<input type="text" name="size">
			</td>
		</tr>
		<tr>
			<td>商品单价</td>
			<td>
				<input type="text" name="price">
			</td>
		</tr>
		<tr>
			<td>商品标签</td>
			<td>
				<input type="text" name="biao">
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				<input type="button" value="提交" onclick="add()">
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	function add(){
		$.post("addGoods",$("form").serialize(),function(falg){
			if(falg){
				alert("添加成功")
				location.href="list"
			}else{
				alert("添加失败")
			}
		},"json")
	}
</script>
</body>
</html>