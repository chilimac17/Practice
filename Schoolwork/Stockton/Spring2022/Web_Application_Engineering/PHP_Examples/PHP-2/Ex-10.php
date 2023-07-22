<html>
        <body>
                <?php
                    $players = array("Pete Sampras", "Boris Becker", "Ivan Lendl");

                    echo "<h1 style = \"color:blue\">My favorite players are:</h1><br>";

                    //sort($players);
                    rsort($players);

                    foreach($players as $player) {

                        echo $player.'<br>';
                    }
                ?>

        </body>

</html>