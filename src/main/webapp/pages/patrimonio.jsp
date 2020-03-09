<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Patrimonio</title>
    <jsp:include page="template/head.jsp"/>
</head>
<body>
<div class="container">

    <jsp:include page="template/header.jsp"/>

    <div class="content">
        <div class="header-content row">
            <div class="col-10">
                <h1>Patrimônios</h1>
            </div>
            <div class="col-2">
                <a href="<c:url value="/adicionar"/>" type="button" class="btn btn-primary">Adicionar</a>
            </div>
        </div>

        <table class="table">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Descrição</th>
                <th scope="col">Localização</th>
                <th scope="col">Ações</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${lista_patrimonios}" var="patrimonio">
                <tr>
                    <th scope="row">${patrimonio.id}</th>
                    <td>${patrimonio.descricao}</td>
                    <td>${patrimonio.localizacao}</td>
                    <td>
                        <a href="<c:url value="/editar?id=${patrimonio.id}"/>"><i class="far fa-edit"></i> Editar</a>
                        <a href="<c:url value="/deletar/${patrimonio.id}"/>"><i class="far fa-trash-alt"></i>
                            Remover</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
