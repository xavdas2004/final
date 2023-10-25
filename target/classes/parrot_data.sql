-- Continents
INSERT INTO Continents (continentID, continentName) VALUES
(1, 'South America'),
(2, 'Australia');

-- Cockatoos
INSERT INTO Cockatoos (cockatooID, size, colors, habitat, description) VALUES
(1,'medium', 'white, gray, pink, yellow, black', 'forests, plains, mangrove groves', 'Cockatoos are a group of medium-sized parrots known for their intelligence and head crests, and are native to the forests and plains of Australia.');
SELECT * FROM Cockatoos;

-- Macaws
INSERT INTO Macaws (macawID, size, colors, habitat, description) VALUES
(2,'large', 'red, yellow, blue, green, orange', 'forests, tropical rainforests, woodlands', 'Macaws are a group of large parrots famous for their dazzling colors and loud vocalizations, and are native to the tropical rainforests of South America.');
SELECT * FROM Macaws;

-- Conures
INSERT INTO Conures (conureID,size, colors, habitat, description) VALUES
(3,'small', 'red, yellow, green, orange', 'tropical rainforests, moist lowland forests, dry savannas', 'Conures are a group of small parrots with moderate-sized beaks and long tails, and are native to the forests of South America.');
SELECT * FROM Conures;

-- ParrotGroups
INSERT INTO ParrotGroups (parrotID,cockatooID, macawID, conureID) VALUES
(1,1,2,3),(2,1,2,3),
(3,1,2,3);

-- ParrotContinents
INSERT INTO ParrotContinents (parrotID, continentID) VALUES
(1,1),
(2,2),
(3,2);
