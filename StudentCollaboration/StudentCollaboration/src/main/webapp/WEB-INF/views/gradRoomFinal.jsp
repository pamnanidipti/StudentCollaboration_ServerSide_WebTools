<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>GradRoom</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/gradRoomStyle.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/dipti.css"/>

<style>
#errorBox{
 color:#FF4500;
 font-weight: bold;
 }
</style>


</head>


<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">

      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Login</h4>
          <c:if test="${!empty param.error}">
            <p style="color:red;"> Please enter valid credentials and login </p>
        </c:if>
        </div>
        <c:choose>
        	<c:when test="${!empty sessionScope.person.username}">
                <c:redirect url="login.htm?action=login"></c:redirect>                    
            </c:when>
            <c:otherwise>
          <div id="errorBox"></div>  
          
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form" name="loginForm" action="login.htm" method="post">
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span> Username</label>
              <input type="text" class="form-control" id="usrname" name="username" placeholder="Enter username">
            </div>
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Password</label>
              <input type="password" class="form-control" id="psw" name="password" placeholder="Enter password">
            </div>
            
              <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Login</button>
          	<input type="hidden" name="action" value="login" />
          </form>
          
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
          <p>Not a member? <a href="adduser.htm">Sign Up</a></p>
          
        </div>
        </c:otherwise>
        </c:choose>
      </div>
    </div>
  </div>
  

<script>
$(document).ready(function(){
    $("#myBtn").click(function(){
        $("#myModal").modal();
    });
});
</script>


   <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <button class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="glyphicon glyphicon-menu-hamburger"></span>
        </button>
          <a class="navbar-brand" href="#"><img src="${pageContext.request.contextPath}/resources/img/gradLogo.png" width="160" height="35"></a>
           <button type="button" class="btn btn-primary btn-lg" id="myBtn">Login</button>

      </div>
      <div class="collapse navbar-collapse" id="myNavbar" >
        <ul class="nav navbar-nav navbar-right" >
        <li class="dropdown" style="z-index:90001;">
          <button class="dropbtn" > <a class="page-scroll" href="#" >MS in US</a> &#9662</button>
          <div class="dropdown-content">
            <a href="#">List Of Universities</a>
            <a href="#">Admit Trends</a>
            <a href="#">Discussion forum</a>
          </div>
        </li>
        <li class="dropdown" style="z-index:90000;">
          <button class="dropbtn"><a class="page-scroll" href="#" >Resources</a> &#9662</button>
          <div class="dropdown-content">
            <a href="#">SOP/LOR</a>
            <a href="#">GRE/TOEFL</a>
            <a href="#">Application Assist</a>
              <a href="#">Visa Interview</a>
                <a href="#">FAQs</a>
          </div>
        </li>
        <li>
           <a class="page-scroll" href="#" style="font-size:16px">About us</a>
       </li>
        <li>
           <a class="page-scroll" href="#" style="font-size:16px">Contact</a>
       </li>


        </ul>
      </div>
    </div>
  </nav>
  <!-- Navigation -->

  <script>
$(document).ready(function(){       
   var scroll_start = 0;
   var startchange = $('#msinus');
   var offset = startchange.offset();
    if (startchange.length){
   $(document).scroll(function() { 
      scroll_start = $(this).scrollTop();
      if(scroll_start > offset.top) {
          $(".navbar-default").css('background-color', 'black');
       } else {
          $('.navbar-default').css('background-color', 'transparent');
       }
   });
    }
});
</script>

        <!-- /.container -->
    </nav>


<div class= "row">


<div class="col-sm-12 test">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>

    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

    
      <div class="item active">
        <img src="${pageContext.request.contextPath}/resources/img/studyab1.jpg"  width="460px" height="345px">
      </div>

      <div class="item">
        <img src="${pageContext.request.contextPath}/resources/img/app.jpg"  width="460px" height="345px">
      </div>



      <div class="item">
        <img src="${pageContext.request.contextPath}/resources/img/grad.jpg"  width="460px" height="345px">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>

</div>

</div>



<!-- MS in US starts -->


<div class="container test backgroundimage" id="msinus">
<br><br><br><br><br>
<br><br>
<div class="opaquebg">
<br>
<center> <h1 style="color:red" > MS in US </h1>
<h4 style="color:blue"> Be the master of your future! </h4>

</center>
<br>
</div>

