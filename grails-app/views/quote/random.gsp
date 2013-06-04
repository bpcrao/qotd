<%--
  Created by IntelliJ IDEA.
  User: purnachandrarao
  Date: 6/3/13
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Random Quote</title>
    <g:javascript library="prototype" plugin="prototype" />
    <r:layoutResources/>
</head>

<body>
<ul id="menu">
    <li>
        <g:remoteLink  action="ajaxRandom" update='quote'> Next Quote>> </g:remoteLink>
    </li>
    <li>
        <g:link action="list">
            Admin
        </g:link>
    </li>
</ul>
<div id="quote">
<q>${quote.content}</q>
<p>${quote.author}</p>
</div>
</body>
</html>