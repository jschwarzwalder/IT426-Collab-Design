<?php

class GenerateViews
{
    public function showHome()
    {
        echo 'Welcome to my Home!, <a href="/about">
                  About us!</a> <a href="/sitemap">
                  Site Map</a>';
    }

    public function showAboutUs()
    {
        echo 'About us!';
    }

    public function showSiteMap()
    {
        echo 'Sitemap!';
    }
}

?>
