<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Xworkz</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h1 class="text-center text-primary">This is Merging Page using JSP</h1>
        <h2 class="text-center">
            <span class="text-success">${success}</span>
            <span class="text-danger">${failure}</span>
        </h2>
        <form action="merge" method="post" class="mt-4 p-4 border border-secondary rounded bg-white shadow">
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="age">Age</label>
                <input type="number" class="form-control" id="age" name="age" required>
            </div>
            <div class="form-group">
                <label for="city">City</label>
                <input type="text" class="form-control" id="city" name="city" required>
            </div>
            <div class="form-group">
                <label for="state">State</label>
                <input type="text" class="form-control" id="state" name="state" required>
            </div>
            <div class="form-group">
                <label for="country">Country</label>
                <input type="text" class="form-control" id="country" name="country" required>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Merge</button>
        </form>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
