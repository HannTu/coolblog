<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Posts</title>
    </head>
    <body>
        <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Dodaj post</h1>
                </div>
            </div>
        </section>
        <section class="container">
            <form:form modelAttribute="newPost" class="form-horizontal">
                <fieldset>
                    <div class="col-lg-10">
                        <form:textarea path="content" rows="5" cols="30" />
                    </div>
                    <div class="col-sm-6 col-md-3" style="padding-bottom: 10 px">
                        <input type="submit" class="btn btn-primary" value="Dodaj post" />
                    </div>
                </fieldset>
            </form:form>
        </section>
    </body>
</html>