<?php

        $id = $_GET['id'];

        include('connection.php');

        $sql = "delete from users where user_Id = '$id'";

        if($conn->query($sql) == TRUE) {

            echo "Record deleted successfully";
        }

        else {

            echo "Error " . $sql . "<br>" . $conn->error;
        }

        header("location:update_data.php");


?>