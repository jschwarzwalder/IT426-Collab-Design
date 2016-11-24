<?php
    class Blog
    {
        //fields
        private $id; //uuid
        private $title;
        private $text;
        private $references;
        
        //constructors
        public function __construct($id, $title, $text, $references)
        {
            $this->id = $id;
            $this->title = $title;
            $this->text = $text;
            $this->references = $references;
        }
        
        //methods!
        public function __get($name)
        {
            return $this->$name;
        }
        
        public function __toString()
        {
            return "$this->title: $this->text";
        }
    }
?>