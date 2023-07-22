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

        sort($list);
        if($arrayNum % 2 == 0){
            $median = ($list[$arrayNum/2-1] + $list[$arrayNum/2])/2;
        }else{
            $median = $list[$arrayNum/2];
        }
        $printArray = implode("&nbsp &nbsp",$list);
        
        echo "<center>";
        echo "<br><br><h3 style = 'color:green'>Initialized Array --></h3><br>";
        echo "<h3 style = 'color:red'>$printArray</h3><br>";
        echo "<h3 style = 'color:maroon'> Median = $median</h3>";
        echo "</center>"
        
    ?>
    </body>
</html>