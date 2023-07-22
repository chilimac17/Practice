<?php
    $option = $_POST['op'];
    if($option == 1){
        include 'Mean.php';
    }else if($option == 2){
        include 'Median.php';
    }else if($option == 3){
        include 'Mode.php';
    }

?>