CREATE TABLE IF NOT EXISTS estudiantes_examenes(
codigo_estudiante Integer,
examen_id SERIAL,
PRIMARY KEY (codigo_estudiante, examen_id),
CONSTRAINT fk_estudiate
FOREIGN KEY (codigo_estudiante)
REFERENCES estudiantes (codigo_estudiante)
ON DELETE CASCADE,
CONSTRAINT fk_examen
FOREIGN KEY (examen_id)
REFERENCES examenes (id)
ON DELETE CASCADE
)