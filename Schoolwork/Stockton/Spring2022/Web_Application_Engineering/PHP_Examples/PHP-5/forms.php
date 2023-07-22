

<html>

        <head>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">    
        </head>

        <body>
                <form name = "form1" method = "post" action = "reg_action.php" enctype = "multipart/form-data">


                    <table class = "table table-striped table-hover" border = "1" style = "width:50%" align = "center">
                                <tr>
                                        <th colspan = "2"><div align = "center">User Registration Form</div></th>


                                </tr>

                                <tr>
                                        <td colspan = "2">

                                                <?php
                                                    error_reporting(0);
                                                    echo $_GET['msg'];
                                                ?>

                                        </td>
                                </tr>

                                <tr>
                                        <td width = "175">Name</td>
                                        <td><input type = "text" name = "name"></td>
                                </tr>

                                <tr>
                                        <td width = "175">Email</td>
                                        <td><input type = "text" name = "email"></td>
                                </tr>      
                                
                                <tr>
                                        <td width = "175">Password</td>
                                        <td><input type = "text" name = "password"></td>
                                </tr>          
                                
                                <tr>
                                        <td width = "175">Upload your picture</td>
                                        <td><input type = "file" name = "pic"></td>
                                </tr>

                                <tr>                                        
                                        <td colspan = "2">
                                            <div>
                                                    <input type = "submit" value = "Register">
                                            </div>
                                        </td>   
                                </tr>

                    </table>


                </form>

        </body>


</html>