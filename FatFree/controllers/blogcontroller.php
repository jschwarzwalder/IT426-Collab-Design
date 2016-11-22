<?php
    class BlogController
    {
        private $router;
        
        public function __construct($router)
        {
            $this->router = $router;
        }
        
        //actions...
        public function viewAllBlogs($username)
        {
            $repo = new TestBlogRepository();
            
            //make sure the user exists
            if ($repo->isAUser($username)) {
                //get our data
                $blogs = $repo->getBlogPosts($username);
                
                //save our data to the router
                $this->router->set('title', "Blogs for $username");
                $this->router->set('blogs', $blogs);
                
                echo Template::instance()->render('views/viewallblogs.php');
            } else {
                $this->router->error(404);
            }
        }
        
        public function viewBlog($blogId)
        {
            $repo = new TestBlogRepository();
            
            if ($repo->isABlog($blogId)) {
                $blog = $repo->getBlog($blogId);
                
                $this->router->set('blog', $blog);
                
                echo Template::instance()->render('views/viewblog.php');
            }
        }
    }
?>