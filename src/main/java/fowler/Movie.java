package fowler;

class Movie {
    static final int CHILDRENS = 2;
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;

    Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }

    int getPriceCode() {
        return priceCode;
    }

    String getTitle() {
        return title;
    }

}