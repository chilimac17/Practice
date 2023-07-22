<html>
<head>
<title>Action page: Search a string</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style = "background-color:lightgray">


<?php
include("nav.php");
$main = $_POST['mainstr'];
$pattern = $_POST['substr'];


$pattern2 = '/'.$pattern.'/';
echo "<html><body bgcolor = lightgrey><center>";

if (preg_match($pattern2,$main))
  {  
  echo "<h1>"."'$pattern' is present..."."\n"."</h1>";
  }
  else
  echo "<h1>"."'$pattern' is not present..."."\n"."</h1></center></body>";
?>
</body>
<html>