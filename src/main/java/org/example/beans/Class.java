package org.example.beans;

public class Class {
    private String className;
    private  String classId;

    public Class(String className, String classId) {
        this.className = className;
        this.classId = classId;
    }

    public Class() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Class{" +
                "className='" + className + '\'' +
                ", classId='" + classId + '\'' +
                '}';
    }
}
