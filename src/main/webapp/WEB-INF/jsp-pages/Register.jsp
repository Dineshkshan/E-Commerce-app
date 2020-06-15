<html>

<head>
    <title>Registeration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="css-files/Register.css">
    <script src="javascript-files/Register.js"></script>
</head>

<body>
    <div class="heading"><h1>DK clothing!!</h1></div>
    <marquee id="move"><h5>Welcome to Dk Clothing!!!</h5></marquee>
    <div class="main">
        <header class="header">Register page</header>
        <form onsubmit="return validation()" action="/Login" method="post">
            <div class="container">
                <div class="form-group">
                    <label>UserName</label>
                    <input type="text" class="form-control" id="text1" name="uname" />
                    <div class="text-danger">
                        <p id="error1"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label>Phone number</label>
                    <input type="text" class="form-control" id="text2" name="pnumber" />
                    <div class="text-danger">
                        <p id="error2"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="text" class="form-control" id="text3" name="password"/>
                    <div class="text-danger">
                        <p id="error3"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label>Confirm Password</label>
                    <input type="text" class="form-control" id="text4" name="cpassword"/>
                    <div class="text-danger">
                        <p id="error4"></p>
                    </div>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary " id="btn">Register</button>
                </div>
            </div>
        </form>
    </div>
</body>

</html>