<br><br><br><br>
<br><br><br><br>
  <div class="row">

    <div class="col-sm-4">
    <center><a href="#"><img class="circ" src="${pageContext.request.contextPath}/resources/img/admit1.jpg"></a></center>
    </br></br></br>
    </div>

    <div class="col-sm-4">
    <center><a href="#"> <img class="circl" src="${pageContext.request.contextPath}/resources/img/list1.jpg"></a> </center>
    <br></br></br>
   </div>
    <div class="col-sm-4">
   <center><a href="#"><img class="circle" src="${pageContext.request.contextPath}/resources/img/discussion1.jpg"></a> </center>
   </br></br></br>
    </div>
</div>
<br><br><br><br>
<br><br>
</div>


<!-- MS in US ends -->


 <!--Resources Section starts-->
 <section class="packages" id="resources">
    <div class ="row">
    <div class="col-sm-12">
        <div class="resources" >
            <center><h1><strong><font color="white">RESOURCES</h1>
                        Refer to the following material for better guidance</font></strong>
            </center><br>
        
      
            <div class="col-lg-3 col-sm-3">
      <div class="package">
        <div class="package-header green-bg">
                                    
                                    <h3><center>SOP/LOR SAMPLES</center></h3>
        </div>
        <div class="price dark-bg">

<ul class="ratingsList">        
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRatingNormal"><span class="glyphicons glyphicons-star"></span></li>
</ul>

        </div>
                            
        <ul>
          <li class="ok"><span class="halflings halflings-ok"></span>50 Sample Examples</li>
          <li class="ok"><span class="halflings halflings-ok"></span>Free Online Help</li>
          <li class="ok"><span class="halflings halflings-remove"></span>Access to Tutorials</li>
          <li class="remove"><span class="halflings halflings-remove"></span>Free Download</li>
          
        </ul>
                            <center><a href="#" class="btn btn-primary custom-button green-btn">
                                    View </a></center>
      </div>
    </div>
<!--            End of first section-->
<!--        </div>-->
<div class="col-lg-3 col-sm-3">
      <div class="package">
        <div class="package-header blue-bg">
                                    
                                    <h3><center>GRE/TOEFL SAMPLES</center></h3>
        </div>
        <div class="price dark-bg">
          
<ul class="ratingsList">        
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
</ul>
        </div>
                            
        <ul>
          <li class="ok"><span class="halflings halflings-ok"></span>50 Sample Examples</li>
          <li class="ok"><span class="halflings halflings-ok"></span>Free Online Help</li>
          <li class="ok"><span class="halflings halflings-remove"></span>Access to Tutorials</li>
          <li class="remove"><span class="halflings halflings-remove"></span>Free Download</li>
          
        </ul>
                            <center><a href="#" class="btn btn-primary custom-button blue-btn">
                                    View </a></center>
      </div>
    </div>
<!--End of section two-->
<div class="col-lg-3 col-sm-3">
      <div class="package">
        <div class="package-header red-bg">
                                    
                                    <h3><center>Application assist</center></h3>
        </div>
        <div class="price dark-bg">
<ul class="ratingsList">        
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRatingNormal"><span class="glyphicons glyphicons-star"></span></li>
</ul>
        </div>
                            
        <ul>
          <li class="ok"><span class="halflings halflings-ok"></span>First Seminar Free</li>
          <li class="ok"><span class="halflings halflings-ok"></span>Free Online Help</li>
          <li class="ok"><span class="halflings halflings-ok"></span>Access to Tutorials</li>
          <li class="ok"><span class="halflings halflings-ok"></span>All Universities</li>
          
        </ul>
                            <center><a href="#" class="btn btn-primary custom-button red-btn">
                                    View </a></center>
      </div>
    </div>
<!--End of section three-->
<div class="col-lg-3 col-sm-3">
      <div class="package">
        <div class="package-header yellow-bg">
                                    
                                    <h3><center>VISA INTERVIEW</center></h3>
        </div>
        <div class="price dark-bg">
          <ul class="ratingsList">        
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRating"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRatingNormal"><span class="glyphicons glyphicons-star"></span></li>
    <li class="userRatingNormal"><span class="glyphicons glyphicons-star"></span></li>
</ul>
        </div>
                            
        <ul>
          <li class="ok"><span class="halflings halflings-ok"></span>First Seminar Free</li>
          <li class="ok"><span class="halflings halflings-ok"></span>Free Online Help</li>
          <li class="ok"><span class="halflings halflings-ok"></span>Access to Tutorials</li>
          <li class="ok"><span class="halflings halflings-ok"></span>All Universities</li>
          
        </ul>
                            <center><a href="#" class="btn btn-primary custom-button yellow-btn">
                                    View </a></center>
      </div>
    </div>
