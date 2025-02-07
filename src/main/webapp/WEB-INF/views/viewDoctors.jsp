<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DOCTOR DETAILS</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h2 {
            text-align: center;
        }
        .table-container {
            padding-left: 5%;
            padding-right:5%;
            margin: 0 auto;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #a0a0a0;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        .btn {
            padding: 10px 15px;
            font-size: 14px;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-align: center;
            text-decoration: none;
        }
        .edit-btn {
            background-color: #007bff;
        }
        .delete-btn {
            background-color: #dc3545;
        }
    </style>
</head>
<body>
    <%@ include file="adminHeader.jsp" %>

    <h2>DOCTOR DETAILS</h2>
    <br>
    <div class="table-container">
        <table id="doctorTable">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Specialization</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <!-- Data will be inserted here dynamically -->
            </tbody>
        </table>
    </div>

    <%@ include file="homefooter.jsp" %>

    <script>
        document.addEventListener("DOMContentLoaded", function () {
            fetch("/api/doctors")
                .then(response => response.json())
                .then(data => {
                    let tableBody = document.querySelector("#doctorTable tbody");
                    tableBody.innerHTML = ""; // Clear existing data
                    
                    data.forEach(doctor => {
                        let row = document.createElement("tr");
                        row.innerHTML = `
                            <td>${doctor.id}</td>
                            <td>${doctor.name}</td>
                            <td>${doctor.specialization}</td>
                            <td>${doctor.phone}</td>
                            <td>${doctor.email}</td>
                            <td>
                                <button class="btn edit-btn" onclick="editDoctor(${doctor.id})">Edit</button>
                                <button class="btn delete-btn" onclick="deleteDoctor(${doctor.id})">Delete</button>
                            </td>
                        `;
                        tableBody.appendChild(row);
                    });
                })
                .catch(error => console.error("Error fetching doctor data:", error));
        });

        function deleteDoctor(id) {
            if (confirm("Are you sure you want to delete this doctor?")) {
                fetch(`/api/doctors/${id}`, {
                    method: "DELETE",
                })
                .then(response => {
                    if (response.ok) {
                        alert("Doctor deleted successfully.");
                        location.reload(); // Refresh the page
                    } else {
                        throw new Error("Error deleting doctor.");
                    }
                })
                .catch(error => alert(error.message));
            }
        }

        function editDoctor(id) {
            window.location.href = `/editDoctor.jsp?id=${id}`;
        }
    </script>

</body>
</html>
