<?php
    $name = $_POST['name'];
    $email = $_POST['email'];
    $pass = $_POST['pass'];
    if(!preg_match("|^[a-zA-Z ]{5,25}$|",$name)){
        echo "Invalid Name";
    }
    if(!preg_match("|^[a-zA-z0-9_.]+@[a-z]{3,5}.[a-z]{2,3}$|",$email)){
        echo "invalid email";
    }
    if(strlen($pass) < 6){
        echo "Too short";
    }
?>