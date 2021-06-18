INSERT INTO usuarios (id, username, password, enabled, nombre, apellido, email) VALUES (1, 'ggranda', '$2a$10$ctFk5Bd8BDOs6n4FzLI5w.viLgTfccFvqFaQuxEY8819TwSK9PNoe', 1, 'Giovanny', 'Granda', 'ggranda@hotmail.com')
INSERT INTO usuarios (id, username, password, enabled, nombre, apellido, email) VALUES (2, 'ncage', '$2a$10$ctFk5Bd8BDOs6n4FzLI5w.viLgTfccFvqFaQuxEY8819TwSK9PNoe', 1, 'Nicholas', 'Cage', 'ncage@hotmail.com')

INSERT INTO roles (id, nombre) VALUES (1, 'ROLE_ADMIN')
INSERT INTO roles (id, nombre) VALUES (2, 'ROLE_USER')

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1)
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 2)
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1)