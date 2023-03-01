--cinema.sql
DROP TABLE castings;  
DROP TABLE movies; 
DROP TABLE directors;
DROP TABLE actors;


CREATE TABLE actors(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE directors (
    id SERIAL PRIMARY KEY,
    name VARCHAR(225),
    email VARCHAR(225)
);


CREATE TABLE movies (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    duration INT,
    rating VARCHAR(225),
    director_id INT REFERENCES directors(id) -- INT REFERENCES is a foreign key
);


-- Creating join table (many to many)
CREATE TABLE castings (
    id SERIAL PRIMARY KEY,
    movie_id INT REFERENCES movies(id),
    actor_id INT REFERENCES actors(id),
    character_name VARCHAR(255)
);

-- ADDING DIRECTORS:
INSERT INTO directors (name, email) VALUES ('Caitlin', 'email@email.com');
INSERT INTO directors (name, email) VALUES ('Ed', 'ed@ed.uk');
INSERT INTO directors (name, email) VALUES ('Richard', 'richard@richard.ie');

-- ADDING ACTORS
INSERT INTO actors (name) VALUES ('Georgia');
INSERT INTO actors (name) VALUES ('Saad');
INSERT INTO actors (name) VALUES ('Fatimah');
INSERT INTO actors (name) VALUES ('Berna');


-- ADDING MOVIES TO MOVIES TABLE

INSERT INTO movies (title, duration, rating, director_id) VALUES ('Alien', 117, '18',1);        
 -- no need to id since it is handled by the app

INSERT INTO movies (title, duration, rating, director_id) VALUES ('The Imitation Game', 114, '12A',1);
INSERT INTO movies (title, duration, rating, director_id) VALUES ('Iron Man', 126, '12A',2);
INSERT INTO movies (title, duration, rating, director_id) VALUES ('The Martian', 144, '12A',1);

INSERT INTO MOVIES (title, rating, director_id) VALUES ('Braveheart', 'PG',3); -- not including the duration, will show empty on table but store null

-- UPDATING NULL VALUE IN DURATION AND RATING OF BRAVEHEART MOVIE
UPDATE movies SET (duration, rating) = (178, '15') WHERE id=5;

INSERT INTO movies (title, duration, rating, director_id) VALUES ('Guardians of the Galaxy', 121, '12A',1);
INSERT INTO movies (title, duration, rating, director_id) VALUES ('You Only Live Twice', 117, 'PG',3);
INSERT INTO movies (title, duration, rating, director_id) VALUES ('I Know What You Did Last Summer', 101, '18',3);

INSERT INTO castings (movie_id, actor_id, character_name) VALUES (1,1,'Lucy');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (2,3,'Meh');
INSERT INTO castings (movie_id, actor_id, character_name) VALUES (3,1,'Anything');




SELECT * FROM movies;

-- DELETE
-- DELETE FROM movies where id=2

-- RETURNS NUMBER OF ROWS
-- SELECT COUNT(*) FROM movies;

-- -- RETURNS NUMBER OF ROWS THAT HAVE 12A RATING
-- SELECT COUNT(*) FROM movies WHERE rating = '12A';

-- RETURNS NUMBER OF RATINGS AS WELL AS THE RATINGS
-- SELECT DISTINCT rating FROM movies;

-- SELECT COUNT(DISTINCT rating) FROM movies;

-- SELECT DISTINCT rating FROM movies;
-- SELECT rating FROM movies GROUP BY rating;

-- -- RETURNS THE THE SHORTEST DURATION
-- SELECT MIN(duration) FROM movies;

-- -- RETURNS THE THE SHORTEST DURATION OF MOVIES WITH 12A RATNG
-- SELECT MIN(duration) FROM movies WHERE rating = '12A';

-- -- returns a column of all ratings, and another column stating how many movies have that rating.
-- SELECT rating, COUNT(*) FROM movies GROUP BY rating;

-- -- Expecting two columns, rating and average duration of each
-- SELECT rating, AVG(duration) FROM movies GROUP BY rating;













-- SELECT * FROM movies ORDER BY duration ASC; -- (Ascending order)

-- SELECT * FROM movies WHERE rating = '12A' ORDER BY duration DESC; -- (Decending order BY DURATION  all 12A rated movies)







-- -- SELECT * FROM movies;  -- * select all information from movies table

-- -- SELECT * FROM movies WHERE title LIKE 'Alien';

-- SELECT * FROM movies WHERE title LIKE 'You%';  -- % tells program we want to find everything that has a 'You' and something after.

-- SELECT * FROM movies WHERE title LIKE '%You%';









-- RETURNING ALL INFO ABOUT A MOVIE
-- SELECT * FROM movies WHERE title = 'Alien';
-- -- ACCESSING MOVIE TITLES FROM TABLE
-- SELECT(title) FROM MOVIES;

-- -- ACCESSING MOVIE TITLES AND DURATION FROM TABLE
-- SELECT title, duration FROM movies;

-- SELECT title, duration FROM movies;

-- -- DELETING ROWS
-- DELETE FROM movies where id = 3;

-- SELECT * FROM movies;