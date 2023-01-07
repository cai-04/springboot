package nuc.edu.cai4.springmvc.entity;


import lombok.Data;
@Data
public class Book {
    private Integer b_id;
    private String b_name;
    private float b_price;

    public Book() {}

    public Book(Integer b_id, String b_name, float b_price) {
        this.b_id = b_id;
        this.b_name = b_name;
        this.b_price = b_price;
    }
}
