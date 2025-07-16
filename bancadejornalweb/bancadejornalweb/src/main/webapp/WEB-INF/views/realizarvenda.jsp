<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Realizar Venda</title>
</head>
<body>
<h2>Realizar Venda</h2>
<form action="${pageContext.request.contextPath}/create/venda" method="post">
  Preço unitário: <input type="number" step="0.01" name="preco"><br>
  Quantidade: <input type="number" name="quantidade"><br>
  <input type="submit" value="Vender">
</form>

<c:if test="${not empty erro}">
  <p style="color:red;">${erro}</p>
</c:if>
</body>
</html>
