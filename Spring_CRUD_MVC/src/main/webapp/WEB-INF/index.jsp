<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, Helvetica, sans-serif;
        background: linear-gradient(135deg, #667eea, #764ba2);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        background: white;
        padding: 40px;
        border-radius: 15px;
        box-shadow: 0 15px 30px rgba(0,0,0,0.2);
        text-align: center;
        width: 400px;
    }

    h1 {
        color: #333;
        margin-bottom: 20px;
    }

    p {
        color: #666;
        margin-bottom: 30px;
    }

    .btn {
        display: inline-block;
        padding: 12px 25px;
        background: #667eea;
        color: white;
        text-decoration: none;
        border-radius: 25px;
        font-size: 16px;
        transition: 0.3s;
    }

    .btn:hover {
        background: #764ba2;
        transform: scale(1.05);
    }
</style>

</head>
<body>

<div class="container">
    <h1>🚀 Welcome to Project</h1>
    <p>Click below to explore more</p>
    <a href="home" class="btn">Go To Homepage</a>
</div>

</body>
</html>