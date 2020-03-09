<%--
  Created by IntelliJ IDEA.
  User: leoat
  Date: 3/5/2020
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Adicionar Patrimonio</title>
    <jsp:include page="template/head.jsp"/>
</head>
<body>
<jsp:include page="template/header.jsp"/>
<div class="container">
    <div class="content">
        <form action="<c:url value="/adicionar"/>" method="post">
            <div class="form-group">
                <label for="id">ID</label>
                <input type="text" class="form-control" id="id" name="id">
            </div>
            <div class="form-group">
                <label for="descricao">Descrição</label>
                <input type="text" class="form-control" id="descricao" name="descricao">
            </div>
            <div class="form-group">
                <label for="localizacao">Localização</label>
                <input type="text" class="form-control" id="localizacao" name="localizacao">
            </div>
            <button type="submit" class="btn btn-primary mb-2">Adicionar</button>
        </form>
    </div>
</div>
</body>
</html>
