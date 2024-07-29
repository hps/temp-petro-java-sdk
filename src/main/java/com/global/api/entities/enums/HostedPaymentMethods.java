package com.global.api.entities.enums;

public enum HostedPaymentMethods implements IStringConstant{
    OB("ob"),
    CARDS("cards");

    String value;
    HostedPaymentMethods(String value) { this.value = value; }

    @Override
    public byte[] getBytes() { return value.getBytes(); }

    @Override
    public String getValue() { return value; }
}