<!--End of section foue-->
    </div>
        </div>
    </div><br><br>
     </section>
 <!--Resources section ends-->
<!--About Us Section    -->


        <div class="aboutus" id="aboutus">
            <div class ="row">
    <div class="col-sm-12"><br>
            <center><h1><strong><font color="white">ABOUT US</h1>
                        WE GUARANTEE YOUR SUCCESS !</font></strong>
            </center>
            <br><br>
            <div class="row">
            <div class="col-md-4">
    <div class="big-intro" >
                    <p> <font color="#330000">Effective And Informed Decisions About Education</font></p>
      </div>
    </div>
                
                <div class="col-md-4">
                    <p><strong><font size="3px">
         GradRoom started off in February 2016 as a college review website that offers students' opinions on 
                                 everything you have to know about colleges, courses and universities.<br/><br/>
                                 Over time, we generated an 
                                 extensive pool of content that helps students throughout their undergraduate journey.
<br/><br/>
Today, thousands of students use GradRoom's study resources and information to excel in academics 
and make informed choices about their careers.</font>
</strong></p>

    </div>
                <div class="col-md-4">
                    <ul>
                        <li>
                            <div class="clearfix">
                                <div class="c100 p85 small">
                    <span>85%</span>
                    <div class="slice">
                        <div class="bar"></div>
                        <div class="fill"></div>
                        
                    </div>
                    
                </div>
                                <br/>
                                <strong>
                                    <font size="4px">Success Rate since year 2010    </font> </strong>
              </div>
                            
                        </li>
<!--<div style="display: inline; width: 64px; height: 200px;">
    <canvas id="myCanvas" width="578" height="200"></canvas>
    <input type="text" value="86" data-thickness=".2" class="rating" readonly="readonly" style="width: 36px; height: 21px; position: absolute; vertical-align: middle; margin-top: 21px; margin-left: -50px; border: 0px; font-style: normal; font-variant: normal; font-weight: bold; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Arial; text-align: center; color: rgb(255, 255, 255); padding: 0px; -webkit-appearance: none; background: none;">
</div>-->
                        <li>
                            <div class="clearfix">
                                <div class="c100 p93 small">
                    <span>93%</span>
                    <div class="slice">
                        <div class="bar"></div>
                        <div class="fill"></div>
                    </div>
                </div>
                                <br/>
                                <font size="4px"><strong>Successful College Match!! </strong>   </font>
              </div>
                        </li>
                        
                        <li>
                            <div class="clearfix">
                                <div class="c100 p12 small">
                    <span>12%</span>
                    <div class="slice">
                        <div class="bar"></div>
                        <div class="fill"></div>
                    </div>
                </div>
                                <br/>
                                <font size="4px"><strong>Non-Admits since year 2010</strong>    </font>
              </div>
                        </li>
                            
<!--                            <h6>Success Rate</h6>
                            <p>This is a testing line.This is a testing line.</p>-->
                            
                        
                    </ul>
                    
                </div>
            </div>
        </div>
    </div><br><br><br>
            <div class = "panel panel-default" style="text-align:center;">
      
      <div class = "panel-heading panel-heading" style="background-color:#009966 !important;">
        <h4 class = "panel-title">
            <a data-toggle = "collapse" data-parent = "#accordion" href = "#view">
                <b><font color=white><strong>MEET OUR TEAM >></strong></font></b>
            </a>
         </h4>
      </div>
      
      <div id = "view" class = "panel-collapse collapse">
         <div class = "panel-body" style="background-image: url(${pageContext.request.contextPath}/resources/img/forum1.jpg);">
           <div class="row">
               <div class="col-lg-4 col-md-2 col-sm-4">
                   <br/>
                   <!--<img class="img-circle" src="${pageContext.request.contextPath}/resources/img/Dipti.jpg"/>-->
                   <div class="img-circle" style="background:url(${pageContext.request.contextPath}/resources/img/Dipti.jpg);">
                       <p class="imgDescription"><br/><br/><br/><br/><br/><br/><strong>Dipti Pamnani<br/><br/>
                       Co-founder & Web Developer</strong></p>
                   </div>
               </div>
               
               <div class="col-lg-4 col-md-2 col-sm-4">
                   <br/>
                   <!--<img class="img-circle" src="${pageContext.request.contextPath}/resources/img/Dipti.jpg"/>-->
                   <div class="img-circle" style="background:url(${pageContext.request.contextPath}/resources/img/Vega.jpg);">
                       <p class="imgDescription"><br/><br/><br/><br/><br/><br/><strong>Vega Shetty
                           <br/><br/>
                       Co-founder & Web Developer</strong></p>
                   </div>
               </div>
               
               <div class="col-lg-4 col-md-2 col-sm-4">
                   <!--<img class="img-circle" src="${pageContext.request.contextPath}/resources/img/Dipti.jpg"/>-->
                   <br/>
                   <div class="img-circle" style="background:url(${pageContext.request.contextPath}/resources/img/Tanisha.jpg);">
                       <p class="imgDescription"><br/><br/><br/><br/><br/><br/><strong>Tanisha Jain
                           <br/><br/>
                       Co-founder & Web Developer</strong></p>
                   </div>
               </div>
               
           </div>
         </div>
