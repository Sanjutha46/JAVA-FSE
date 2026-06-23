# Exercise 2 - Implementing Dependency Injection

## Objective
Implement Dependency Injection using Spring IoC Container.

## Concepts Used
- Spring IoC
- Dependency Injection
- Setter Injection
- XML Bean Configuration

## Beans
- BookRepository
- BookService

## Dependency Injection

BookRepository is injected into BookService using:

```java
setBookRepository(BookRepository bookRepository)
