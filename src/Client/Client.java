package Client;

import Definition.LinkedListDefinitionClass;

public class Client {
    private String firstName;
    private String lastName;
    private LinkedListDefinitionClass<Long> contactNo;
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public LinkedListDefinitionClass getContactNo() {
        return contactNo;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContactNo(LinkedListDefinitionClass<Long> contactNo) {
        this.contactNo = contactNo;
    }


}
