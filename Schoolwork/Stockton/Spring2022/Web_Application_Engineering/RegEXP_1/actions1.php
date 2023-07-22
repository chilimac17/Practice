

<?php
    echo "<html>";
    echo "<head>";
    echo '<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">';
    echo "</head>";

    session_start();

    $_SESSION['name']  = $_GET['name'];
    $_SESSION['email'] = $_GET['email'];
    $_SESSION['dob']   = $_GET['dob'];

    echo "<body style = 'background-color:lightgray'>";
    echo "<a href='actions2.php'><h3>Go to next page</h3></a>";
    echo "</body>";
    echo "</html>";
    


?>