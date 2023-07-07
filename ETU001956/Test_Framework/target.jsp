<%
    ModelView modelView = (ModelView) request.getAttribute("modelView");
    HashMap<String, Object> data = modelView.getData();

    // Accéder aux données ajoutées
    String value1 = (String) data.get("key1");
    int value2 = (int) data.get("key2");
%>

<form action="servletURL" method="post">
    <input type="text" name="input1">
    <input type="text" name="input2">
    <input type="submit" value="Submit">
</form>


<!-- Utilisation des données dans la JSP -->
<p>Value 1: <%= value1 %></p>
<p>Value 2: <%= value2 %></p>
