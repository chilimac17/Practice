<html>
<head>
<title>Transfer data</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style = 'background-color:silver'>
<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#"><b>Statistics ToolBox</b></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
<!-- END OF NAVBAR -->
<center>
<table class = "table table-hover table-bordered" style="width:700px">
  <td>
        <div class="container">
          <form id = 'form1' name = "form1" method = "post" action = "actions_1.php">
              <div class="form-group">
                <label><h2>Enter size of an array:<h2></label>
                <input type="text" name="size" class="form-control" placeholder="Type in an integer">
              </div>
              <div class="form-group">
                <label>Select an option</label>
                <select class="form-control"  name = "choice">
                  <option value="Mean">Compute Mean</option>
                  <option value="Median">Compute Median</option>
                  <option value="Mode">Compute Mode</option>
                </select>
              </div>
              <button type="submit" class = "btn btn-outline-primary">Submit</button>
          </form>
		</div>
  </td>
</table>
</center>
</body>
<html>