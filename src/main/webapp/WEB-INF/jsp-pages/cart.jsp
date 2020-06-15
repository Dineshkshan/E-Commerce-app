<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html>
<head> 
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="javascript-files/jquery-3.5.1.js"></script>   
</head>
<body>
    <h1 style="color: red;text-align: center;">Your orders are!!!</h1>
    <div class="container">
    <table class="table table-bordered">
        <thead>
          <tr>
            <th>S.NO</th>
            <th>Customer Name</th>
            <th>Orders</th>
            <th>Status</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach var="detail" items="${list }"> 
          <tr>
          <td>${detail.getCustomer_No()}</td>
            <td>${detail.getUserName()}</td>
            <td>${detail.getOrderDetails() }</td>
            <td>On the way..</td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
</body>
</html>