DROP TABLE IF EXISTS ParrotContinents;
DROP TABLE IF EXISTS ParrotGroups;
DROP TABLE IF EXISTS Cockatoos;
DROP TABLE IF EXISTS Macaws;
DROP TABLE IF EXISTS Conures;
DROP TABLE IF EXISTS Continents;

CREATE TABLE Continents (
  continentID INT UNSIGNED NOT NULL,
  continentName VARCHAR(30) NOT NULL,
  PRIMARY KEY (continentID)
);

CREATE TABLE Conures (
  conureID INT UNSIGNED AUTO_INCREMENT,
  size VARCHAR(10) NOT NULL,
  colors VARCHAR(50) NOT NULL,
  habitat VARCHAR(255) NOT NULL,
  description TEXT,
  PRIMARY KEY (conureID)
);

CREATE TABLE Macaws (
  macawID INT UNSIGNED AUTO_INCREMENT,
  size VARCHAR(10) NOT NULL,
  colors VARCHAR(50) NOT NULL,
  habitat VARCHAR(255) NOT NULL,
  description TEXT,
  PRIMARY KEY (macawID)
);

CREATE TABLE Cockatoos (
  cockatooID INT UNSIGNED AUTO_INCREMENT,
  size VARCHAR(10) NOT NULL,
  colors VARCHAR(50) NOT NULL,
  habitat VARCHAR(255) NOT NULL,
  description TEXT,
  PRIMARY KEY (cockatooID)
);


CREATE TABLE ParrotGroups (
  parrotID INT UNSIGNED NOT NULL,
  cockatooID INT UNSIGNED,
  macawID INT UNSIGNED,
  conureID INT UNSIGNED,
  PRIMARY KEY (parrotID),
  FOREIGN KEY (cockatooID) REFERENCES Cockatoos (cockatooID) ON DELETE CASCADE,
  FOREIGN KEY (macawID) REFERENCES Macaws (macawID) ON DELETE CASCADE,
  FOREIGN KEY (conureID) REFERENCES Conures (conureID) ON DELETE CASCADE
);


CREATE TABLE ParrotContinents (
  parrotID INT UNSIGNED NOT NULL,
  continentID INT UNSIGNED NOT NULL,
  FOREIGN KEY (parrotID) REFERENCES ParrotGroups (parrotID),  
  FOREIGN KEY (continentID) REFERENCES Continents (continentID),
  UNIQUE KEY (parrotID, continentID)
);
