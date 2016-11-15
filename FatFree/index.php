<?php
	//load autoloader
	require('vendor/autoload.php');
	
	//get our router
	$f3 = require('vendor/bcosca/fatfree-core/base.php');
	
	//create a few routes
	$f3->route('GET /', 'GenerateViews->showHome');//base route is 'GET /'
	
	$f3->route('GET /about', 'GenerateViews->showAboutUs');
	
	$f3->route('GET /site', 'GenerateViews->showSiteMap');
	$f3->route('GET /calculatePrime/@number', function($f3, $params){
		$number = $params['number'];
		
		if($number <= 1){
			//redirect
			
			//or http error code
			$f3 -> error(404);
		}
	}
	
	//turn on more verbose error handling through router
	$f3 ->set('DEBUG', 3); //0 means surpressed, 3 verbose
	$f3 ->set('ONERROR', function($f3){
		echo 'Error text '.$f3->get('ERROR.text').'<br>';
		echo 'Error trace '.$f3->get('ERROR.trace').'<br>';
	});
	
	//start router
	$f3->run();
?>
