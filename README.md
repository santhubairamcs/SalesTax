PROBLEM ONE : SALES TAXES
==========================

Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt.
Import duty is an additional sales tax applicable on all imported goods at a rate of 5%, with no exemptions.
When I purchase items I receive a receipt which lists the name of all the items and their price (including tax), 
finishing with the total cost of the items, and the total amounts of sales taxes paid.
The rounding rules for sales tax are that for a tax rate of n%, a shelf price of p contains (np/100 rounded up 
to the nearest 0.05) amount of sales tax.Write an application that prints out the receipt details for these shopping baskets.


Requirements
=============
The requirements of this application are:

[1] JDK 7.0

[2] IntelliJ IDEA

[3] Ant

[4] JUnit 4.11

[5] Hamcrest Core 1.3


INPUT
=======
1 book at 12.49
1 music CD at 14.99
1 chocolate bar at 0.85

OUTPUT
========
1 book: 12.49
1 music CD: 16.49
1 chocolate bar: 0.85
Sales Taxes: 1.50
Total: 29.83


How to Run?
============

To run the application in your system, just open the application in IntelliJ IDEA,
then goto Run -> Run or you can press options+shift+F10

How to Build
=============

This application using the Ant Build System. You can change your build settings by changing
the **build.xml** present in the project directory. To build the application, just type following
command in your shell:

    $ ant run