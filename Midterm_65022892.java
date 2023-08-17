class Product {
    String productName;
    double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }
}

class Television extends Product {
    String brand;
    String model;

    public Television(String productName, double productPrice, String brand, String model) {
        super(productName, productPrice);
        this.brand = brand;
        this.model = model;
    }

    public void display() {
        super.display();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class IPhone extends Television {
    String operatingSystem;

    public IPhone(String productName, double productPrice, String brand, String model, String operatingSystem) {
        super(productName, productPrice, brand, model);
        this.operatingSystem = operatingSystem;
    }

    public void display() {
        super.display();
        System.out.println("Operating System: " + operatingSystem);
    }
}

class Book extends Product {
    String author;
    int numberOfPages;

    public Book(String productName, double productPrice, String author, int numberOfPages) {
        super(productName, productPrice);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public void display() {
        super.display();
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
    }
}

public class Midterm_65022892 {
    public static void main(String[] args) {
        Product chair = new Product("chair", 500.0);
        chair.display();
        System.out.println("************************");

        Television television = new Television("Television", 20000.0, "Samsung", "Neo QLED");
        television.display();
        System.out.println("************************");

        IPhone iphone = new IPhone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        iphone.display();
        System.out.println("************************");

        Book oopProgramming = new Book("OOP Programming", 250.0, "John Doe", 300);
        oopProgramming.display();
    }
}