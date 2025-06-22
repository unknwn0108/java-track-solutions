import java.util.Arrays;
import java.util.Comparator;

public class DemoSearch {

    // Linear Search by Product Name
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search by Product Name
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "T-shirt", "Clothing"),
                new Product(103, "Book", "Stationery"),
                new Product(104, "Phone", "Electronics")
        };

        // Linear Search Example
        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, "Book");
        System.out.println(result1);

        // Binary Search requires sorted array
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        System.out.println("\nBinary Search Result:");
        Product result2 = binarySearch(products, "Book");
        System.out.println(result2);
    }
}
