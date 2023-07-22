<?php

        session_start();

        $s_Email = $_SESSION['email'];
        $r_Email = $_POST['remail'];
        $message = $_POST['message'];

        include("connection.php");

        $sql = "insert into Messages (S_Email, R_Email, Msg) values ('$s_Email', '$r_Email', '$message')";

        $flag = mysqli_query($conn, $sql);
        
        if($flag) {

            header("location:send_msg.php?msg=Message sent successfully");
        }
        else {

            echo "Error: " . $conn->error;
        }


?>