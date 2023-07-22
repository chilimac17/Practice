<html>
<head>
<title>Action page: Remove special characters</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style = "background-color:lightgray">


<?php
include("nav.php");
$string = $_POST['mainstr'];
echo "<html><body><center>";

echo '<h1 style = "font-family:tahoma;color:maroon">Old string : '.$string.'</h1>';
echo '<br>';
$newstr = preg_replace("/[^A-Za-z0-9 ]/", '', $string);
echo '<h1 style = "font-family:tahoma;color:green">New string : '.$newstr."</h1>\n";
echo "</center></body>";
?>
</body>
<html>