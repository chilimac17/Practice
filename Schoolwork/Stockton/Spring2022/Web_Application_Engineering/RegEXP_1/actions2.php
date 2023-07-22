
<?php


echo "<html>";
echo "<head>";
echo '<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">';
echo "</head>";

echo "<body class = 'bg bg-secondary'>";
echo "<center>";

    session_start();

    $name   = $_SESSION['name'];
    $email  = $_SESSION['email'];
    $dob    = $_SESSION['dob'];
    

    echo "<h1>Welcome $name</h1>";

    if( !preg_match("|^[a-zA-Z ]{5,25}$|",$name)) {

        echo "<h2 style = 'color:maroon'>Invalid name</h2>";
    }

    else {

        echo "<h2 style = 'color:green'>Valid name</h2>";
    }

    if(!preg_match("|^[a-zA-Z0-9_.]+@[a-z]{3,5}.[a-z]{2,3}$|",$email)) {

        echo "<h2 style = 'color:maroon'>Invalid Email</h2>";
    }

    else {

        echo "<h2 style = 'color:green'>Valid email</h2>";

    }

    if(!preg_match("|^\d{2}-\d{2}-\d{4}$|",$dob)) {

        echo "<h2 style = 'color:maroon'>Invalid DOB</h2>";

    } 
    else {
        echo "<h2 style = 'color:green'>Valid DOB</h2>";

    }

 

    echo "</center>";

    echo "</body>";
    echo "</html>";
?>
