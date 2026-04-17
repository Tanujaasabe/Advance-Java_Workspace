<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Panda Login</title>

<style>
body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background: linear-gradient(135deg, #667eea, #764ba2);
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

/* Card */
.container {
    background: #fff;
    padding: 40px;
    border-radius: 20px;
    width: 350px;
    text-align: center;
    box-shadow: 0 15px 35px rgba(0,0,0,0.2);
    position: relative;
}

/* Panda */
.panda {
    position: relative;
    width: 150px;
    height: 140px;
    margin: 0 auto 20px;
}

/* Face */
.face {
    width: 120px;
    height: 120px;
    background: white;
    border-radius: 50%;
    border: 5px solid black;
    margin: auto;
    position: relative;
}

/* Eyes */
.eye {
    width: 25px;
    height: 30px;
    background: black;
    border-radius: 50%;
    position: absolute;
    top: 35px;
}

.eye.left { left: 25px; }
.eye.right { right: 25px; }

/* Hands */
.hand {
    width: 40px;
    height: 60px;
    background: black;
    position: absolute;
    top: 40px;
    border-radius: 20px;
    transition: 0.4s;
}

.hand.left { left: -20px; }
.hand.right { right: -20px; }

/* Cover eyes */
.cover .hand.left {
    left: 25px;
    top: 35px;
}

.cover .hand.right {
    right: 25px;
    top: 35px;
}

/* Inputs */
input {
    width: 100%;
    padding: 12px;
    margin: 10px 0;
    border-radius: 25px;
    border: 1px solid #ccc;
    outline: none;
    font-size: 14px;
}

input:focus {
    border-color: #667eea;
}

/* Button */
button {
    width: 100%;
    padding: 12px;
    border-radius: 25px;
    border: none;
    background: #667eea;
    color: white;
    font-size: 16px;
    cursor: pointer;
    transition: 0.3s;
}

button:hover {
    background: #764ba2;
    transform: scale(1.05);
}
</style>

</head>
<body>

<div class="container">

    <div class="panda" id="panda">
        <div class="face">
            <div class="eye left"></div>
            <div class="eye right"></div>
        </div>
        <div class="hand left"></div>
        <div class="hand right"></div>
    </div>

    <h2>Login Here</h2>

    <form action="login" method="post">
        <!-- Simple Name Field -->
        <input type="text" name="name" placeholder="Enter Name" required>

        <!-- Password Field -->
        <input type="password" name="password" 
               placeholder="Enter Password"
               required
               onfocus="coverEyes()"
               onblur="openEyes()">

        <button type="submit">Login</button>
    </form>

</div>

<script>
function coverEyes() {
    document.getElementById("panda").classList.add("cover");
}

function openEyes() {
    document.getElementById("panda").classList.remove("cover");
}
</script>

</body>
</html>