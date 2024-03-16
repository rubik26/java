CREATE TABLE myUsers
(
    id    INTEGER PRIMARY KEY UNIQUE,
    name  VARCHAR(20) NOT NULL,
    age   INTEGER     NOT NULL,
    CHECK ( age >= 18 ),
    email VARCHAR(40)
);
INSERT INTO myUsers(ID, NAME, AGE, EMAIL)
VALUES (1, 'Rubo', 20, 'rubo2004@gmail.com'),
       (2, 'Joe', 36, 'joemeir1988@gmaol.com'),
       (3, 'Anna', 23, 'annabekker2001@gmail.com'),
       (4, 'Artem', 18, 'artemakhmatchin2006'),
       (5, 'Ivan', 18, 'ivanryabukhin2006');