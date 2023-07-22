<?php

        session_start();

        $email = $_GET['email'];
        $password = $_GET['password'];

        //echo $email;
        //echo $password;

        include("connection.php");

        $sql = "SELECT * FROM users where user_Email = '$email' and user_Password = '$password'";

        $results = mysqli_query($conn, $sql);
        $users   = mysqli_num_rows($results);
        $row = mysqli_fetch_array($results);

        $_SESSION['name'] = $row['user_Name'];
        $_SESSION['email'] = $row['user_Email'];
        $_SESSION['dob'] = $row['user_Dob'];
        $_SESSION['dom'] = $row['user_Dom'];
        $_SESSION['pic'] = $row['user_Picture'];

        if($users > 0) {

            include("nav.php");
            include("login_function.php");
        }   

        else {

            header("location:index.php?msg=User not found");
        }


?>