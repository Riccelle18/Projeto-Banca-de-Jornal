<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>Realizar Venda</h2>
<form action="realizarVenda" method="post">
  Preço unitário: <input type="number" step="0.01" name="preco"><br>
  Quantidade: <input type="number" name="quantidade"><br>
  <input type="submit" value="Vender">
</form>
<c:if test="${not empty erro}">
  <p style="color:red;">${erro}</p>
</c:if>