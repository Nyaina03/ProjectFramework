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
            </tr>
        </thead>
        <tbody>
            <% List<Emp> empList = (List<Emp>) request.getSession().getAttribute("empList");
               if (empList != null) {
                   for (Emp emp : empList) { %>
                       <tr>
                           <td><%= emp.getName() %></td>
                           <td><%= emp.getAge() %></td>
                           <td><%= emp.getDept() %></td>
                           <td><%= emp.getSalaire() %></td>
                       </tr>
                   <% }
               } %>
        </tbody>
    </table>
</body>
</html>
