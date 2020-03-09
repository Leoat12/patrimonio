<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Editar Patrimonio</title>
    <jsp:include page="template/head.jsp"/>
</head>
<body>
<jsp:include page="template/header.jsp"/>
<div class="container">
    <div class="content">
        <form action="<c:url value="/editar"/>" method="post">
            <div class="form-group">
                <label for="id">ID</label>
                <input type="text" class="form-control" id="id" name="id" value="${patrimonio.id}">
            </div>
            <div class="form-group">
                <label for="descricao">Descrição</label>
                <input type="text" class="form-control" id="descricao" name="descricao" value="${patrimonio.descricao}">
            </div>
            <div class="form-group">
                <label for="localizacao">Localização</label>
                <input type="text" class="form-control" id="localizacao" name="localizacao"
                       value="${patrimonio.localizacao}">
            </div>
            <button type="submit" class="btn btn-primary mb-2">Editar</button>
        </form>
    </div>
</div>
</body>
</html>
