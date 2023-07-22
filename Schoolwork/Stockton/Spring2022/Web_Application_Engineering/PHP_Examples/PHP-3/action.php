<html>
        <head>
            <title>Actions</title>
        <head>

        <body>
                <?php
                        $name  = $_POST['name'];
                        $hname = $_POST['hname'];
                        echo "Welcome Mr. $name";
                        echo "<br>";
                        echo "Hidden name is: $hname";
                        echo "<br>";
                        echo $_POST['CPP'];
                        echo "<br>";
                        echo $_POST['VB'];
                        echo "<br>";
                        if($_POST['CPP'] == 'CPP') {

                            echo "You know C++";
                        }
                        else {

                            echo "You don't know C++";
                        }
                        echo "<br>";
                        echo $_POST['nat'];
                        echo "<br>";
                        echo $_POST['dom'];
                ?>
        </body>

</html>