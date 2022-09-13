INSERT INTO roles VALUES (1, 'ROLE_USER'),
                         (2, 'ROLE_ADMIN');

INSERT INTO users VALUES (1, 33, 'Иван', 'Иванов', '{bcrypt}', 'user@mail.ru'),
                         (2, 66, 'Алексей', 'Петров', '{bcrypt}', 'admin@mail.ru');

INSERT INTO users_roles VALUES (1, 1),
                               (2, 1),
                               (2, 2);
