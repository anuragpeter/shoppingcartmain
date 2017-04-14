<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fm" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<link href="/resources/bootstrap-3.3.6-dist/css/product.css" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
 
<fm:form action="productadd" commandName="product" class="form-horizontal" method="post" enctype="multipart/form-data">


 
<div class="container">
  
  <div class="row">
    <div class="col-md-6">
    <h1>Add Product</h1>
    </div>
  </div>
  
    
  
<div class="row">
  
  <div class="col-md-6">
    
 <div class="form-group">
   <label for="name" class="loginFormElement">name:</label>
   <fm:input class="form-control" path="name" />
 </div>
    
 <div class="form-group">
   <label for="price" class="loginFormElement">Product Price</label>
   <fm:input class="form-control" path="price" />
   
 </div>
   
   
   <div class="form-group">
   <label for="brand" class="loginFormElement">brand</label>
   <fm:input class="form-control" path="brand" />
 </div>
 
 <div class="form-group">
   <label for="categery" class="loginFormElement">categery</label>
   <fm:input class="form-control" path="categery" />
 </div>
 
 <div class="form-group">
   <label for="color" class="loginFormElement">color</label>
   <fm:input class="form-control" path="color" />
 </div>
    
    <div class="form-group">
      <label class="loginformelement" for="description">Product Description</label>
  	  <fm:input path="description" class="form-control input-lg" placeholder="Large" type="text"/><div class="container">
      </div>
      
      <div class="form-group">
      <label class="loginformelement" for="image">Product Image</label>
  	  <fm:input path="image" class="form-control input-lg" type="file"/><div class="container">
      </div> 
      
      
 
    <fm:button type="submit" id="loginSubmit" class="btn btn-success loginFormElement"/>Add Product</button>
  
    </div></form>
    
    </div>
  
  
 </div>
</fm:form>

</body>
</html>