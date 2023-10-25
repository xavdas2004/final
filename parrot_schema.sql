DROP TABLE IF EXISTS ParrotContinent;
DROP TABLE IF EXISTS ParrotGroup;
DROP TABLE IF EXISTS Cockatoo;
DROP TABLE IF EXISTS Macaw;
DROP TABLE IF EXISTS Conure;
DROP TABLE IF EXISTS Continent;

CREATE TABLE Continent (
  continentID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  continentName VARCHAR(30) NOT NULL
);

CREATE TABLE Conure (
  conureID INT UNSIGNED AUTO_INCREMENT,
  size VARCHAR(10) NOT NULL,
  colors VARCHAR(50) NOT NULL,
  habitat VARCHAR(255) NOT NULL,
  description TEXT,
  PRIMARY KEY (conureID)
);

CREATE TABLE Macaw (
  macawID INT UNSIGNED AUTO_INCREMENT,
  size VARCHAR(10) NOT NULL,
  colors VARCHAR(50) NOT NULL,
  habitat VARCHAR(255) NOT NULL,
  description TEXT,
  PRIMARY KEY (macawID)
);

CREATE TABLE Cockatoo (
  cockatooID INT UNSIGNED AUTO_INCREMENT,
  size VARCHAR(10) NOT NULL,
  colors VARCHAR(50) NOT NULL,
  habitat VARCHAR(255) NOT NULL,
  description TEXT,
  PRIMARY KEY (cockatooID)
);


CREATE TABLE ParrotGroup (
  parrotID INT UNSIGNED NOT NULL,
  cockatooID INT UNSIGNED,
  macawID INT UNSIGNED,
  conureID INT UNSIGNED,
  PRIMARY KEY (parrotID),
  FOREIGN KEY (cockatooID) REFERENCES Cockatoo (cockatooID) ON DELETE CASCADE,
  FOREIGN KEY (macawID) REFERENCES Macaw (macawID) ON DELETE CASCADE,
  FOREIGN KEY (conureID) REFERENCES Conure (conureID) ON DELETE CASCADE
);


CREATE TABLE ParrotContinent (
  parrotID INT UNSIGNED NOT NULL,
  continentID INT UNSIGNED NOT NULL,
  FOREIGN KEY (parrotID) REFERENCES ParrotGroup (parrotID) ON DELETE CASCADE,  
  FOREIGN KEY (continentID) REFERENCES Continent (continentID) ON DELETE CASCADE,
  UNIQUE KEY (parrotID, continentID)
);

