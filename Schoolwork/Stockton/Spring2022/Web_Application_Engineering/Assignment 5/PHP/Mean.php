<html>
    <head>
        <title>Mean</title>
    </head>
    <body style="background-color: lightgray;">
    <?php
        $arrayNum = $_POST['num'];
        $list = array();
        function ranNums(){
            return mt_rand(0,10);
        }
        for($i = 0; $i< $arrayNum; $i++){
            $list[$i] = ranNums();
        }

        $printArray = implode("&nbsp &nbsp",$list);
        $average = array_sum($list)/count($list);
        echo "<center>";
        echo "<br><br><h3 style = 'color:green'>Initialized Array --></h3><br>";
        echo "<h3 style = 'color:red'>$printArray</h3><br>";
        echo "<h3 style = 'color:maroon'> Mean = $average</h3>";
        echo "</center>"
        
    ?>
    </body>
</html>
