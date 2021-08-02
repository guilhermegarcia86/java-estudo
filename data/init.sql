-- Script criado para criar database do banco de dados e usuario no MySQL.

CREATE DATABASE IF NOT EXISTS agenda;

GRANT ALL PRIVILEGES ON *.* TO 'user'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;

ALTER USER 'user' IDENTIFIED WITH mysql_native_password BY 'user';
FLUSH PRIVILEGES;