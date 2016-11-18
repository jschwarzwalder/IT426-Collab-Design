<!doctype html>
    <html>
<head>
    <meta charset="utf-8">
    <title>{{ @title }}</title>
</head>
<body>
    <p> Hello template</p>
    Username: {{ @username }}
    Password: {{ @password }}
<ul>
    <repeat group="{{ @bookmarkKeyValues }}" value=" {{ @bookmark}}" key="{{@bookmarkName}}" value=" {{ @bookmarkUrl}}">

        <li>
            <a href=""{{ @bookmark }}"> {{ @bookmark }}</a>
        </li>
    </repeat>
</ul>

<hr>
{{@bookmarkObjects[0] ->__toString() }}
    <check if ="@bookmarkObjects[0]->favorite">
        <true>***</true>
        <false>*</false>
    </check>
<hr>
    {{@bookmarkObjects[1] ->__toString() }}
    <check if ="@bookmarkObjects[0]->favorite">
        <true>***</true>
        <false>*</false>
    </check>
    <hr>
 </body>
</html>