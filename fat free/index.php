<?php
    error_reporting(E_ALL);
    
    //load the autoloader
    require('vendor/autoload.php');

    //get our router
    $f3 = require('vendor/bcosca/fatfree-core/base.php');
    
    $f3->route('GET /variables', function($f3) {
        //save variables, so we can pass them to our views
        $f3->set('username', 'jarcher');
        $f3->set('password', sha1('password'));
        
        $f3->set('title', 'Practice FF Variables');
        
        //store arrays
        $f3->set('bookmarks', array('https://www.hackerrank.com/',
                                    'https://www.livecoding.tv/',
                                    'https://teamtreehouse.com/'));
        
        $f3->set('bookmarkNames', array('hacker rank',
                                    'live coding',
                                    'team treehouse'));
        
        $f3->set('bookmarkKeyValues', array(
                        'hacker rank' => 'https://www.hackerrank.com/',
                        'live coding' => 'https://www.livecoding.tv/',
                        'team treehouse' => 'https://teamtreehouse.com/'));
        
        $f3->set('bookmarkObjects', array(
            new BookMark('http://www.reddit.com/r/coding', 'Coding at Reddit',
                         date('F j, Y \a\t g:ia', strtotime('-1 week')), true),
            new BookMark('https://www.cnet.com/', 'Technology Reviews',
                         date('F j, Y \a\t g:ia', strtotime('-2 month')), false)
        ));
        
        //load a page
        echo Template::instance()->render('views/templating_language.php');
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