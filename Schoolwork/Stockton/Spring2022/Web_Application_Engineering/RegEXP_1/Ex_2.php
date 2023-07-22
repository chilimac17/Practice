<?php

    $pattern = '|[^\w]dog\s|';

    $string = "The quick brown fox jumped over the lazy sleeping dog ";


    if(preg_match($pattern, $string)) {

        echo "'dog' is present";
    }

    else {

        echo "'dog' is not present";
    }



?>