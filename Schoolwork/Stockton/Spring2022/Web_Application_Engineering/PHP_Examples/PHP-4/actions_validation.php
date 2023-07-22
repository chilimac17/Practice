<?php

    $name = $_POST['name'];
    $email = $_POST['email'];
    $pass  = $_POST['pass'];
    $pass1 = $_POST['pass1'];

    if( !preg_match("|^[a-zA-Z ]{5,25}$|", $name))
        echo "Invalid name";
    
    
    if(!preg_match("|^[a-zA-Z0-9_.]+@[a-z]{3,5}.[a-z]{2,3}$|",$email))   
        echo "Invalid email";
        
    if(strlen($pass) < 6)  {
        echo "Too short password";   
        echo "<br>"; 
    }
        
    
    if(strcmp($pass, $pass1) <> 0) {
        echo "Password mismatch"; 
        echo "<br>";
    }
         

    echo "<br>";    
    echo strtolower($name)."<br>";    
    echo strtoupper($name)."<br>";
    echo ucfirst($name)."<br>";
    echo ucwords($name)."<br>";

    echo strpos($name, 'a')."<br>";
    echo strrpos($name, 'a')."<br>";
    echo substr_count($name, 'a')."<br>";

?>