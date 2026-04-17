<!DOCTYPE html>
<html>
<head>
    <title>Login - Smart Clinic</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #ecf0f1; }
        .container { width: 400px; margin: 50px auto; padding: 20px; background-color: #fff; border-radius: 10px; box-shadow: 0 0 10px #aaa; }
        h2 { text-align: center; color: #2980b9; }
        label { display: block; margin-top: 10px; }
        input { width: 100%; padding: 8px; margin-top: 5px; border-radius: 5px; border: 1px solid #ccc; }
        button { margin-top: 15px; width: 100%; padding: 10px; background-color: #27ae60; color: #fff; border: none; border-radius: 5px; cursor: pointer; }
        button:hover { background-color: #2ecc71; }
        .signup-link { text-align: center; margin-top: 15px; }
        .signup-link a { color: #2980b9; text-decoration: none; }
        .error { color: red; text-align: center; margin-top: 10px; }
    </style>
</head>
<body>
<div class="container">
    <h2>Login</h2>

    <!-- Error Message -->
    <c:if test="${param.error != null}">
        <div class="error">Invalid username or password!</div>
    </c:if>

    <form action="/login" method="post">
        <label>email</label>
        <input type="email" name="email" required/>

        <label>Password</label>
        <input type="password" name="password" required/>

        <button type="submit">Login</button>
    </form>

    <div class="signup-link">
        Don't have an account? <a href="signup">Create Account</a>
    </div>
</div>
</body>
</html>