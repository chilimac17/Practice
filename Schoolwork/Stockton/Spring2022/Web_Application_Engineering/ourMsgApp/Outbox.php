<html>

    <head>

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

     
    </head>

    <body>
            
            <table class = "table table-striped table-hover table-bordered" width = "100%">

                <tr height = "15%">
                        <td colspan = "3" align = "center">
                                <?php
                                        session_start();
                                        $pic = $_SESSION['pic'];

                                        echo "<img src = ";
                                        echo $pic;
                                        echo " style = 'height:100px'>";

                                        echo "<h3>Welcome " . $_SESSION['name'] . "</h3>";

                                ?>


                        </td>

                </tr>

                <tr height = "80%">

                        <td width = "20%">

                                <table width = "100%">
                                        <tr>
                                                <td><a href = "Inbox.php">Inbox</a></td>
                                        </tr>
                                        <tr>
                                                <td><a href = "Outbox.php">Outbox</a></td>
                                        </tr>                                 

                                        <tr>
                                                <td><a href = "send_msg.php">Send Message</a></td>
                                        </tr>                                               
                                        <tr>
                                                <td><a href = "signout.php">Signout</a></td>
                                        </tr>                                        

                                </table>

                        </td>

                        <td>

                                <div class = "container">

                                        <?php
                                                include("connection.php");
                                                session_start();

                                                $id = $_SESSION['email'];

                                                $sql = "select * from Messages where S_Email = '$id'";
                                                $result = mysqli_query($conn, $sql);
                                                $users = mysqli_num_rows($result);

                                                for($i = 0; $i < $users; $i++) {

                                                    $rows = mysqli_fetch_array($result);  
                                                    $s = "select * from users where user_Email = '$rows[2]'";
                                                    $res = mysqli_query($conn, $s);
                                                    $row = mysqli_fetch_array($res);

                                                    echo "<div>";
                                                    echo "<img src = ";
                                                    echo $row[6];
                                                    echo " style = 'height:100px'>";
                                                    echo "</div>";

                                                    echo "<div>Sent to:";
                                                    echo $row[1];
                                                    echo "</div>";

                                                    echo "<div>Message:";
                                                    echo $rows[3];
                                                    echo "</div>";
                                                }

                                        ?>

                                </div>
                        </td>

                </tr>

                <tr height = "5%">
                        <td colspan = "3" align = "center">&copy; all rights reserved</td>
                </tr>

            </table>

    </body>


</html>