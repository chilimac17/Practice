<html>
        <body>
                <?php
                        $number = 10;
                        echo gettype($number)."<br>";
                        settype($number, "string");    
                        echo gettype($number);
                ?>  

        </body>

</html>