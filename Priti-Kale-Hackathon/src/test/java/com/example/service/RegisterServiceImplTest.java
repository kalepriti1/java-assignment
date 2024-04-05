package com.example.service;

import com.example.entity.Register;
import com.example.exception.AccountAlreadyExistsException;
import com.example.repository.RegisterRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RegisterServiceImplTest {
    @Mock
    RegisterRepository registerRepository;

    @InjectMocks
    RegisterServiceImpl registerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRegisterUser_Success() {
        Register register = new Register();
        register.setEmailId("test@example.com");
        register.setName("John Doe");
        register.setMobileNo("1234567890");
        register.setPassword("Password@123");

        when(registerRepository.existsByEmailId("test@example.com")).thenReturn(false);

        String result = registerService.registerUser(register);

        assertEquals("Account registered successfully", result);
        verify(registerRepository, times(1)).save(register);
    }

    @Test
    void testRegisterUser_AccountAlreadyExistsException() {
        Register register = new Register();
        register.setEmailId("test@example.com");

        when(registerRepository.existsByEmailId("test@example.com")).thenReturn(true);

        assertThrows(AccountAlreadyExistsException.class, () -> registerService.registerUser(register));
//        verify(registerRepository, never()).save(any());
    }

    @Test
    void testValidateTheUserDetails_ValidDetails() {
        Register register = new Register();
        register.setEmailId("test@example.com");
        register.setName("John Doe");
        register.setMobileNo("1234567890");
        register.setPassword("Password@123");

        assertTrue(registerService.validateUserDetails(register));
    }

}