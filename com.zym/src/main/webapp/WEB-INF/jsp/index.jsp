<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<%--<%@taglib prefix="tags" tagdir="/WEB-INF/tags" %>--%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>知识查询列表</title>
    <%@include file="common/head.jsp" %>
    <link href="${pageContext.request.contextPath}/resources/script/Lucene/css/index.css">
    
</head>
<body>

<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>知识查询列表</h2>
        </div>
        <div>
        	<div class="searchParam">
                <div class="input-group">
                    <input id="searchParam" type="text" class="form-control">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button" onclick="jsSearch();">检索</button>
                    </span>
                </div>
            </div>
        </div>
        <div class="panel-body">
            <table class="table table-hover">
                <thead>
                <tr>
                    <td>名称</td>
                    <td>上传日期</td>
                    <td>概览</td>
                    <td>详情</td>
                </tr>
                </thead>
                <tbody class="labeanContens">
                <c:forEach var="labean" items="${Labeans}">
                	<tr >
                		<td>${labean.laname}</td>
	                    <td><fmt:formatDate value="${labean.createdate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
	                    <td class="overview" >${labean.overview}</td>
	                    <td>${labean.detail}</td>
                	</tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>

<script src="${pageContext.request.contextPath}/resources/plugins/jquery.js"></script>
<script src="${pageContext.request.contextPath}/resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/script/Lucene/js/index.js"></script>
<script type="text/javascript">

</script>
</html>









