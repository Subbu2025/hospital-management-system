package com.example.servlet;

import com.example.HospitalManagementSystem;
import com.example.model.Patient;
import com.example.model.Doctor;
import com.example.model.Appointment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class HospitalServlet extends HttpServlet {
    private HospitalManagementSystem system = new HospitalManagementSystem();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "home";
        }

        switch (action) {
            case "addPatient":
                req.getRequestDispatcher("addPatient.jsp").forward(req, resp);
                break;
            case "addDoctor":
                req.getRequestDispatcher("addDoctor.jsp").forward(req, resp);
                break;
            case "addAppointment":
                req.getRequestDispatcher("addAppointment.jsp").forward(req, resp);
                break;
            case "viewPatients":
                req.setAttribute("patients", system.getPatients());
                req.getRequestDispatcher("viewPatients.jsp").forward(req, resp);
                break;
            case "viewDoctors":
                req.setAttribute("doctors", system.getDoctors());
                req.getRequestDispatcher("viewDoctors.jsp").forward(req, resp);
                break;
            case "viewAppointments":
                req.setAttribute("appointments", system.getAppointments());
                req.getRequestDispatcher("viewAppointments.jsp").forward(req, resp);
                break;
            default:
                req.getRequestDispatcher("index.jsp").forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "home";
        }

        switch (action) {
            case "addPatient":
                String patientId = req.getParameter("id");
                String patientName = req.getParameter("name");
                int patientAge = Integer.parseInt(req.getParameter("age"));
                system.addPatient(new Patient(patientId, patientName, patientAge));
                break;
            case "addDoctor":
                String doctorId = req.getParameter("id");
                String doctorName = req.getParameter("name");
                String doctorSpecialization = req.getParameter("specialization");
                system.addDoctor(new Doctor(doctorId, doctorName, doctorSpecialization));
                break;
            case "addAppointment":
                String appointmentId = req.getParameter("id");
                String appointmentPatientId = req.getParameter("patientId");
                String appointmentDoctorId = req.getParameter("doctorId");
                String appointmentDate = req.getParameter("date");
                system.addAppointment(new Appointment(appointmentId, appointmentPatientId, appointmentDoctorId, appointmentDate));
                break;
        }

        resp.sendRedirect(req.getContextPath() + "/?action=" + action);
    }
}

