<html>
      <?php
            session_start();
      ?>

      <body>
            <h1>Welcome to the first page</h1>
            <?php
                $_SESSION['name'] = 'Alice';
            ?>
            <a href = "sessions_2.php">Go to next page</a>
      </body>


</html>