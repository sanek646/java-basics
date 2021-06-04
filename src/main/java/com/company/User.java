package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {
    public class PersonJAVABean implements java.io.Serializable{
       // private static final long serialVersionUID= 1l;
        private int id;
        private int companyId;
        private String fistName;
        private String lastName;
        private String role;


        public int getId() {
            return id;
        }
        public void setId(int Id) {
            this.id = Id;}

        public String getFistName() {
            return fistName;
        }
        public void setfistName(String fistName) {
            this.fistName = fistName; }

            public String getlastName() {
                return lastName;
            }
            public void setLastName(String lastName) {
                this.lastName = lastName;}

        public int getCompanyId() {
            return companyId;
        }
        public void setCompanyId(int companyId) {
            this.companyId = companyId;}

        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;}



    }
    public static void main(String[] arg){
        ArrayList userId = new ArrayList();
        userId.add(user1);
        userId.add(user2);
        userId.add(user3);
        userId.add(user4);
        userId.add(user5);
    }
}
