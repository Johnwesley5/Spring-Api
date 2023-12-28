package com.example.CloudVendor.Model;

public class CloudVendor {
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhn;
    public CloudVendor() {
    }
    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhn) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhn = vendorPhn;
    }
    public String getVendorId() {
        return vendorId;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public String getVendorAddress() {
        return vendorAddress;
    }
    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
    public String getVendorPhn() {
        return vendorPhn;
    }
    public void setVendorPhn(String vendorPhn) {
        this.vendorPhn = vendorPhn;
    }

    
}
