package com.example.CloudVendor.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CloudVendor.Model.CloudVendor;

@RestController
@RequestMapping("/vendorDetails")
public class CloudVendorController {
    @GetMapping("{vendorId}")
    public CloudVendor getVendorDetails(String vendorId){
        return new CloudVendor("C1","Name-1","Address-1","xxx1");
    }
}
