<?php
    class BookMark
    {
        private $url;
        private $name;
        private $lastVisited;
        private $favorited;
        
        public function __construct($url, $name, $lastVisited, $favorited)
        {
            $this->url = $url;
            $this->name = $name;
            $this->lastVisited = $lastVisited;
            $this->favorited = $favorited;
        }
        
        public function __get($name)
        {
            return $this->$name;
        }
        
        public function __toString()
        {
            return "$this->name - $this->url ($this->lastVisited)";
        }
    }
?>