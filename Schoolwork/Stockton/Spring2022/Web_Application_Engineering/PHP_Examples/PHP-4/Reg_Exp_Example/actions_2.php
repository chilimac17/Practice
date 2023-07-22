<?php
    session_start();

    echo "<html>";
    echo "<head>";
    echo '<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">';
    echo "</head>";

    echo "<body class = 'bg bg-secondary'>"; 

    $name  = $_SESSION['name'];
    $email = $_SESSION['email'];
    $dob   = $_SESSION['dob']; 
    $dom   = $_SESSION['dom']; 

    echo "<h1 style = 'color:yellow'>Welcome $name</h1>";
    echo "<h3 style = 'color:yellow'>Name: $name</h3>";
    echo "<h3 style = 'color:yellow'>Email: $email</h3>";
    echo "<h3 style = 'color:yellow'>DOB: $dob</h3>";
    echo "<h3 style = 'color:yellow'>DOM: $dom</h3>";

    if(!preg_match("|^[a-zA-Z ]{5,25}$|",$name)) {

        echo "<h2 style = 'color:maroon'>Invalid name</h2>";
    }
    else {
        echo "<h2 style = 'color:white'>Valid name</h2>";
    }

    if(!preg_match("|^[a-zA-Z0-9_.]+@[a-z]{3,5}.[a-z]{2,3}$|",$email)) {
        
        echo "<h2 style = 'color:maroon'>Invalid email</h2>";
    }   
    else {

        echo "<h2 style = 'color:white'>Valid email</h2>";
    }

    if(!preg_match("|^\d{2}-\d{2}-\d{4}$|",$dob)) { 
    //if(!preg_match("|^[0-9]{2}-[0-9]{2}-[0-9]{4}$|",$dob)) { 

        echo "<h2 style = 'color:maroon'>Invalid DOB</h2>";
    }
    else {

        echo "<h2 style = 'color:white'>Valid DOB</h2>";
    }

    echo "</body>";
?>