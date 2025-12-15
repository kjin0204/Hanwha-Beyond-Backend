package com.ohgiraffers.section01.list.DTO;

import java.util.Objects;

public class BookDTO implements Comparable<BookDTO>{
    private int number;
    private String title;
    private String author;
    private int price;


    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public BookDTO() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return price == bookDTO.price && Objects.equals(title, bookDTO.title) && Objects.equals(author, bookDTO.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash( title, author, price);
    }

    @Override
    public int compareTo(BookDTO o) {
        /* 필기. int형 */
        /* 필기. 오름차순 정렬 */
//        int result = this.price - o.price;
//        return result;

        /* 필기. 내림 차순 */
//        return -(this.price - o.price);

        //------------------------------------------------------------
        /* 필기. String */
        /* 필기. 오름차순 정렬 */
//        return this.title.compareTo(o.title); //String에 정의 된 오름차순 CompareTo() 메소드를 활용

        /* 필기. 내림차순 정렬 (부호를 바꿔 주거나 메소드 호출시 두개 객체의 위치를 바꿔 주면 됨*/
//        return -this.title.compareTo(o.title);
        return o.title.compareTo(this.title);

    }
}
