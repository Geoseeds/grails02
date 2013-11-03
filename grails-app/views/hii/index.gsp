<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"/>
<meta name="layout" content="main"/>
<title>Insert title here</title>
</head>
<body>
  <div class="body">
  	<g:link> TESTLINK23 </g:link>
  	<g:if test="${renderitall}">
  		<br/> ${attr1 }
  		<br/> <g:join in="${attr2}" delimiter=":" />
  		<br/> <strong> Query String 'qstr': ${attr3 }</strong>
  	</g:if>
  	
  	<g:if test="${divrendered }">
  		<br/> ${divrendered }
  	</g:if>
  </div>
</body>
</html>