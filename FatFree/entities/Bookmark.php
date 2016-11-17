<?php

/**
 * Created by PhpStorm.
 * User: Eiseldora
 * Date: 11/17/2016
 * Time: 10:45 AM
 */
class Bookmark {

    private $url;
    private $name;
    private $lastVisited;

    public function __construct( $url, $name, $lastVisited)    {
        $this->url = $url;
        $this->name = $name;
        $this->lastVisited = $lastVisited;
    }

    public function __get($name)
    {
       return $this->$name;
    }

    public function __toString(){
        return "$name - $url ($lastVisited)";
    }

}