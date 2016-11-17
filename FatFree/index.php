<?php
//load autoloader
require('vendor/autoload.php');

//get our router
$f3 = require('vendor/bcosca/fatfree-core/base.php');




    $f3-> route('GET /variables', function($f3){
        $f3 -> set('username', 'myUsername');
        $f3 -> set('password', sha1('password'));
        
        $f3-> set('title', 'My new page');
        
        echo 'Username: '. $f3->get('username').'<br>';
        echo 'Password: '. $f3->get('password').'<br>';

        $f3 -> set('bookmarks', array('https://www.hackerrank.com/',
                                        'https://www.livecoding.tv',
                                        'https://teamtreehouse.com/'));

        $f3 -> set('bookmarkNames', array('hacker rank',
            'live coding',
            'treehouse'));

        $f3 -> set('bookmarkKeyValues', array(hackerrank =>'https://www.hackerrank.com/',
            livecoding =>'https://www.livecoding.tv',
            Treehouse =>'https://teamtreehouse.com/'));

        $f3 ->set('bookmarkObjects', array(
            new Bookmark('http://www.reddit.com/r/coding', 'Coding at Reddit',
                    date('F j, Y \a\t g:ia;', strtotime('-1week'))),
            new Bookmark('https://www.cnet.com', 'Technology Reviews',
                date('F j, Y \a\t g:ia;', strtotime('- 2 month'))),
        ))



        //load page
        echo Template::instance()->render('views/templating_language.php');



    });




//turn on more verbose error handling through router
$f3 ->set('DEBUG', 3); //0 means surpressed, 3 verbose
$f3 ->set('ONERROR', function($f3){
    echo 'Error text '.$f3->get('ERROR.text').'<br>';
    echo 'Error trace '.$f3->get('ERROR.trace').'<br>';
});

//start router
$f3->run();
?>