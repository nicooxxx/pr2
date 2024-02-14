package de.bht.pr2.lab01;

public class Student {

    //-------------------------------------------
    // Attribute
    private String name = "";

    // Matrikelnummer
    private int registrationNumber = 0;

    // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
    private String courseOfStudies = "";

    // Rückmeldegebühr
    public static final int TUITION_FEE = 312;

    /**
     * This contructor parses a comma-separated row describing a student object.
     *
     * @param dataRow a comma-separated row describing a student object
     */
    public Student(String dataRow) throws RegistrationNumberException, StudentParseException, WrongCourseOfStudiesException, NotPaidTuitionFeeException {
        // TODO: Here goes your code ...
        String[] dataSplit = dataRow.split(",");

        if (dataSplit.length != 4) {
            throw new StudentParseException("TOO SHORT");
        }

        name = dataSplit[0];

        try {
            registrationNumber = Integer.parseInt(dataSplit[1]);
        } catch (NumberFormatException e) {
            throw new RegistrationNumberException("Not a valid registration number in data: '" + dataRow + "'.");
        }

        courseOfStudies = dataSplit[2];
        if (courseOfStudies.equals("Musik und Tanz") || courseOfStudies.equals("Technische Informatik") || courseOfStudies.equals("Druck- und Medientechnik") || courseOfStudies.equals("Screen Based Media")) {
            throw new WrongCourseOfStudiesException("Wrong Course " + dataSplit[2]);
        }

        int paidTution = -1;

        paidTution = Integer.parseInt(dataSplit[3]);
        if (paidTution != TUITION_FEE) {
            throw new NotPaidTuitionFeeException("Not enough Paid! " + (TUITION_FEE - paidTution) + " is left.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCourseOfStudies() {
        return courseOfStudies;
    }

    public void setCourseOfStudies(String courseOfStudies) {
        this.courseOfStudies = courseOfStudies;
    }

    @Override
    public String toString() {
        return "Student [" +
                "name='" + name +
                ", registrationNumber=" + registrationNumber +
                ", courseOfStudies='" + courseOfStudies +
                ']';
    }
}

