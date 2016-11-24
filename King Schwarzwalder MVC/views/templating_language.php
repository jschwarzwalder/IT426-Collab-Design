<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        
        <title>{{ @title }}</title>
    </head>
    
    <body>
        Username: {{ @username }}<br>
        Password: {{ @password }}<br>
        
        <ul>
        <repeat group="{{ @bookmarkKeyValues }}" key="{{ @bookmarkName }}"
                value="{{ @bookmarkUrl }}">
            <li><a href="{{ @bookmarkUrl }}">{{ @bookmarkName }}</a></li>
        </repeat>
        </ul>
        
        <hr>
        {{ @bookmarkObjects[0]->__toString() }}
        <check if="{{ @bookmarkObjects[0]->favorited }}">
            <true>***</true>
            <false>*</false>
        </check>
        <hr>
        {{ @bookmarkObjects[1]->__toString() }}
        <check if="{{ @bookmarkObjects[1]->favorited }}">
            <true>***</true>
            <false>*</false>
        </check>
    </body>
</html>