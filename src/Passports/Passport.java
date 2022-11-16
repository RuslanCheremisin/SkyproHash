package Passports;

import java.util.Objects;
import java.util.Random;

import ValidateUtil.ValidateUtil;

public class Passport {
    private int passportNo;
    private String name;
    private String patronymic;
    private String surname;
    private String birthDate;

    public Passport(int passportNo, String name, String patronymic, String surname, String birthDate) {
//        int min = 1000000000;
//        int max = Integer.MAX_VALUE;
//        Random random = new Random();
//        passportNo = random.nextInt(max-min)+min;
        if (passportNo >= 1000000000 && passportNo <= Integer.MAX_VALUE) {
            this.passportNo = passportNo;
        } else {
            throw new IllegalArgumentException("Wrong passport number format! Please use XXXXXXXXXX (10 digits)");
        }
        this.name = ValidateUtil.validateString(name);
        this.surname = ValidateUtil.validateString(surname);
        if (patronymic == null) {
            this.patronymic = null;
        } else if (!patronymic.isEmpty() && !patronymic.isBlank()) {
            this.patronymic = patronymic;
        } else {
            throw new IllegalArgumentException("Patronymic cannot be empty or blank! If non-existent, use null!");
        }
        this.birthDate = ValidateUtil.validateDateDDMMYYYY(birthDate);
    }


    public int getPassportNo() {
        return passportNo;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    void setName(String name) {
        this.name = ValidateUtil.validateString(name);
    }

    void setPatronymic(String patronymic) {
        if (!patronymic.isEmpty() && !patronymic.isBlank()) {
            this.patronymic = patronymic;
        } else {
            throw new IllegalArgumentException("Patronymic cannot be empty or blank! If non-existent, use null!");
        }
    }

    void setSurname(String surname) {
        this.surname = ValidateUtil.validateString(surname);
    }

    void setBirthDate(String birthDate) {
        this.birthDate = ValidateUtil.validateDateDDMMYYYY(birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNo, name, patronymic, surname, birthDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Passport passport = (Passport) o;
        return Objects.equals(passport.name, name) &&
                Objects.equals(passport.patronymic, patronymic) &&
                Objects.equals(passport.surname, surname) &&
                Objects.equals(passport.birthDate, birthDate) &&
                passport.passportNo == passportNo;
    }
    @Override
    public String toString() {
        if (patronymic == null) {
            return name + " " + surname + " " + "\n" +
                    birthDate + "\n" +
                    "Passport No: " + passportNo;
        } else {
            return name + " " + patronymic + " " + surname + " " + "\n" +
                    "Date of birth: " + birthDate + "\n" +
                    "Passport No: " + passportNo;
        }
    }
}
