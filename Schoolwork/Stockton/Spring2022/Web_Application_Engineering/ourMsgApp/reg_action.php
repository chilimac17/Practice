<?php

        $name = $_POST['name'];
        $email = $_POST['email'];
        $password = $_POST['password'];
        $dob = $_POST['dob'];
        $dom = $_POST['dom'];

        $filename = $_FILES['pic']['name'];
        $tmpname = $_FILES['pic']['tmp_name'];

        $destination = "uploads/" . rand() . $filename;

        move_uploaded_file($tmpname, $destination);

        include("connection.php");

        $sql = "INSERT INTO users (user_Name, user_Email, user_Password, user_Dob, user_Dom, user_Picture) VALUES ('$name', '$email', '$password', '$dob', '$dom', '$destination')"; 

        if($conn->query($sql) == TRUE) {

            header("location:forms1.php?msg=Record is added");
        }

        else {

            echo "Error: " . $sql . "<br>" . $conn->error;
        }
