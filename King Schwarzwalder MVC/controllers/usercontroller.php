<?php
    class UserController
    {

        private $router;

        public function __construct($router)
        {
            $this->router = $router;
        }

        public function viewUsers()
        {
            $repo = new TestBlogRepository();

            //make sure the user exists

            echo $repo->getRegisteredUsers();
        }

        public function viewProfile($username)
        {
            $repo = new TestBlogRepository();
            $users = $repo->getRegisteredUsers();

            foreach ($users as $user) {
                if ($username === $user->username) {
                    $user->toString;
                    break;
                }
                echo $repo->isAUser($user);
            }
        }
    }
?>