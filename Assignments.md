## Lab - 1
- Non graded and closed book - you can use class resources and textbook. 
### Programming Fundamentals:
#### Most of the programs from questions 1-7 can be written inside the main method or other static methods without having to use OOP concepts

1. Write a program to reverse the order of words in a sentence
> This question involves String concepts. 
- You can write a static method that takes a String and returns a String which is the words in reverse order of the parameter String. 
- Ask the user to input a sentence, send it to the static method, print the return value 
- Use your palindrome assignment for reference if needed

Sample Output: 
```
Enter a sentence and the words will be printed in reverse order:
The first program everyone writes is Hello World
Sentence reversed: World Hello is writes everyone program first The 
```

2. Write a program to ask the user to enter a year and tell them if it's a leap year or not
- A leap year is divisible by 4 but not divisible by 100, OR it is divisible by 400
- HINT: % operator can be used to check if a number is divisible by another number. If the number is divisible % will be equal to 0
>This question involves logical operators and boolean variable
Sample output 1:
```
Enter a year: 
1991
The year you entered is not a leap year
```
Sample output 2:
```
Enter a year: 
2012
The year you entered is a leap year
```

3. Write a program that declares and initializes a counter to 0. Run a forever **while loop**, increment counter by 1 with every iteration. break the loop when counter is 5. continue the loop without printing the number when counter is 3. Print the counter for all other values.
>This question involves while loop, break and continue statements

Expected output:
```
1
2
4
```

4. Write a program to initialize an array of 5 float numbers. Loop through the array using a **for loop** and print each number.
>This question involves array (which can hold primitive and is of fixed size) and for loops 

Sample output:

```
2.5
4.8
9.07
12.55
55.7
```

5. Write a program to ask the user for a decimal number, and print the floor, ceil, round of that number
>This question involves java.lang.Math class

Sample Output 1:
```
Enter a decimal number:
2.85
The ceil value of the number is 3.0
The floor value of the number is 2.0
The number rounded to its nearest integer is 3
```

Sample Output 2:
```
Enter a decimal number:
1.25
The ceil value of the number is 2.0
The floor value of the number is 1.0
The number rounded to its nearest integer is 1
```

6. Write a program to ask the user for states they have visited in the US. Ignore case by converting their input to lower case. **Ignore** duplicate inputs. Order of input doesn't matter. The program runs forever until the user types "done". When the user types "done", display the unique list of cities back to the user.
>Use one of the collection framework classes

Sample Output:
Enter the states you have visited one at a time.
State name: 
NEW JERSEY
State name: 
NEW YORK
State name: 
new YORK
State name: 
Arizona
State name: 
Washington
State name: 
WASHINGTON
State name: 
new jersey
State name: 
MaInE
State name: 
maine
State name: 
done
[maine, arizona, new jersey, washington, new york]```

```

7. Write a program that asks user for 2 integers and print the divison of the 2 integers. Handle ArithmeticException and print its stacktrace. Handle all other RuntimeException and print its message. Irrespective of whether an exception ocurred or not, print a "Thank you" message. 

Sample Output:

8. Write a program that counts the occurances of each word in a text file (the_prince_quotes.txt in the same repository). Make it case-insensitive by coverting each word to lower case before counting
>Involves text file reading, using String's .split() method, using HashMap to store the word to count mapping

Sample Output:


### OOP Concepts:
#### The question would involve following basic OOP principles and coding principles like single-responsibility, DRY and YAGNI principles. Each entity will be created in it's own class. main method will be in a seperate class and that'll be the one interacting with the user.

9. Create a Song class with the following attributes

* title
* duration

Create a PlayList class which has instance attributes
* name
* ArrayList of Songs called playList
* Methods:
* Print all songs in the playlist
* Find song by name : findSong(String song) returns true if the song name is present in the playList

Create a Main class with the main method
* Create an object of PlayList, give it a name and an empty arraylist to begin with
* Create some Song objects and add it to object's playList
* Print all the songs in the playlist
* Find a song in the playlist

Write the playlist object to an object file.




