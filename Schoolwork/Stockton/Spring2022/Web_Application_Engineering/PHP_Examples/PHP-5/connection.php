<?php

        //Create connection

        $conn = mysqli_connect("localhost", "root", "root");

        if(!$conn) {

            die("connection failed: " . mysqli_connect_error());
        }

        else {

            echo "Connected successfully";
        }

        mysqli_select_db($conn, "testExampleDatabase") or die("Could not connect to the database");

        echo "Connected to the database successfully";    

?>