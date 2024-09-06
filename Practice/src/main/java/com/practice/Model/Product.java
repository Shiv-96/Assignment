package com.practice.Model;

public class Product {
    private Integer id;
    private String title;
    private String image;
    private Integer price;
    private String description;
    private String category;
    private Rating rating;

    
    public Product() {
    }


    

    public Product(Integer id, String title, String image, Integer price, String description, String category,
            Rating rating) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
        this.description = description;
        this.category = category;
        this.rating = rating;
    }



    public Integer getId() {
        return id;
    }




    public void setId(Integer id) {
        this.id = id;
    }




    public String getTitle() {
        return title;
    }




    public void setTitle(String title) {
        this.title = title;
    }




    public String getImage() {
        return image;
    }




    public void setImage(String image) {
        this.image = image;
    }




    public Integer getPrice() {
        return price;
    }




    public void setPrice(Integer price) {
        this.price = price;
    }




    public String getDescription() {
        return description;
    }




    public void setDescription(String description) {
        this.description = description;
    }




    public String getCategory() {
        return category;
    }




    public void setCategory(String category) {
        this.category = category;
    }




    public Rating getRating() {
        return rating;
    }




    public void setRating(Rating rating) {
        this.rating = rating;
    }




    public static class Rating {

        private Integer rate;
        private Integer count;

        public Rating(Integer rate, Integer count) {
            this.rate = rate;
            this.count = count;
        }

        public Rating() {
        }

        public Integer getRate() {
            return rate;
        }

        public void setRate(Integer rate) {
            this.rate = rate;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

    }

}
