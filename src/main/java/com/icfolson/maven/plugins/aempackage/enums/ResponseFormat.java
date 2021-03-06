package com.icfolson.maven.plugins.aempackage.enums;

public enum ResponseFormat {
    JSON(".json"),
    HTML(".html");

    private String extension;

    ResponseFormat(final String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}
