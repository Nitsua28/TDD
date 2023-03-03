package org.example;
public class Math {

    /**
     * Return the Greatest Common Factor between the two parameters
     * @param x - the first number for which to find the GCF
     * @param y - the second number for which to find the GCF
     * @return - the greatest common factor between x and y
     */
    public int GCF(int x, int y) {
        int i = 0;
        if (x > y) i = x;
        else i = y;

        for (i = i; i > 1; i--){
            if (x % i == 0 && y % i == 0){
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the area of a rectangle
     * @param length - the length of the rectangle
     * @param width - the width of the rectangle
     * @return the area of the rectangle
     */
    public int areaRectangle(int length, int width) {

        return length * width;
    }

    /**
     * Return the area of a triangle
     * @param base - the length of the base of the triangle
     * @param height - the height of the triangle
     * @return - the area of the triangle
     */
    public double areaTriangle(int base, int height) {

        return (base * height) / 2;
    }

    /**
     * Return the area of a circle
     * @param radius - the radius of the circle
     * @return - the area of the circle
     */
    public double areaCircle(int radius) {

        return 3.14159265359 * (radius * radius);
    }

    /**
     * Return the factorial of the number
     * @param number - the number for which to return the factorial
     * @return - the factorial of number
     */
    public int factorial(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i --) factorial *= i;
        return factorial;
    }




}
