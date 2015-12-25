<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>
<%@ include file="/inc/metaData.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<title>Add and Remove Layout - jQuery EasyUI Demo</title>
<link href="${basePath}/static/css/main/main.css" rel="stylesheet"
	type="text/css" />
</head>

<body class="easyui-layout">
	<div data-options="region:'north',border:false" class="banner">
		<div class="info">
			<p>
				<span class="orange">!</span> 【<a href="javascript:void(0);">修改密码</a>|
				<a href="javascript:void(0);">修改信息</a>| <a
					href="javascript:void(0);">退出</a>】
			</p>
			<p class="date">日期：2015-12-23</p>

		</div>
	</div>
	<div data-options="region:'west',split:true,title:'菜单导航'"
		style="width: 150px;">
		<div class="easyui-accordion" data-options="fit:true,border:false"
			style="width: 150px">
			<div title="用户管理" data-options="selected:true" class="leftMenu">
				<a href="#" class="easyui-linkbutton" onclick="addTab('baidu','http://jeasyui.com')"><p>创建用户</p></a>
				<hr>
				<p>查询用户</p>
				<hr>
			</div>
			<div title="商户管理" style="padding: 10px;">content2</div>
			<div title="日志管理" style="padding: 10px">content3</div>
		</div>
	</div>
	
	


	<div data-options="region:'south'" class="foot">
		<div>
			<p>Copyright © 2015 rx Inc. All Rights Reserved</p>
		</div>
	</div>

	<div data-options="region:'center'">
		<div id="tt" class="easyui-tabs" style="width: auto;height:100%">
			<div title="home"></div>
		</div>
	</div>
</body>
</html>

<script>
		function addTab(title, url){
			if ($('#tt').tabs('exists', title)){
				$('#tt').tabs('select', title);
			} else {
				var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
				$('#tt').tabs('add',{
					title:title,
					content:content,
					closable:true
				});
			}
		}
	</script>