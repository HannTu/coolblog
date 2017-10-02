<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Post</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>${post.title}</h1>
                    <h2>Posted on: ${post.postedOn}</h2>
                    <div class="row">
                        <div class="col-sm-6 col-md-3" style="padding-bottom: 10 px">
                            <div class="thumbnail">
                                <a href="${contextPath}/coolblog/posts/">
                                    <h3>Powrot do strony glownej</h3>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section class="container">
            <div class="thumbnail">
                <div class="caption">
                    <h3>${post.content}</h3>
                </div>
            </div>
        </section>
        <section class="container">
            <c:forEach items="${comments}" var="comment">
                <div class="row">
                    <div class="col-sm-6 col-md-3" style="padding-bottom: 10 px">
                        <div class="thumbnail">
                            <div class="caption">
                                <p>${comment.content}</p>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
            <div class="row">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 10 px">
                    <div class="thumbnail">
                        <div class="caption">
                            <a href="${contextPath}/coolblog/comments/add/${post.postId}">
                                <h3>Dodaj kometarz!</h3>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>