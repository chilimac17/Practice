<html>

    <?php
        session_start();

    ?>

    <body>
        <h1>This is the second page</h1>
        <?php
            echo "The value received from session is: ". $_SESSION['name'];
        ?>
        <a href = "sessions_3.php">Go to the third page</a>
    </body>



</html>