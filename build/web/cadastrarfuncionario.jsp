<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Cadastrar Funcionário</title>
</head>
<body>
<h2>Cadastro de Funcionário</h2>

<form action="cadastrarFuncionario" method="post">
    Nome: <input type="text" name="nome" required><br>
    Cargo: <input type="text" name="cargo" required><br>
    Salário: <input type="number" name="salario" step="0.01" required><br>
    <input type="submit" value="Cadastrar">
</form>

<c:if test="${not empty erro}">
    <p style="color:red;">${erro}</p>
</c:if>
</body>
</html>
