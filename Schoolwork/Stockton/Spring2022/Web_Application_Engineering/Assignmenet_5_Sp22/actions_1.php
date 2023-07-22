<html>
<head>
<title>PHP Operators 2</title>
</head>
<body>
<?php
echo '<head>';
echo '<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">';
echo '</head>';
$name = $_POST['choice'];


$size = $_POST['size'];
echo "<body style = 'background-color:lightgrey'><center>";
echo "<br><br><br><br><br><br><h2 style = 'font-family:tahoma;color:green'>Initialized array --><br><br></h2>";
echo "<h2 style = 'font-family:tahoma;color:red'>";
for ($i = 0; $i < $size; $i++) {
	$A[$i] = mt_rand(1,10);
	echo $A[$i]."&nbsp;&nbsp;&nbsp;";
}
echo "</h2>";

switch($name)
{
case "Mean":

$sum = 0;
for ($i = 0; $i < $size; $i++) {
	$sum+= $A[$i];
}
$mean = $sum/$size;

echo "<br><br><h3 style = 'font-family:tahoma;color:maroon'>Mean = $mean</h3>";
break;

case "Median":
$B = $A;
for ($i = 0; $i < $size; $i++) {
			for ($j = $i + 1; $j < $size; $j++) {
				if($B[$i] > $B[$j]) {
					$temp = $B[$i];
					$B[$i] = $B[$j];
					$B[$j] = $temp;
				}
			}
		}

if($size % 2 == 0)
		$median = 0.5 * ($B[($size - 2)/2] + $B[$size/2]);
else
   		$median = $B[($size - 1)/2];

echo "<br><br><h3 style = 'font-family:tahoma;color:blue'>Median = $median</h3>";
break;
case "Mode":
for ($j = 0; $j < $size; $j++)
			$freq[$j] = -1;


for	($k = 0; $k < $size; $k++) {

			$count = 1;

			for ($l = $k + 1; $l < $size; $l++) {

				if($A[$k] == $A[$l]) {
					$count++;
					$freq[$l] = 0;
				}
			}

			if($freq[$k] != 0)
				$freq[$k] = $count;
}

$max_idx = 0;

for	($k = 0; $k < $size; $k++) {
			if($freq[$k] > $max_idx)
				$max_idx = $freq[$k];
}

$F = array_diff($freq, [0]);	//Contains the frequency of each number in the array

$result = array_unique($F);		//Find unique values in the frequency array




			 if(count($result) == 1) {	//If all values occur with equal frequency, count($result) will be equal to 1.

				echo "<br><br><h3 style = 'font-family:tahoma;color:teal'>There is no mode in the set.</h3>";
				break;
			 }
			 else {
				for	($k = 0; $k < $size; $k++) { 

					if($freq[$k] == $max_idx) 
						echo "<br><br><h3 style = 'font-family:tahoma;color:teal'>Mode = $A[$k]</h3>";

			 }
				
}

}
echo "</center></body>";
?>
</body>
<html>
