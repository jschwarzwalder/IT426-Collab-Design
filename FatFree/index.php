<?php
    error_reporting(E_ALL);
    
    //load the autoloader
    require('vendor/autoload.php');

    //get our router
    $f3 = require('vendor/bcosca/fatfree-core/base.php');
    
    $f3->route('GET /viewAllBlogs/@username', function($f3, $params) {
        $controller = new BlogController($f3);
        $controller->viewAllBlogs($params['username']);
    });
    
    $f3->route('GET /viewBlog/@id', function($f3, $params) {
        $controller = new BlogController($f3);
        $controller->viewBlog($params['id']);
    });
    
    //turn on more verbose error handling through router
    $f3->set('DEBUG', 3); //0 means suppressed, 3 verbose
    $f3->set('ONERROR', function($f3) {
        echo 'Error text '.$f3->get('ERROR.text').'<br>'; 
        echo 'Error trace '.$f3->get('ERROR.trace').'<br>'; 
    });
    
    //start router
    $f3->run();
?>