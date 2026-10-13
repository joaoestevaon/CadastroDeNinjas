-- V2: Migrations para adicionar a coluna de RANK na tabela de cadastros

ALTER TABLE tb_cdadastro
ADD COLUMN rank VARCHAR(255);