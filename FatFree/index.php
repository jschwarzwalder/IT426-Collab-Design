<?php

	//get our router
	$f3 = require('vendor/bcosca/fatfree-core/base.php');
	
	//create a few routes
	$f3->route('GET /', function(){
		echo 'hello world';
		
	} );//base route is 'GET /'
	
	//start router
	$f3->run();
?>
