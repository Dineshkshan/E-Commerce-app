<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
    <title>DK Clothing</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="css-files/Main.css">
    <script src="javascript-files/jquery-3.5.1.js"></script>
    <script src="javascript-files/main.js"></script>
</head>

<body>
    <div class="heading">
        <h1>DK Clothing</h1>
        <a id="logout" href="/">Logout</a>
        <img src="images/cart.png" id="image">
    </div>
    <marquee id="move">Welcome to DK Clothing!!!</marquee>
    <div class="form-group">
        <h4 style="margin-left: 600px;color: red;margin-bottom: 30px;">Select the following!!</h4>
        <button id="Men" type="submit" class="btn btn-danger btn-lg">Men's Section</button>
        <button id="Ladies" type="submit" class="btn btn-danger btn-lg">Ladies's Section</button>
        <button id="Kid" type="submit" class="btn btn-danger btn-lg">Kid's Section</button>
    </div>
    <form:form action="/placeorder" modelAttribute="orderCloth" method="post">
        <div class="men">
		<form:checkbox path="OrderDetails" style="margin-left: 40px;" value="T-shirts" id="defaultCheck1"/>
		<label for="defaultCheck1" class="btn btn-danger btn-sl">T-Shirts</label>
        <form:checkbox path="OrderDetails"  style="margin-left: 40px;" value="Shirt" id="defaultCheck2"/>
        <label for="defaultCheck2" class="btn btn-danger btn-sl">Shirts</label>
		<form:checkbox path="OrderDetails" style="margin-left: 40px;" value="Formal-pant" id="defaultCheck3"/>
		<label for="defaultCheck3" class="btn btn-danger btn-sl">Formal-Pant</label>
		<form:checkbox path="OrderDetails"  style="margin-left: 40px;" value="Jeans-Pant" id="defaultCheck4"/>
		<label for="defaultCheck4"class="btn btn-danger btn-sl">Jeans-Pant</label>
        </div>
    <div class="Ladies">
		<form:checkbox path="OrderDetails"  style="margin-left: 40px;"  value="Silk-Saree" id="defaultCheck5"/>
		<label for="defaultCheck5" class="btn btn-danger btn-sl">Silk-Saree</label>
		<form:checkbox path="OrderDetails"  style="margin-left: 40px;"  value="Cotton-Saree" id="defaultCheck6"/>
		<label for="defaultCheck6" class="btn btn-danger btn-sl">Cotton-Saree</label>
		<form:checkbox path="OrderDetails"  style="margin-left: 40px;"  value="Garden-Saree" id="defaultCheck7"/>
		<label for="defaultCheck7" class="btn btn-danger btn-sl">Garden-Saree</label>
        <form:checkbox path="OrderDetails"  style="margin-left: 40px;" value="Chudithar" id="defaultCheck8"/>
        <label for="defaultCheck8" class="btn btn-danger btn-sl">Chudithar</label>
    </div>
    <div class="kids">
        <form:checkbox path="OrderDetails"  style="margin-left: 40px;" value="Shirt" id="defaultCheck9"/>
        <label for="defaultCheck9" class="btn btn-danger btn-sl">Shirts</label>
        <form:checkbox path="OrderDetails"  style="margin-left: 40px;"  value="Pant" id="defaultCheck10"/>
        <label for="defaultCheck10" class="btn btn-danger btn-sl">pant</label>
        <form:checkbox path="OrderDetails"  style="margin-left: 40px;" value="Trousers" id="defaultCheck11"/>
        <label for="defaultCheck11" class="btn btn-danger btn-sl">trousers</label>
        <form:checkbox path="OrderDetails"  style="margin-left: 40px;"  value="Gown" id="defaultCheck12"/>
        <label for="defaultCheck12" class="btn btn-danger btn-sl">Gown</label>
    </div>
    <button type="submit" class="btn btn-danger btn-lg" id="order">Place Order</button>
    </form:form>
</body>

</html>