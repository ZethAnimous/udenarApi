CREATE TABLE IF NOT EXISTS icfes (
id SERIAL PRIMARY KEY,
lectura SMALLINT,
matematicas SMALLINT,
sociales SMALLINT,
naturales SMALLINT,
ingles SMALLINT,
estudiante INTEGER UNIQUE,
CONSTRAINT fk_estudiante
     FOREIGN KEY (estudiante)
     REFERENCES Estudiantes (codigo_estudiante)
     ON DELETE CASCADE
);
