1. Write an HQL query to retrieve all books published after the year 2010.
```
SELECT b FROM Book b WHERE b.publishYear > 2010
``` 

2. Write an HQL update query to increase the price of all books published by a specific
author by 10%.
```
UPDATE Book SET price = price * 1.1 WHERE author = :author
``` 

3. Implement a method to delete an author and cascade the deletion to all associated books
using appropriate cascade options.
```
@OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
private List<Book> books;
``` 

4. Write an HQL query to find the average price of all books.
```
SELECT AVG(b.price) FROM Book b
``` 

5. Write an HQL query to retrieve all authors along with the count of books they have written.
```
SELECT a, COUNT(b) FROM Author a JOIN a.books b GROUP BY a
``` 

6. Write an HQL query using named parameters to retrieve books written by authors from a
specific country.
```
SELECT b FROM Book b JOIN b.author a WHERE a.country = :country
``` 

7. Define bidirectional one-to-many relationship between Author and Book entities using
@JoinColumn annotation.
```
In the Author entity:
@OneToMany(mappedBy = "author")
private List<Book> books;
``` 


```
In the Book entity:
@ManyToOne
@JoinColumn(name = "author_id")
private Author author;
``` 


10. Write an HQL query to find authors who have written more than the average number of
books.

``` SELECT a FROM Author a 
WHERE (SELECT COUNT(b) FROM a.books b) > (SELECT AVG(COUNT(b)) FROM Author a JOIN a.books b GROUP BY a)
GROUP BY a
```

