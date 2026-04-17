<!DOCTYPE html>
<html>
<head>
    <title>Sign Up - Smart Clinic</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #ecf0f1; }
        .container { width: 400px; margin: 50px auto; padding: 20px; background-color: #fff; border-radius: 10px; box-shadow: 0 0 10px #aaa; }
        h2 { text-align: center; color: #2980b9; }
        label { display: block; margin-top: 10px; }
        input, select { width: 100%; padding: 8px; margin-top: 5px; border-radius: 5px; border: 1px solid #ccc; }
        button { margin-top: 15px; width: 100%; padding: 10px; background-color: #27ae60; color: #fff; border: none; border-radius: 5px; cursor: pointer; }
        button:hover { background-color: #2ecc71; }
        .login-link { text-align: center; margin-top: 15px; }
        .login-link a { color: #2980b9; text-decoration: none; }
    </style>
</head>
<body>
<div class="container">
    <h2>Sign Up</h2>
    <form action="signup" method="post">
        <label>Username</label>
        <input type="text" name="username" required/>

        <label>Email</label>
        <input type="email" name="email" required/>

        <label>Phone</label>
        <input type="text" name="phone"/>

        <label>Password</label>
        <input type="password" name="password" required/>

        <label>Confirm Password</label>
        <input type="password" name="confirmPassword" required/>

        <label>Select Role</label>
        <select name="role" required>
            <option value="Patient">Patient</option>
            <option value="Doctor">Doctor</option>
        </select>

        <button type="submit">Create Account</button>
    </form>
    <div class="login-link">
        Already have an account? <a href="login">Login Here</a>
    </div>
</div>
</body>
</html>