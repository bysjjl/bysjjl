<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>讨论区</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<script type="text/javascript" src="js/jquery-1.4.3.min.js"></script>
	<script src="js/thickbox-compressed.js" type="text/javascript"></script>
	<link href="css/thickbox.css" media="screen" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="js/js.js"></script>
  </head>
  <body >
  <div>
  <jsp:include page="top.html"></jsp:include>
  	<div style="clear:left;width:980px;">
  	<img src ="images/gg.jpg" alt="专业的毕业设计制作团队" title="毕业设计制作团队"/>
  	</div>
  <div style="clear:left;width:980px;">
  <a href="www.bysjjl.com">毕业设计交流网</a>-><a href="#">讨论区</a>
  </div>
  <div class="borders" style="clear:left;width:980px;border:1px solid blue; height:250px">
  <div id = "border1" class="border1" style="float:left;width:24%;border:1px solid blue; height:250px;margin-left:3px">
  	会员图片切换
  </div>
  <div class="border2" style="float:left;width:24%;border:1px solid blue; height:250px;margin-left:8px">
  <div class="border2" style="border:1px solid blue; height:20px;">
  
  </div>
  <div class="border2" style="border:1px solid blue; height:230px;">
	  最新贴
  </div>
  </div>
  <div class="border3" style="float:left;width:24%;border:1px solid blue; height:250px;margin-left:8px">
   <div class="border2" style="border:1px solid blue; height:20px;">
  
  </div>
  <div class="border2" style="border:1px solid blue; height:230px;">
  	web开发
  </div>
  </div>
  <div class="border4" style="float:left;width:24%;border:1px solid blue; height:250px;margin-left:8px">
   <div class="border2" style="border:1px solid blue; height:20px;">
  
  </div>
  <div class="border2" style="border:1px solid blue; height:230px;">
 	 移动开发
  </div>
  </div>
 </div>
  <div class ="alldiszz" style="clear:left;width: 980px;margin-top: 10px">
  <div class="javaWeb" style="border:1px solid blue; float:left;width: 980px;padding-bottom: 15px">
  <div class="javaweb" style="height:20px;border:1px solid blue;">
   毕业设计材料交流
  </div>
  	<div style="clear:left;float:left;padding-left:10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>选题交流</dt>
	  	</dl>
	  	</div>
  	</div>
  	
  	<div style="float:left;padding-left: 10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>开题报告交流</dt>
	  	</dl>
	  	</div>
  	</div>
  	
  	<div style="float:left;padding-left: 10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>任务书交流</dt>
	  	</dl>
	  	</div>
  	</div>
  	
  	<div style="float:left;padding-left: 10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>论文交流</dt>
	  	</dl>
	  	</div>
  	</div>
  	
  	<div style="float:left;padding-left: 10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>答辩交流</dt>
	  	</dl>
	  	</div>
  	</div>
  </div>
  
  <!--Web技术交流  -->
   <div class="moblie" style="border:1px solid blue; float:left;width:980px; padding-bottom: 15px">
  <div class="moblie" style="height:20px;border:1px solid blue;">
   	Web技术交流
  </div>
  	<div style="clear:left;float:left;padding-left:10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>JavaWeb技术</dt>
	  	</dl>
	  	</div>
  	</div>
  	
  	<div style="float:left;padding-left: 10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>php技术交流</dt>
	  	</dl>
	  	</div>
  	</div>
  	
  	<div style="float:left;padding-left: 10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>.NET平台技术</dt>
	  	</dl>
	  	</div>
  	</div>
 	<div style="float:left;padding-left: 10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>其他技术</dt>
	  	</dl>
	  	</div>
  </div>
  </div>
  <!-- Web技术交流 到此结束 -->
<!-- 毕业设计材料交流 -->
  <div class="moblie" style="border:1px solid blue; float:left;width: 980px;padding-bottom: 15px">
  <div class="moblie" style="height:20px;border:1px solid blue;">
   	移动开发技术交流
  </div>
  	<div style="clear:left;float:left;padding-left:10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left;">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt><a href="#">android技术交流(10)</a></dt>
	  	</dl>
	  	</div>
  	</div>
  	
  	<div style="float:left;padding-left: 10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;;padding-top:5px">
	  	<dl>
	  	<dt>ios技术交流</dt>
	  	</dl>
	  	</div>
  	</div>
  	
  	<div style="float:left;padding-left: 10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>html5技术交流</dt>
	  	</dl>
	  	</div>
  	</div>
  	
  </div> 
<!-- 毕业设计材料交流结束 -->
  
  <div class="arithmetic" style="border:1px solid blue; float:left;width: 980px;padding-bottom: 15px">
  <div class="arithmetic" style="height:20px;border:1px solid blue;">
   	算法交流
  </div>
  	<div style="clear:left;float:left;padding-left:10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>c/c++语言技术交流</dt>
	  	</dl>
	  	</div>
  	</div>
  	
  	<div style="float:left;padding-left: 10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>图像处理技术</dt>
	  	</dl>
	  	</div>
  	</div>
  	
  	<div style="float:left;padding-left: 10px;padding-top:20px;width: 32%">
	  	<div style="clear:left;float:left">
	  	<img src="images/forum_new.gif"/>
	  	</div>
	  	<div style="float:left;margin-left: 8px;padding-top:5px">
	  	<dl>
	  	<dt>其他</dt>
	  	</dl>
	  	</div>
  	</div>
  	
  </div>
  <!--算法 -->
  	</div>
  	
  </div>
  <div style="clear:left;padding-top:20px;width: 980px;padding-left: 30px">
  关键字：
      <a href="#">毕设流程</a> &nbsp;&nbsp; &nbsp;<a href="#">java技术</a> &nbsp;&nbsp; &nbsp; 
      <a href="#">web技术</a> &nbsp;&nbsp; &nbsp; <a href="#">移动开发</a> &nbsp;&nbsp; &nbsp; <a href="#">算法讨论</a> 
  </div>
  <jsp:include page="tail.html"></jsp:include>
  </body>
</html>
