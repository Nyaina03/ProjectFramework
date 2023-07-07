<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulaire</title>
</head>
<body>
    <form action="FrontServlet" method="post" enctype="multipart/form-data">
        <label for="name">Nom :</label>
        <input type="text" name="name" id="name" required><br>

        <label for="age">Âge :</label>
        <input type="number" name="age" id="age" required><br>

        <label for="dept">Département :</label>
        <input type="text" name="dept" id="dept" required><br>

        <label for="salaire">Salaire :</label>
        <input type="number" name="salaire" id="salaire" step="0.01" required><br>

        <label for="file">Fichier :</label>
        <input type="file" name="file" id="file" required><br>

        <input type="submit" value="Envoyer">
    </form>
</body>
</html>
