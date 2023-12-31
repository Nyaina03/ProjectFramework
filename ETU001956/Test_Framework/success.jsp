<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Succès</title>
</head>
<body>
    <h1>Données enregistrées avec succès :</h1>

    <table>
        <thead>
            <tr>
                <th>Nom</th>
                <th>Âge</th>
                <th>Département</th>
                <th>Salaire</th>
                <th>Nom du fichier</th>
                <th>Chemin du fichier</th>
                <th>Taille du fichier</th>
           ```jsp
                <th>Nom du fichier</th>
                <th>Chemin du fichier</th>
                <th>Taille du fichier</th>
            </tr>
        </thead>
        <tbody>
            <% List<Emp> empList = (List<Emp>) request.getSession().getAttribute("empList"); %>
            <% if (empList != null && !empList.isEmpty()) { %>
                <% for (Emp emp : empList) { %>
                    <% UploadFile uploadFile = emp.getUploadFile(); %>
                    <tr>
                        <td><%= emp.getName() %></td>
                        <td><%= emp.getAge() %></td>
                        <td><%= emp.getDept() %></td>
                        <td><%= emp.getSalaire() %></td>
                        <td><%= uploadFile.getFileName() %></td>
                        <td><%= uploadFile.getFilePath() %></td>
                        <td><%= uploadFile.getFileSize() %></td>
                    </tr>
                <% } %>
            <% } else { %>
                <tr>
                    <td colspan="7">Aucune donnée enregistrée.</td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
