//package com.example.javaservlets;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class FormServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//
//        // Get form data
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//
//        try {
//            // Load the JDBC driver
//            Class.forName("com.mysql.jdbc.Driver");
//
//            // Open a connection
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "yourpassword");
//
//            // Prepare the SQL statement
//            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setString(1, name);
//            statement.setString(2, email);
//
//            // Execute the SQL statement
//            int rowsInserted = statement.executeUpdate();
//
//            if (rowsInserted > 0) {
//                out.println("<h3>Data inserted successfully!</h3>");
//            } else {
//                out.println("<h3>Failed to insert data.</h3>");
//            }
//
//            // Clean up resources
//            statement.close();
//            conn.close();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            out.println("<h3>Error: " + e.getMessage() + "</h3>");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            out.println("<h3>Error: " + e.getMessage() + "</h3>");
//        } finally {
//            out.close();
//        }
//    }
//}
