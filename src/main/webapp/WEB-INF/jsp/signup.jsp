<%@taglib prefix="fm" uri="http://www.springframework.org/tags/form"%>
<html><head>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
</head>
<body>

<fm:form action="useradd"  modelAttribute="user" method="post">



<br />
<div class="container">
    <div class="col-md-3"></div>
    <div class="col-md-6">
         <div class="row myborder">
             <h4 style="color: #7EB59E; margin: initial; margin-bottom: 10px;">Sign Up Now</h4><hr>
            <div class="input-group margin-bottom-20">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
                <fm:input size="60" maxlength="255" class="form-control" placeholder="Username"  path="username" type="text"/>                                                        </div>
            <div class="input-group margin-bottom-20">
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock mycolor"></i></span>
                <fm:input size="60" maxlength="255" class="form-control" placeholder="Password"  path="password" type="password"/>                                    </div>
            <div class="input-group margin-bottom-20">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
                <fm:input size="60" maxlength="255" class="form-control" placeholder="First Name"  path="firstname" type="text"/>                                    </div>
            <div class="input-group margin-bottom-20">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
                <fm:input size="60" maxlength="255" class="form-control" placeholder="Last Name" path="lastname" type="text"/>                                    </div>
            <div class="input-group margin-bottom-20">
                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope mycolor"></i></span>
                <fm:input size="60" maxlength="255" class="form-control" placeholder="Address" path="address" type="text"/>                                    </div>
            <div class="input-group margin-bottom-20">
                <span class="input-group-addon"><i class="glyphicon glyphicon-phone mycolor"></i></span>
                <fm:input size="60" maxlength="255" class="form-control" placeholder="Contact Number" path="contact" type="text"/>                                    </div>
            <div class="row">
                <div class="col-md-12">
                    <button class="btn-u pull-left" type="submit">Sign Up</button>
                </div>
            </div>
        </div>
        <div class="col-md-2"></div>
    </div>
      </div>




</fm:form>

</body>
</html>