<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        
        <title>{{ @blog->title }}</title>
    </head>
    
    <body>
        <h1>{{ @blog->title }}</h1>
        {{ @blog->text }}
    </body>
</html>