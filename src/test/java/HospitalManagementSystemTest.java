package com.example;

import com.example.model.Patient;
import com.example.model.Doctor;
import com.example.model.Appointment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HospitalManagementSystemTest {

    private HospitalManagementSystem hospitalManagementSystem;

    @BeforeEach
    void setUp() {
        hospitalManagementSystem = new HospitalManagementSystem();
    }

    @Test
    void testAddPatient() {
        Patient patient = new Patient("P001", "John Doe", 30);
        hospitalManagementSystem.addPatient(patient);

        List<Patient> patients = hospitalManagementSystem.getPatients();
        assertEquals(1, patients.size());
        assertEquals("John Doe", patients.get(0).getName());
    }

    @Test
    void testAddDoctor() {
        Doctor doctor = new Doctor("D001", "Dr. Smith", "Cardiology");
        hospitalManagementSystem.addDoctor(doctor);

        List<Doctor> doctors = hospitalManagementSystem.getDoctors();
        assertEquals(1, doctors.size());
        assertEquals("Dr. Smith", doctors.get(0).getName());
    }

    @Test
    void testAddAppointment() {
        Patient patient = new Patient("P001", "John Doe", 30);
        Doctor doctor = new Doctor("D001", "Dr. Smith", "Cardiology");
        hospitalManagementSystem.addPatient(patient);
        hospitalManagementSystem.addDoctor(doctor);

        Appointment appointment = new Appointment("A001", "P001", "D001", "2024-08-10");
        hospitalManagementSystem.addAppointment(appointment);

        List<Appointment> appointments = hospitalManagementSystem.getAppointments();
        assertEquals(1, appointments.size());
        assertEquals("P001", appointments.get(0).getPatientId());
        assertEquals("D001", appointments.get(0).getDoctorId());
    }

    @Test
    void testGetPatients() {
        Patient patient1 = new Patient("P001", "John Doe", 30);
        Patient patient2 = new Patient("P002", "Jane Roe", 25);
        hospitalManagementSystem.addPatient(patient1);
        hospitalManagementSystem.addPatient(patient2);

        List<Patient> patients = hospitalManagementSystem.getPatients();
        assertEquals(2, patients.size());
    }

    @Test
    void testGetDoctors() {
        Doctor doctor1 = new Doctor("D001", "Dr. Smith", "Cardiology");
        Doctor doctor2 = new Doctor("D002", "Dr. Jones", "Neurology");
        hospitalManagementSystem.addDoctor(doctor1);
        hospitalManagementSystem.addDoctor(doctor2);

        List<Doctor> doctors = hospitalManagementSystem.getDoctors();
        assertEquals(2, doctors.size());
    }

    @Test
    void testGetAppointments() {
        Patient patient = new Patient("P001", "John Doe", 30);
        Doctor doctor = new Doctor("D001", "Dr. Smith", "Cardiology");
        hospitalManagementSystem.addPatient(patient);
        hospitalManagementSystem.addDoctor(doctor);

        Appointment appointment1 = new Appointment("A001", "P001", "D001", "2024-08-10");
        Appointment appointment2 = new Appointment("A002", "P001", "D001", "2024-08-11");
        hospitalManagementSystem.addAppointment(appointment1);
        hospitalManagementSystem.addAppointment(appointment2);

        List<Appointment> appointments = hospitalManagementSystem.getAppointments();
        assertEquals(2, appointments.size());
    }
}
