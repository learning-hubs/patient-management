package com.suman.patientservice.dto;

import com.suman.patientservice.dto.validators.CreatePatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {
    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "date of birth is required")
    private String dateOfBirth;

    @NotBlank(groups = CreatePatientValidationGroup.class, message = "Registered date is required")
    private String registeredDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotBlank(message = "Date of birth is required") String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }
}

//Kafka Broker is a server that stores and delivers messages to Consumers. Inside Kafka broker we have Kafka topic
// Kafka broker manages all the topics and all the events.
//Kafka topic is categorised channel where messages are stored and exchanged. Topic holds certain events
// that match a certain category.
// event is a single piece of data or messsage that is stored on a topic and is sent from a producer.
// events are stored in a specific format such as JSON or protobuf
// Producer has some code that lives inside our microservices and is used to send messages/events to specific Kafka topic.
// Consumer also has some code inside our microservices that is used to read any message from Kafka topic
// 2 Kafka consumers means 2 differt microservices. As new microservices join they can easily subscribe
// to existing topic or produce messages to relevant/different topics.
// So any producer can send message to any topic & any consumer can consume messages from any topic.

