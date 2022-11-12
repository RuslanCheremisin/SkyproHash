package Passports;

import java.util.HashSet;
import java.util.Set;

public class PassportRecords {
    private Set<Passport> passports = new HashSet<>();


    public void addPassport(Passport passport) {
        if (passports.size()==0){
            passports.add(passport);
        }else{
            for (Passport p : passports) {
                if (p.getPassportNo() == passport.getPassportNo()) {
                    p.setName(passport.getName());
                    p.setPatronymic(passport.getPatronymic());
                    p.setSurname(passport.getSurname());
                    p.setBirthDate(passport.getBirthDate());
                }else{
                    passports.add(passport);
                }
            }

        }
    }

    public Passport getPassportByNumber(int passportNo) {
        Passport passport = null;
        for (Passport p : passports) {
            if (p.getPassportNo() == passportNo) {
                passport = p;
            }
        }
        return passport;

    }

    public void printPassportDataFromRecords(Passport passport) {
        for (Passport p : passports) {
            if (passport.equals(p)) {
                System.out.println(p);
                System.out.println("-------------------------");
            }
        }
    }
    public void printAllPassportsData(){
        for(Passport p:passports){
            System.out.println(p);
            System.out.println("-------------");
        }
    }

}
