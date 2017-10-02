<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                    <h1>Posty</h1>
                </div>
            </div>
        </section>
        <section class="container">
            <c:forEach items="${posts}" var="post">
                <div class="row">
                    <div class="col-sm-6 col-md-3" style="padding-bottom: 10 px">
                        <div class="thumbnail">
                            <div class="caption">
                                <a href="${contextPath}/posts/show/${post.postId}">
                                    <h3>${post.title}</h3>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </section>
        <section class="container">
            <div class="row">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 10 px">
                    <div class="thumbnail">
                        <div class="caption">
                            <a href="${contextPath}/posts/add">
                                <h3>Dodaj post!</h3>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>