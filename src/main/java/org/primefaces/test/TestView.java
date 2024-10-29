package org.primefaces.test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable
{

    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;
    private List<Album> albums;
    private List<Author> authors;

    @PostConstruct
    public void init()
    {
        string = "Welcome to PrimeFaces!!!";
        albums = new ArrayList<>( Arrays.asList(
                new Album( "Thriller", "Michael Jackson", 1982 ),
                new Album( "Back in Black", "AC/DC", 1980 ),
                new Album( "The Bodyguard", "Whitney Houston", 1992 ),
                new Album( "The Dark Side of the Moon", "Pink Floyd", 1973 ),
                new Album( "Bat Out of Hell", "Meat Loaf", 1977 ),
                new Album( "Their Greatest Hits (1971–1975)", "Eagles", 1976 ),
                new Album( "Saturday Night Fever", "Bee Gees", 1977 ),
                new Album( "Rumours", "Fleetwood Mac", 1977 ),
                new Album( "Come On Over", "Shania Twain", 1997 ),
                new Album( "Led Zeppelin IV", "Led Zeppelin", 1971 ),
                new Album( "Bad", "Michael Jackson", 1987 ),
                new Album( "Jagged Little Pill", "Alanis Morissette", 1995 ),
                new Album( "Appetite for Destruction", "Guns N' Roses", 1987 ),
                new Album( "Falling into You", "Celine Dion", 1996 ),
                new Album( "Hotel California", "Eagles", 1976 ),
                new Album( "1", "The Beatles", 2000 ),
                new Album( "Gold: Greatest Hits", "ABBA", 1992 ),
                new Album( "Brothers in Arms", "Dire Straits", 1985 ),
                new Album( "Abbey Road", "The Beatles", 1969 ),
                new Album( "Dangerous", "Michael Jackson", 1991 ),
                new Album( "Millennium", "Backstreet Boys", 1999 ),
                new Album( "Whitney", "Whitney Houston", 1987 ),
                new Album( "Supernatural", "Santana", 1999 ),
                new Album( "Spice", "Spice Girls", 1996 ),
                new Album( "The Wall", "Pink Floyd", 1979 ),
                new Album( "No Jacket Required", "Phil Collins", 1985 ),
                new Album( "Like a Virgin", "Madonna", 1984 ),
                new Album( "True Blue", "Madonna", 1986 ),
                new Album( "Born in the U.S.A.", "Bruce Springsteen", 1984 ),
                new Album( "Greatest Hits", "Queen", 1981 ),
                new Album( "The Immaculate Collection", "Madonna", 1990 ),
                new Album( "Bridge over Troubled Water", "Simon & Garfunkel", 1970 ),
                new Album( "A Night at the Opera", "Queen", 1975 ),
                new Album( "Tapestry", "Carole King", 1971 ),
                new Album( "Back to Black", "Amy Winehouse", 2006 ),
                new Album( "Fearless", "Taylor Swift", 2008 ),
                new Album( "Confessions", "Usher", 2004 ),
                new Album( "Please Hammer, Don't Hurt 'Em", "MC Hammer", 1990 ),
                new Album( "CrazySexyCool", "TLC", 1994 ),
                new Album( "The Eminem Show", "Eminem", 2002 ),
                new Album( "Oops!... I Did It Again", "Britney Spears", 2000 ),
                new Album( "21", "Adele", 2011 ),
                new Album( "The Marshall Mathers LP", "Eminem", 2000 ),
                new Album( "Let's Talk About Love", "Celine Dion", 1997 ),
                new Album( "Dookie", "Green Day", 1994 ),
                new Album( "Nevermind", "Nirvana", 1991 ),
                new Album( "Hybrid Theory", "Linkin Park", 2000 ),
                new Album( "X&Y", "Coldplay", 2005 ),
                new Album( "1989", "Taylor Swift", 2014 ),
                new Album( "Goodbye Yellow Brick Road", "Elton John", 1973 ),
                new Album( "Music Box", "Mariah Carey", 1993 ),
                new Album( "Enya", "A Day Without Rain", 2000 )
        ) );

        authors = new ArrayList<>( Arrays.asList(
                new Author( "William Shakespeare", "English", 1564 ),
                new Author( "Leo Tolstoy", "Russian", 1828 ),
                new Author( "Homer", "Greek", -800 ),
                new Author( "Charles Dickens", "English", 1812 ),
                new Author( "F. Scott Fitzgerald", "American", 1896 ),
                new Author( "Mark Twain", "American", 1835 ),
                new Author( "Jane Austen", "English", 1775 ),
                new Author( "Herman Melville", "American", 1819 ),
                new Author( "George Orwell", "English", 1903 ),
                new Author( "J.K. Rowling", "British", 1965 ),
                new Author( "Ernest Hemingway", "American", 1899 ),
                new Author( "Gabriel Garcia Marquez", "Colombian", 1927 ),
                new Author( "J.R.R. Tolkien", "British", 1892 ),
                new Author( "Fyodor Dostoevsky", "Russian", 1821 ),
                new Author( "Virginia Woolf", "English", 1882 ),
                new Author( "James Joyce", "Irish", 1882 ),
                new Author( "Franz Kafka", "Czech", 1883 ),
                new Author( "Victor Hugo", "French", 1802 ),
                new Author( "Haruki Murakami", "Japanese", 1949 ),
                new Author( "Isabel Allende", "Chilean", 1942 )
        ) );
    }

    public List<Album> getAlbums()
    {
        return albums;
    }

    public List<Author> getAuthors()
    {
        return authors;
    }
}
