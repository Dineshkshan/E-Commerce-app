<!DOCTYPE html>
<html>

<head>
    <title>Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="css-files/Login.css">
    <script src="javascript-files/Login.js"></script>
</head>

<body>
    <div class="heading"><h1>DK clothing!!</h1></div>
    <marquee id="move"><h4>Welcome to Dk Clothing!!!</h4></marquee>
    <div class="main">
        <header class="header">Login page</header>
        <form onsubmit="return validation()" action="/main" method="post">
            <div class="container">
                <div class="form-group">
                    <label>UserName</label>
                    <input type="text" class="form-control" id="text1" name="textbox1" />
                    <div class="text-danger">
                        <p id="error1"></p>
                    </div>
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="text" class="form-control" id="text2" name="textbox2" />
                    <div class="text-danger">
                        <p id="error2"></p>
                    </div>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary" id="btn">Login</button>
                </div>
                <a href="Register">Don't have an account?</a>
            </div>
        </form>
    </div>
</body>

</html>