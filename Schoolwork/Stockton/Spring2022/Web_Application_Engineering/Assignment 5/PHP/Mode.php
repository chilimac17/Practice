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
        
        $printArray = implode("&nbsp &nbsp",$list);
        $mode = 0; 
        $count;
        $maxCount = 0;
        for($i = 0; $i < $arrayNum; $i++){
            $count = 0;
            for($j = $i+1; $j < $arrayNum; $j++){
               if($list[$i] == $list[$j]){
                   $count++;
               } 
               if($count > $maxCount){
                   $maxCount = $count;
                   $mode = $list[$i];
               }
            }
        }
        if($mode == 0){
            $mode = "No Mode Found";
        }
        echo "<center>";
        echo "<br><br><h3 style = 'color:green'>Initialized Array --></h3><br>";
        echo "<h3 style = 'color:red'>$printArray</h3><br>";
        echo "<h3 style = 'color:darkcyan'> Mode = $mode</h3><br>";
        echo "</center>"
        
    ?>
    </body>
</html>