package com.example.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.ecommerce.entities.User;
import com.example.ecommerce.repositories.UserRepository;
import com.example.ecommerce.services.exceptions.DatabaseException;
import com.example.ecommerce.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

}
