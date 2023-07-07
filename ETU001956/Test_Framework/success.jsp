<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Succès</title>
</head>
<body>
    <h1>Données enregistrées avec succès :</h1>
    <p>Nom : <%= request.getParameter("name") %></p>
    <p>Âge : <%= request.getParameter("age") %></p>
    <p>Département : <%= request.getParameter("dept") %></p>
    <p>Salaire : <%= request.getParameter("salaire") %></p>
</body>
</html>
