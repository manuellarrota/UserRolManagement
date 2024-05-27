INSERT INTO practice_user (id, name, last_name )
VALUES (1, 'Manuel', 'Larrota'),
(2, 'Due', 'jhon2@mail.com' ),
(3, 'Due', 'jhon3@mail.com' ),
(4, 'Due', 'jhon4@mail.com' ),
(5, 'Due', 'jhon5@mail.com' ),
(6, 'Due', 'jhon6@mail.com' ),
(7, 'Due', 'jhon7@mail.com' ),
(8, 'Due', 'jhon8@mail.com' ),
(9, 'Due', 'jhon9@mail.com' ),
(10, 'Due', 'jhon10@mail.com'),
(11, 'Due', 'jhon11@mail.com'),
(12, 'Due', 'jhon12@mail.com');

INSERT INTO practice_role (id, name) VALUES (1,'ROLE_USER'), (2,'ROLE_MODERATOR'),(3,'ROLE_ADMIN');

INSERT INTO practice_user_role (id_role, id_user) VALUES (1,1), (2,1);