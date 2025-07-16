<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Cadastro de Produto</title>
</head>
<body>
<h2>Cadastro de Produto no Estoque</h2>

<form action="${pageContext.request.contextPath}/create/item" method="post">
  Produto: <input type="text" name="produto"><br>
  Quantidade: <input type="number" name="quantidade"><br>
  Preço: <input type="number" step="0.01" name="preco"><br>
  <input type="submit" value="Cadastrar">
</form>

<c:if test="${not empty erro}">
  <p style="color:red;">${erro}</p>
</c:if>
</body>
</html>
