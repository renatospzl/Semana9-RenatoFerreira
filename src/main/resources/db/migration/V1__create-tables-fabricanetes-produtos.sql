    CREATE TABLE fabricantes (
    id INT NOT NULL AUTO_INCREMENT COMMENT 'Primary key',
    nome VARCHAR(255) UNIQUE,
    PRIMARY KEY (id));

    CREATE TABLE produtos (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    preco FLOAT,
    descricao VARCHAR(100),
    fabricante_id INT,
    FOREIGN KEY (fabricante_id) REFERENCES fabricantes (id));