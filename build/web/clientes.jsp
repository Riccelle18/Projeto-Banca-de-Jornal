<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>Cadastro de Cliente</h2>
<form action="cadastrarCliente" method="post">
  Nome: <input type="text" name="nome"><br>
  Endereço: <input type="text" name="endereco"><br>
  Telefone: <input type="text" name="telefone"><br>
  <input type="submit" value="Cadastrar">
</form>
<c:if test="${not empty erro}">
  <p style="color:red;">${erro}</p>
</c:if>
