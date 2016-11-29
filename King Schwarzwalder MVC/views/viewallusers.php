<!doctype html>
<html>
<head>
    <meta charset="utf-8">

    <title>{{ @title }}</title>
</head>

<body>
<h1>View users...</h1>
<repeat group="{{ @users }}" value="{{ @user }}">
    <hr>
    <p> {{@user->fname . " " .  @user->lname}}
    <a href="../viewUsers/{{ @user->username }}">Profile</a><br>
    </p>

</repeat>
</body>
</html>