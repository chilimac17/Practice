<html>
    <head>
        <title>Transfer Data</title>
    </head>
    <body>
        <form name="form1" method = "post" action ="action.php" >
            Enter your name: 
            <input type = "text" name = "name" value = "Your Name">
            <input type = "hidden" name="hname">
            <br>
            Which of the following languages do you know?
            <br>
            <input type "checkbox" name = "CPP" value="CPP">C++
            <input type "checkbox" name = "VB">VB
            <br>
            Your Nationality
            <br>
            <input type = "radio" name="nat" value = "Single">Single
            <input type = "radio" name="nat">Dual
            <br>
            You are a resident of:
            <select name="dom">
                <option value = "NY">New York</option>
                <option value = "NJ">New Jersey</option>
                <option value = "OR">Oregon</option>
                <option value = "CA">California</option>
            </select>
            <br>
            <input type = "Submit" >
        </form>
    </body>
</html>