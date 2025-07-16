<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Cadastro de Cliente</title>
</head>
<body>
<h2>Cadastro de Cliente</h2>
<form action="${pageContext.request.contextPath}/create/cliente" method="post">
  Nome: <input type="text" name="nome"><br>
  Endereço: <input type="text" name="endereco"><br>
  Telefone: <input type="text" name="telefone"><br>
  <input type="submit" value="Cadastrar">
</form>

<c:if test="${not empty erro}">
  <p style="color:rgb(241, 209, 209);">${erro}</p>
</c:if>
</body>
</html>
