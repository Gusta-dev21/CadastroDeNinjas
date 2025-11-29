-- Migrations to add the column rank in table tb_ninjas
--altera a tabela e adiciona coluna e o tipo

ALTER TABLE tb_ninjas
ADD COLUMN rankNinja VARCHAR(255);