package Task1;

public enum ProductType {
    FOOD {
        public String toString (){
            return "продукти харчування";}
    },
    DRINK {
        public String toString (){
            return "напої";}
    },
    ELECTRONICS {
        public String toString (){
            return "побутова техніка";}
    }
}


//
//    /*String productTypeName;
//    ProductType(String s) {
//        this.productTypeName = s;
//*/