</div>
<!--About US section ends-->
<script>

      var canvas = document.getElementById('myCanvas');
      var context = canvas.getContext('2d');
      var centerX = canvas.width / 2;
      var centerY = canvas.height / 2;
      var radius = 20;

      context.beginPath();
      context.arc(centerX, centerY, radius, 0, 2 * Math.PI, false);
      context.fillStyle = 'green';
      context.fill();
      context.lineWidth = 5;
//      context.strokeStyle = '#003300';
//      context.stroke();

</script>



<div class="container contact test3">

<div class= "row" id="contact">




<!--div class="" >-->

<br/><br/>
<center id="get"><font size="350">Get in Touch</font><br/><br/>
<b id="we">We would love to hear from you!</b><br/><br/></br>



<div class="col-sm-4 test">
<center>
<input type="text"  class="form-control" name="name" value="" placeholder="Your Name">&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
<br/><br/><br>

</div>
</center>



<div class="col-sm-4 test">
  <center>
<input type="email"  class="form-control" name="email" value="" placeholder="E-mail">&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
<br/><br/><br>

</div>
</center>

<div class="col-sm-4 test">
  <center>
<input type="text"  class="form-control" name="subject" value="" placeholder="Subject">&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
 <br/><br/>
</div>

</center>

    <div class="col-sm-12 test4">
 <center>
 
<textarea placeholder="  Message" class="form-control"  style="min-width: 80%" rows="7" name="message" value="" ></textarea><br/><br/>  <br/>

<button type="button" class="btn btn-primary">Send Message</button>
<br/><br/><br/></center>


</div>


</div>


</div>

<!--</div>-->

<!-- your div ends here -->

<div class= "row address">


 <div class="col-sm-2"><br/>


  <center><address><img src="${pageContext.request.contextPath}/resources/img/adresses.png" width="60" height="50" align = "center"><br/>
 <a href="https://www.google.com/maps/@42.3343,-71.1007,15z">
 <h5> 75 Saint Alphonsus St,<br/> Boston<br/>MA-02120</a></address></center></div>


  <div class="col-sm-2"> <br/><center><img src="${pageContext.request.contextPath}/resources/img/E-Mail-Icon.png" width="60" height="50" align = "center"><br/><br/>
   <h5>  <a href="mailto:vegashetty@gmail.com" target="_top">contact@gradroom.com</a>


  </div>



  <div class="col-sm-2"><br/><center><img src="${pageContext.request.contextPath}/resources/img/phone-green-icon.png" width="60" height="50" align = "center">
<br/><br/>
   <h5> Call us : <a href="tel:+18578004331">857-800-4331</a>

  </div>

  <div class="col-sm-2"><br/>
   <center><a href="https://www.facebook.com"><img src="${pageContext.request.contextPath}/resources/img/fb.png" width="60" height="50" align = "center"></a></center> </div> &nbsp &nbsp &nbsp
   <div class="col-sm-2"><br/>
   <center><a href="https://twitter.com"><img src="${pageContext.request.contextPath}/resources/img/Twitter-icon.png" width="60" height="50" align = "center"></a> </center></div> &nbsp &nbsp &nbsp
    <div class="col-sm-2">
    <center><a href="https://www.instagram.com"><img src="${pageContext.request.contextPath}/resources/img/insta.png" width="60" height="50" align = "center"></a> </center></div>

  </div>




 <div class="row address">
<div row="col-sm-12">
<footer>


<center> <nav> <a href = "termcon.html"> Terms & Conditions </a>|

 <a href="faq-1.html" >FAQs </a> | 
<small><b>� Copyright 2016, GradRoom</b></small> </nav></center>


</footer>
</div>
</div>


  <!-- Footer -->


</body>
</html>