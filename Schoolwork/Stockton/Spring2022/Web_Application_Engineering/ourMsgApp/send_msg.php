<html>

    <head>

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

     
    </head>

    <body>
            <?php
                    include("nav.php");
            ?>
            
            <table class = "table table-striped table-hover table-bordered" width = "100%">

                <tr height = "15%">
                        <td colspan = "3" align = "center">
                                <?php
                                        session_start();
                                        $pic = $_SESSION['pic'];

                                        echo "<img src = ";
                                        echo $pic;
                                        echo " style = 'height:100px'>";

                                        echo "<h3>Send messages</h3>";

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
                                <form method = "post" action = "message.php">

                                    <div class = "form-group">

                                        <label>Receiver</label>

                                        <?php
                                                include("connction.php");
                                                $sql = "select * from users";
                                                $result = mysqli_query($conn, $sql);
                                                $users = mysqli_num_rows($result);

                                                echo "<input list = 'emails' name = 'remail'>";
                                                echo "<datalist id = 'emails'>";

                                                for($i = 0; $i < $users; $i++) {

                                                    $rows = mysqli_fetch_array($result);
                                                    echo "<option value = ";
                                                    echo $rows['user_Email'];
                                                    echo ">";
                                                    echo $rows['user_Name'];
                                                    echo "</option>";
                                                }
                                                
                                        ?>

                                    </div>


                                    <div class = "form-group">
                                               <label>Message</label>
                                               <textarea name = "message" rows = "5" cols = "35">

                                               </textarea>

                                    </div>

                                    <button type = "submit" class = "btn btn-outline-primary">Submit</button>

                                    <div>
                                                <?php
                                                       echo $_GET['msg']; 
                                                ?>
                                    </div>

                                </form>
                                
                        </td>

                </tr>

                <tr height = "5%">
                        <td colspan = "3" align = "center">&copy; all rights reserved</td>
                </tr>

            </table>

    </body>


</html>