<html>
        <?php
            session_start();
            unset($_SESSION['name']);    
        ?>

        <body>
                <?php
                    echo $_SESSION['name'];
                ?>
        </body>

</html>