pics = new Array("07car1.jpg","2019_genesis_g80_angularfront.jpg","p_red_car.jpg");
count = 0;pcount = pics.length; 
function npic()
{
count++
if(count < pcount)
document.pic.src = pics[count]
else
{
	count = 0
	document.pic.src = pics[count]
}
}
function ppic() 
{
count--
if(count > -1)
document.pic.src = pics[count]
else
{
count = pcount - 1
document.pic.src = pics[count]
}
}

function changePic(imgsrc)
{
document.getElementById("pic").src = imgsrc
}

function execOption() {

    if(document.form1.elements[0].value == "Rollover") {

        document.write('<body style = "background-color: lightgrey;">');
        document.write('<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">');
        document.write('<object width = "100%" data="nav.html"></object>');
        document.write('<h1><center><br>Image Rollover</center></h1>');
        document.write('<script src = "myScript.js"></script>');
        document.write('<img src = "2019_genesis_g80_angularfront.jpg" id = "pic"');
        document.write('onmousemove = changePic("07car1.jpg") onmouseout = changePic("2019_genesis_g80_angularfront.jpg")>');        

    }    
    
    if(document.form1.elements[0].value == "Preview") {

        document.write('<body style = "background-color: lightgrey;">');
        document.write('<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">');
        document.write('<object width = "100%" data="nav.html"></object>');
        document.write('<h1><center><br>Image Preview</center></h1>');
        document.write('<script src = "myScript.js"></script>');
        document.write('<table width = "711" border = "0" align = "center">');
        document.write('<tr>');
        document.write('<td height = "297">');
        document.write('<img src = "07car1.jpg" id = "pic" height = "400" width = "700" border = "2">');
        document.write('</td>');
        document.write('</tr>');
        document.write('<tr>');
        document.write('<td>');
        document.write('<img src = "07car1.jpg" height = "100" width = "133" border = "2" onclick=');
        document.write('changePic("07car1.jpg")>');
        document.write('<img src = "2019_genesis_g80_angularfront.jpg" height = "100" width = "133" border = "2" onclick=');
        document.write('changePic("2019_genesis_g80_angularfront.jpg")>');
        document.write('<img src = "p_red_car.jpg" height = "100" width = "133" border = "2"');
        document.write('onclick=changePic("p_red_car.jpg")>');
        document.write('</td>');
        document.write('</tr>');
        document.write('</table>');
        
    }    

    if(document.form1.elements[0].value == "Slideshow") {

        document.write('<body style = "background-color: lightgrey;">');
        document.write('<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">');
        document.write('<object width = "100%" data="nav.html"></object>');
        document.write('<h1><center><br>Image Slideshow</center></h1>');
        document.write('<script src = "myScript.js"></script>');
        document.write('<table width = "200" border = "0" align = "center">');
        document.write('<tr>');
        document.write('<td height = "297">');
        document.write('<img src = "p_red_car.jpg" name = "pic" height = "350" width = "500" border = "2">');
        document.write('</td>');
        document.write('</tr>');
        document.write('<tr>');
        document.write('<td align = "center">');
        document.write('<img src = "green_left_arrow_104.jpg" height = "50" width = "50" onclick=ppic()>');
        document.write('<img src = "green_right_arrow_101.jpg" height = "50" width = "50" onclick="npic()">');
        document.write('</td>');
        document.write('</tr>');
        document.write('</table>');

    }  
 
}