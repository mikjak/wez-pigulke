<!DOCTYPE html>
<html>
<head>
    <title>Show countries</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>Drugs list</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Name</th>
            <th>Unit</th>
        </tr>
        </thead>
        <tbody>
        <#list drugs as  drug>
            <tr>
                <td>${drug.name}</td>
                <td>${drug.unit}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
