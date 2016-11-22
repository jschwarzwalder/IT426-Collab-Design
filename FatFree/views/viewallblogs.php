<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        
        <title>{{ @title }}</title>
    </head>
    
    <body>
        <h1>View blogs...</h1>
        <repeat group="{{ @blogs }}" value="{{ @blog }}">
            <hr>
            <a href="../viewBlog/{{ @blog->id }}">{{ @blog->title }}</a><br>
        </repeat>
    </body>
</html>