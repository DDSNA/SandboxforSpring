package com.example.sandboxforspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class CarsController {
    @Autowired CarsRepository carsRepository;

}
