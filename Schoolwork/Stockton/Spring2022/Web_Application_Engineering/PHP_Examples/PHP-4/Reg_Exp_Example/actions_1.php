<?php
        session_start();
        echo "<html>";
        echo "<head>";
        echo '<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">';
        echo "</head>";

        echo "<body>";
        $_SESSION['name']  = $_GET['name'];
        $_SESSION['email'] = $_GET['email'];
        $_SESSION['dob']   = $_GET['dob'];
        $_SESSION['dom']   = $_GET['dom'];

        echo "<a href = 'actions_2.php'><center><h3>Go to next page</h3></center></a>";
        echo "</body>";
        echo "</html>";
?>