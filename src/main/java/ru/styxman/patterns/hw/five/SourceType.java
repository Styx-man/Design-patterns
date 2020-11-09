package ru.styxman.patterns.hw.five;

/**
 * SourceType.
 */
public enum SourceType {
    USB_STICK("USB-stick"),
    WI_FI("Wi-Fi");

    private final String description;

    SourceType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
