<?php
    class user
    {
        //fields
        private $username; //uuid
        private $fname;
        private $lname;
        private $bio;
        
        //constructors
        public function __construct($username, $fname, $lname, $bio)
        {
            $this-> username = $username;
			$this-> fname = $fname;
			$this-> lname = $lname;
			$this-> bio = $bio;
        }
        
        //methods!
        public function __get($name)
        {
            return $this->$name;
        }
        
        public function __toString()
        {
            return "$this->username: $this->fname $this->lname \n $this->bio \n\n";
        }
    }
?>