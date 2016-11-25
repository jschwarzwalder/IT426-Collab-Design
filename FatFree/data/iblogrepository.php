<?php
    interface IBlogRepository
    {
        //blog data
        public function getBlogPosts($username);
        public function getBlog($blogId);
        public function getBlogReferences($blogId);
        public function isABlog($blogId);
        
        //user data
        public function getRegisteredUsers();
        public function isAUser($username);
    }
?>