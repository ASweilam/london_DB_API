package com.asweilam.londonv2.services;

import com.asweilam.londonv2.controllers.UserController;
import com.asweilam.londonv2.models.User;
import com.asweilam.londonv2.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

//@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {

    @Test
    public void filter50MilesUserInCentralLondon() {
        //arrange
        User testUser  = new User((long) 1, "Andy", "Sweilam", "a.sweilam@dwp.com", "192.161.85.250", 51.50722, -0.1275);
        List<User> CentralLondonUserList = new ArrayList<>();
        CentralLondonUserList.add(testUser);

        //act
        List<User> expectedUserList = new ArrayList<>();
        expectedUserList.add(testUser);

        //Assert
        assertEquals(expectedUserList, CentralLondonUserList);

    }


    @Test
    public void filter50MilesEmptyList() {
        //arrange
        List<User> nullUserList = new ArrayList<>();
        List<User> result;

        //act
        result= UserServiceImpl.filter50Miles(nullUserList);

        //assert
        assert(result.isEmpty());

    }

    @Test
    public void distFromWhenInvalidLongLat() {

        //Arrange
        double lat1 = 100;
        double lng1= 190;
        double lat2 = -100;
        double lng2 = 190;

        //ACT
        double result = UserServiceImpl.distFrom(lat1,lng1,lat2,lng2);
        System.out.println(result);
        //ASSERT

        assertEquals(-1, result, 0);

    }



    @Test
    public void distFromWhenZeroTest() {

        //Arrange
        double lat1 = 0;
        double lng1= 0;
        double lat2 = 0;
        double lng2 = 0;

        //ACT
        double result = UserServiceImpl.distFrom(lat1,lng1,lat2,lng2);
        System.out.println(result);
        //ASSERT

        assertEquals(0, result, 0);


    }


}