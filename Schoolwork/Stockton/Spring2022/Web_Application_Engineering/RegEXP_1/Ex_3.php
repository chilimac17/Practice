<?php

    $string = "abcdef#ddgh @fdhbdfkdnfn ) fvdkfn]";

    echo "Old String: ".$string.'';

    $newstr = preg_replace("/[^A-Za-z0-9 ]/", '', $string); 

    echo "New String: ".$newstr."\n";

?>