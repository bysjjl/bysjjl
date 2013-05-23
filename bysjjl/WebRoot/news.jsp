<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>IT新闻</title>
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
  <body>
  <div>
  <jsp:include page="top.html"></jsp:include>
  <div style="clear:left;width:980px;">
  	<img src ="images/gg.jpg" alt="专业的毕业设计制作团队" title="毕业设计制作团队"/>
  </div>
  <div style="clear:left;width:980px;">
  <a href="www.bysjjl.com">毕业设计交流网</a>-><a href="#">IT新闻</a>
  </div>
  <div class="allnews" style="clear:left;width:980px;border: 1px solid blue;border-color: red;height: 800px">
  
  <div class="bignews"  style="float:left;width:700px;">
  <!-- --------------------------------------------- -->
  <div class="bignew">
  <div class ="newsimage" style="float: left">
  <img src="images/news/oracle.jpg" alt="Oracle承诺尽快修复java问题" />
  </div>
  <div class ="content">
  <a href="http://www.csdn.net/article/2013-01-30/2814021-java-security-pledge-oracle?KeepThis=true&TB_iframe=true&height=650&width=650" title="点击弹出隐藏层" class="thickbox" type="button">Oracle向开发者承诺 称尽快修复Java安全问题</a>
  <br/>
  <strong>摘要：</strong>曾一度被关注的且被广泛使用的Java语言曝出一连串的高危漏洞之后，开发者社区怨声一片。近日，Oracle Java安全部门负责人承诺将修复这些问题并提高其在社区成员中的影响力。安全问题引忧患，笔者认为想要拴住用户的心，Oracle必须在安全问题上有所保证。Oracle安全负责人Milton Smith和OpenJDK产品管理总监 Donald Smith进行了电话沟通，电话会议长达52分钟，介绍了Java安全计划的一些 内容，他表示“目前，首要任务是将Java修复；其次是加大向开发者宣传力度。开发者不喜欢空谈或试图平息事件的做法。我们必须修复Java，并且我们也一直在这么做。”当被问及：“Java是否会像Chrome和Flash Player那样，提供一个自动更新机制”。”Donald Smith 称“目前还没有做这方面的计划，也没有不做的计划，我们会将其纳入考虑范围。”Donald Smith补充道，“新的功能推出后势必会面临更多的挑战，但是我们会积极迎接挑战。”
  <a href="http://www.csdn.net/article/2013-01-30/2814021-java-security-pledge-oracle?KeepThis=true&TB_iframe=true&height=650&width=650" title="点击弹出隐藏层" class="thickbox" type="button">查看全文</a>
  </div>
  </div>
  
  <!-- --------------------------------------------- -->
  <div class="bignew" style="clear:left;float:left;margin-top:10px">
  <div class ="newsimage" style="float: left">
  <img src="images/news/oracle.jpg" alt="Oracle承诺尽快修复java问题" />
  </div>
  <div class ="content">
  <a href="http://www.csdn.net/article/2013-01-30/2814021-java-security-pledge-oracle?KeepThis=true&TB_iframe=true&height=650&width=650" title="点击弹出隐藏层" class="thickbox" type="button">Oracle向开发者承诺 称尽快修复Java安全问题</a>
  <br/>
  <strong>摘要：</strong>曾一度被关注的且被广泛使用的Java语言曝出一连串的高危漏洞之后，开发者社区怨声一片。近日，Oracle Java安全部门负责人承诺将修复这些问题并提高其在社区成员中的影响力。安全问题引忧患，笔者认为想要拴住用户的心，Oracle必须在安全问题上有所保证。Oracle安全负责人Milton Smith和OpenJDK产品管理总监 Donald Smith进行了电话沟通，电话会议长达52分钟，介绍了Java安全计划的一些 内容，他表示“目前，首要任务是将Java修复；其次是加大向开发者宣传力度。开发者不喜欢空谈或试图平息事件的做法。我们必须修复Java，并且我们也一直在这么做。”当被问及：“Java是否会像Chrome和Flash Player那样，提供一个自动更新机制”。”Donald Smith 称“目前还没有做这方面的计划，也没有不做的计划，我们会将其纳入考虑范围。”Donald Smith补充道，“新的功能推出后势必会面临更多的挑战，但是我们会积极迎接挑战。”
  <a href="http://www.csdn.net/article/2013-01-30/2814021-java-security-pledge-oracle?KeepThis=true&TB_iframe=true&height=650&width=650" title="点击弹出隐藏层" class="thickbox" type="button">查看全文</a>
  </div>
  </div>
  
  </div>
  <!-- --------------------------------------------- -->
  <div class = "littlenews" style="float:right;width:250px;height:500px;">
  <img src="images/news/littleimage.jpg" alt="" />
  <img src="images/news/littleimage.jpg" alt="" />
  <img src="images/news/littleimage.jpg" alt="" />
  </div>
  
  <div>
  </div>
  </div>
  </div>
  <jsp:include page="tail.html"></jsp:include>
  </body>
</html>
