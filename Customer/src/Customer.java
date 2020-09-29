public class Customer {

    private int id;
    private String fullName;//surname, name, patronymic;
    private String address;
    private int CardNumber;
    private int bankAccountNumber;

    public Customer(){
        this.id = 0;
        this.fullName = "Ivanov Ivan Ivanovich";
        this.address = "Belarus, Vitebsk";
        this.CardNumber = 1111;
        this.bankAccountNumber = 0;
    }

    public Customer(int id, String fullName, String address, int CardNumber, int bankAccountNumber){
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.CardNumber = CardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getCardNumber(){
        return CardNumber;
    }

    public void setCardNumber(int CardNumber){
        this.CardNumber = CardNumber;
    }

    public int getBankAccountNumber(){
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber){
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + bankAccountNumber;
        result = prime * result + CardNumber;
        result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if(o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Customer other = (Customer) o;
        if (address == null){
            if(other.address != null)
                return false;
        }else if(!address.equals(other.address))
            return false;
        if (bankAccountNumber != other.bankAccountNumber)
            return false;
        if(CardNumber != other.CardNumber)
            return false;
        if(fullName == null){
            if(other.fullName != null)
                return false;
        }else if(!fullName.equals(other.fullName))
            return false;
        if(id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString(){
        return "Customer [id - " + id + "; fullName - " + fullName + "; address - " + address + "; CreditCardNumber - " + CardNumber
        + "; bankAccountNumber - " + bankAccountNumber + "]";
    }



}
