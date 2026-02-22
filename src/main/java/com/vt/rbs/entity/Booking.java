package com.vt.rbs.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@Table(name = "bookings")
public class Booking extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "resource_id", nullable = false)
    private Resource resource;


    private LocalDate startTime;
    private LocalDate endTime;

    @Enumerated(EnumType.STRING)
    private ResourceStatus status;

    private String reason;

    @ManyToOne
    @JoinColumn(name = "approved_By")
    private User approveBy;
}
