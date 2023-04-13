<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>Lesson-18</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script
            src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/css/success.css">
</head>
<body>

<c:choose>
    <c:when test="${mode == 'S_SUCCESS'}">
        <div id='card' class="animated fadeIn">
            <div id='upper-side'> <?xml version="1.0" encoding="utf-8"?>
                <!-- Generator: Adobe Illustrator 17.1.0, SVG Export Plug-In . SVG Version: 6.00 Build 0) --> <!DOCTYPE
                PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
                <svg version="1.1" id="checkmark" xmlns="http://www.w3.org/2000/svg"
                     xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" xml:space="preserve"> <path
                        d="M131.583,92.152l-0.026-0.041c-0.713-1.118-2.197-1.447-3.316-0.734l-31.782,20.257l-4.74-12.65 c-0.483-1.29-1.882-1.958-3.124-1.493l-0.045,0.017c-1.242,0.465-1.857,1.888-1.374,3.178l5.763,15.382 c0.131,0.351,0.334,0.65,0.579,0.898c0.028,0.029,0.06,0.052,0.089,0.08c0.08,0.073,0.159,0.147,0.246,0.209 c0.071,0.051,0.147,0.091,0.222,0.133c0.058,0.033,0.115,0.069,0.175,0.097c0.081,0.037,0.165,0.063,0.249,0.091 c0.065,0.022,0.128,0.047,0.195,0.063c0.079,0.019,0.159,0.026,0.239,0.037c0.074,0.01,0.147,0.024,0.221,0.027 c0.097,0.004,0.194-0.006,0.292-0.014c0.055-0.005,0.109-0.003,0.163-0.012c0.323-0.048,0.641-0.16,0.933-0.346l34.305-21.865 C131.967,94.755,132.296,93.271,131.583,92.152z"/>
                    <circle fill="none" stroke="#ffffff" stroke-width="5" stroke-miterlimit="10" cx="109.486"
                            cy="104.353" r="32.53"/> </svg>
                <h3 id='status'> Success </h3></div>
            <div id='lower-side'><p id='message'> Congratulations, your account has been successfully created. </p> <a
                    href="/" id="contBtn">Continue</a></div>
        </div>
    </c:when>

    <c:when test="${mode == 'S_ERROR'}">
        <body>
        <div class="d-flex align-items-center justify-content-center vh-100">
            <div class="text-center">
                <h1 class="display-1 fw-bold">404</h1>
                <p class="fs-3"><span class="text-danger">Opps!</span> Something wrong </p>
                <p class="lead">
                    Please check that your email and password are correct. Then you will try again.
                </p>
                <a href="/" class="btn btn-primary">Go Home</a>
            </div>
        </div>
        </body>
    </c:when>

    <c:when test="${mode == 'S_REGISTRATION'}">
        <c:set var="s" value="${studentDto}"/>
        <div class="container">
            <div class="row centered-form">
                <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Please fill this form</h3>
                        </div>
                        <div class="panel-body">
                            <form role="form" action="save" method="post" enctype="multipart/form-data">
                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="text" name="firstName" value="${s.firstName}" id="first_name"
                                                   class="form-control input-sm" placeholder="First Name">
                                        </div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="text" name="lastName" value="${s.lastName}" id="last_name"
                                                   class="form-control input-sm" placeholder="Last Name">
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <input type="age" name="age" value="${s.age}" id="age" class="form-control input-sm"
                                           placeholder="Age">
                                </div>

                                <div class="form-group">
                                    <input type="email" name="email" value="${s.email}" id="email"
                                           class="form-control input-sm" placeholder="Email Address">
                                </div>

                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="password" name="password" value="${s.password}" id="password"
                                                   class="form-control input-sm" placeholder="Password">
                                        </div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="password" name="cPassword" value="${s.cPassword}"
                                                   id="password_confirmation" class="form-control input-sm"
                                                   placeholder="Confirm Password">
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">

                                    <input type="file" name="file" id="file" class="form-control input-sm customFileInput" />
                                </div>

                                <input type="submit" value="Register" class="btn btn-info btn-block" placeholder="Upload your photo">

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </c:when>

</c:choose>


</body>
</html>







