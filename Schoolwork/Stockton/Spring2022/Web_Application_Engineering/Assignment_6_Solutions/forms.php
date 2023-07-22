	<html>
<head>
<title>Search a string</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style = 'background-color:lightgray'>
		
		<?php
				include("nav.php");
		?>

<center>
<form id = 'form1' name = "form1" method = "post" action = "actions.php">
	<table class = "table table-striped table-hover table-bordered" style='width:50%'>
		<tr>
			<td colspan = "3"><div align = "center"><h2 style = "color:green">Search a String in another String</h2></div></td>
		</tr>


		<tr>
			<td width = "178"><h3 style = "color:maroon">Enter a String</h3></td>				
			<td width = "162"><label><input type = "text" name = "mainstr" />
			</label>
			</td>
		</tr>		
		
		<tr>
			<td><h3 style = "color:teal">The String you want to search</h3></td>				
			<td><label><input type = "text" name = "substr" />
			</label>
			</td>
		</tr>				
		
		
		<tr>	
			<td colspan = "3"><label>
				<div align = "right">
					<button type = "submit" class = "btn btn-outline-primary">Submit</button>
				</div>
				</label>
			</td>
		</tr>
	</table>
</form>						 				
</center>		
</body>
<html>