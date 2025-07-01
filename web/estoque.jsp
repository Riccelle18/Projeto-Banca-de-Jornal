<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>Cadastro de Produto no Estoque</h2>
<form action="cadastrarEstoque" method="post">
  Produto: <input type="text" name="produto"><br>
  Quantidade: <input type="number" name="quantidade"><br>
  Preço: <input type="number" step="0.01" name="preco"><br>
  <input type="submit" value="Cadastrar">
</form>
<c:if test="${not empty erro}">
  <p style="color:red;">${erro}</p>
</c:if>