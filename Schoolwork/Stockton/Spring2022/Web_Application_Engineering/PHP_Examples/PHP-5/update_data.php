<html>

        <head>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        </head>

        <body>

                <?php
                        include('connection.php');
                        $sql = "select * from users";
                        $results = mysqli_query($conn, $sql);
                ?>

                <table border = "1" align = "center" class = "table table-striped table-hover" style = "width:50%">
                            <tr>
                                    <th>User Name</th>
                                    <th>User Email</th>
                                    <th>User Password</th>
                                    <th>User Picture</th>
                                    <th colspan = "2">Actions</th>

                            </tr>

                            <?php
                                    while($rows = mysqli_fetch_array($results)) {

                                        echo "<tr>";
                                        echo "<td>"; echo $rows[1]; echo "</td>";    
                                        echo "<td>"; echo $rows[2]; echo "</td>";
                                        echo "<td>"; echo $rows[3]; echo "</td>";
                                        echo "<td><img src='";echo $rows[4]; echo "' height = 100, width = 100></td>";
                                        echo "<td colspan = '2'><a href = delete.php?id=";echo $rows[0];echo ">Delete | </a>";
                                        echo "<a href = update.php?id=";echo $rows[0];echo ">Update</a></td>";
                                        echo "</tr>";
                                    }

                            ?>

                </table>

        </body>


</html>