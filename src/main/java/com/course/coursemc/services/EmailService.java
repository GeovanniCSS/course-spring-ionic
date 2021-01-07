package com.course.coursemc.services;

import org.springframework.mail.SimpleMailMessage;

import com.course.coursemc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
