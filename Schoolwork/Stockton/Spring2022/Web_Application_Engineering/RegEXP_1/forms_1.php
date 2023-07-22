
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>

<body style = "background-color:lightgray">

   <!-- NAVBAR -->
          <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
              <a class="navbar-brand" href="#"><b>Regular Expression Example</b></a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="#">Link</a>
                  </li>
                  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Dropdown
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                      <li><a class="dropdown-item" href="#">Action</a></li>
                      <li><a class="dropdown-item" href="#">Another action</a></li>
                      <li><hr class="dropdown-divider"></li>
                      <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link disabled">Disabled</a>
                  </li>
                </ul>
                <form class="d-flex">
                  <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                  <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
              </div>
            </div>
          </nav>
    <div class="container">
        <table class="table table-hover"><td>
        <form id = "form1" name = "form1" method="get" action="actions1.php">

            <div class="form-group">

                <label><h2>Name</h2></label>
                <input type="text" name="name" class="form-control" placeholder="Type your name">                        

            </div>


            <div class="form-group">

                <label><h2>Email</h2></label>
                <input type="text" name="email" class="form-control" placeholder="Type your Email">                        
                
            </div>            

            <div class="form-group">

                <label><h2>Date of Birth</h2></label>
                <input type="text" name="dob" class="form-control" placeholder="Type your DOB">                        
                
            </div>            

            <div class="form-group">
                <label>Select your domicile</label>
                <select class = "form-control" name = "dom">
                    <option value="NY">New York</option>
                    <option value="LA">Los Angeles</option>
                    <option value="LX">Las Vegas</option>
                
                </select>
            
            </div>            

            <button type="submit" class="btn btn-outline-primary">Submit</button>
        
        
        </form>
        </td>
        </table>
    
    </div>

</body>

</html>