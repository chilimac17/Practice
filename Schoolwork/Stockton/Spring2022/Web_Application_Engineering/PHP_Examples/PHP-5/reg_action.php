<?php

    $name  = $_POST['name'];
    $email = $_POST['email'];
    $pass  = $_POST['password'];

    echo $name . "<br>";
    echo $email . "<br>";
    echo $pass . "<br>";

    $filename = $_FILES['pic']['name'];
    $size = $_FILES['pic']['size'];
    $type = $_FILES['pic']['type'];
    $tmpname = $_FILES['pic']['tmp_name'];

    echo $filename . "<br>";
    echo $size . "<br>";
    echo $type . "<br>";
    echo $tmpname . "<br>";

    include("connection.php");

    $destination = "uploads/".rand().$filename;

    move_uploaded_file($tmpname, $destination);

    $sql = "INSERT INTO users (user_Name, user_Email, user_Password, user_Picture) VALUES ('$name', '$email', '$pass', '$destination')";

    if($conn->query($sql) == TRUE) {

        echo "New record created successfully";
    }

    else {

        echo "Error: " . $sql . "<br>" . $conn->error;
    }

    header("location:forms.php?msg=Record is added");

?>