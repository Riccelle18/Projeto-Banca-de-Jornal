<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Cadastro de Cliente</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background: #f1f1f1;
      margin: 0;
      padding: 0;
    }
    header {
      background-color: #333;
      color: white;
      padding: 20px;
      text-align: center;
    }
    nav ul {
      list-style-type: none;
      margin: 0;
      padding: 0;
      background-color: #444;
      overflow: hidden;
      display: flex;
      justify-content: center;
    }
    nav li {
      padding: 14px 20px;
    }
    nav li a {
      color: white;
      text-decoration: none;
    }
    nav li a:hover {
      text-decoration: underline;
    }
    .container {
      padding: 30px;
      max-width: 800px;
      margin: auto;
      background: white;
      margin-top: 20px;
      border-radius: 10px;
      box-shadow: 0 2px 5px rgba(0,0,0,0.2);
    }
    form input[type="text"],
    form input[type="number"] {
      width: 100%;
      padding: 10px;
      margin: 10px 0;
      box-sizing: border-box;
    }
    form input[type="submit"] {
      padding: 10px 20px;
      background-color: #333;
      color: white;
      border: none;
      cursor: pointer;
      border-radius: 5px;
    }
    form input[type="submit"]:hover {
      background-color: #555;
    }
    .error {
      color: red;
      margin-top: 10px;
    }
  </style>
</head>
<body>
<header>
  <h1>Banca de Jornal</h1>
</header>
<nav>
  <ul>
    <li><a href="/">Início</a></li>
    <li><a href="/cadastrarfuncionario">Funcionários</a></li>
    <li><a href="/cadastrarcliente">Clientes</a></li>
    <li><a href="/cadastraritem">Estoque</a></li>
    <li><a href="/realizarvenda">Vendas</a></li>
  </ul>
</nav>

<div class="container">
  <h2>Cadastro de Cliente</h2>

  <form action="${pageContext.request.contextPath}/create/cliente" method="post">
    <label>Nome:</label>
    <input type="text" name="nome" required>

    <label>Endereço:</label>
    <input type="text" name="endereco" required>

    <label>Telefone:</label>
    <input type="text" name="telefone" required>

    <input type="submit" value="Cadastrar">
  </form>

  <c:if test="${not empty erro}">
    <p class="error">${erro}</p>
  </c:if>
</div>
</body>
</html>
