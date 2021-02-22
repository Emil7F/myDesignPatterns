package pl.emil7f.builder;

public class Address {
    private String street;
    private Integer numOfBlock;
    private Integer numOfFlat;

    public Address(String street, Integer numOfBlock, Integer numOfFlat) {
        this.street = street;
        this.numOfBlock = numOfBlock;
        this.numOfFlat = numOfFlat;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumOfBlock() {
        return numOfBlock;
    }

    public void setNumOfBlock(Integer numOfBlock) {
        this.numOfBlock = numOfBlock;
    }

    public Integer getNumOfFlat() {
        return numOfFlat;
    }

    public void setNumOfFlat(Integer numOfFlat) {
        this.numOfFlat = numOfFlat;
    }
}
