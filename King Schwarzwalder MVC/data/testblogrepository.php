<?php

    class TestBlogRepository implements IBlogRepository
    {
        //bogus test data (for now...)
        private $testBlogs;

		private $user1 = new user('jthompson', 'Jeff', 'Thompson', 'He is Jeff Thompson');
		private $user2 = new user("sjackson", "Sasha", "Jackson", "She is a Jackson");
		private $user3 = new user("rmcdonald", "Rosey", "McDonald", "She is not Jeff Thompson");
		
        private $users = array($user1, $user2, $user3);
        //name => blogs
        private $usersToBlogs;
        
        public function __construct()
        {
            $this->testBlogs = array(
                new Blog('582f54823e4bc4.57315323',
                         'Changes in the library system',
                         'Let\'s create an inclusive library system...',
                         array('http://www.library.com',
                               'http://www.readitandseeit.com',
                               'http://www.wikipedia.org')),
                new Blog('582f548ce931e1.78111334',
                         'C# is an awesome language',
                         'Why did I have to learn Java ?!?!?!...',
                         array('http://www.microsoft.com',
                               'http://www.programc#.com',
                               'http://www.coding.org',
                               'http://www.unity3d.com')),
                new Blog('582f54a0695287.20199710',
                         'Fish are friends, not food...',
                         'Seriously now, stop eating them ?!?!?!...',
                         array('http://www.fish.com',
                               'http://www.sharks.com',
                               'http://www.sushi.com')),
                new Blog('582f54ad27e8e8.02657270',
                         'I just bought a new Honda Accord',
                         'This car smells kinda funny...',
                         array('http://www.honda.com',
                               'http://www.ownitandloveit.com',
                               'http://www.carseller.com')
            ));
            
            $this->usersToBlogs = array(
                    $this->users[0] => array(
                                $this->testBlogs[3]),
                    $this->users[1] => array(
                                $this->testBlogs[0],
                                $this->testBlogs[1],
                                $this->testBlogs[2]), 
                    $this->users[2] => array());
        }
        
        //blog data
        public function getBlog($blogId)
        {
            foreach ($this->testBlogs as $blog) {
                if ($blog->id === $blogId) {
                    return $blog;
                }
            }
            
            return null;
        }
        
        public function getBlogPosts($username)
        {
            if (array_key_exists($username, $this->usersToBlogs)) {
                return $this->usersToBlogs[$username];
            } else {
                return array();
            }
        }
        
        public function getBlogReferences($blogId)
        {
            return $this->getBlog($blogId)->references;
        }
        
        public function isABlog($blogId)
        {
            //look through our test data
            foreach ($this->testBlogs as $blog) {
                if ($blog->id === $blogId) {
                    return true;
                }
            }
            return false;
        }
        
        //user data
        public function getRegisteredUsers()
        {
            return $this->users;
        }
        
        public function isAUser($username)
        {
            return in_array($username, $this->users);
        }
    }
?>