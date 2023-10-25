-- Continent
INSERT INTO Continent (continentID, continentName) VALUES
(1, 'South America'),
(2, 'Australia');

-- Cockatoo
INSERT INTO Cockatoo (cockatooID, size, colors, habitat, description) VALUES
(1,'medium', 'white, gray, pink, yellow, black', 'forests, plains, mangrove groves', 'Cockatoos are a group of medium-sized parrots known for their intelligence and head crests, and are native to the forests and plains of Australia.');
SELECT * FROM Cockatoo;

-- Macaw
INSERT INTO Macaw (macawID, size, colors, habitat, description) VALUES
(2,'large', 'red, yellow, blue, green, orange', 'forests, tropical rainforests, woodlands', 'Macaws are a group of large parrots famous for their dazzling colors and loud vocalizations, and are native to the tropical rainforests of South America.');
SELECT * FROM Macaw;

-- Conure
INSERT INTO Conure (conureID,size, colors, habitat, description) VALUES
(3,'small', 'red, yellow, green, orange', 'tropical rainforests, moist lowland forests, dry savannas', 'Conures are a group of small parrots with moderate-sized beaks and long tails, and are native to the forests of South America.');
SELECT * FROM Conure;

-- ParrotGroup
INSERT INTO ParrotGroup (parrotID,cockatooID, macawID, conureID) VALUES
(1,1,2,3),(2,1,2,3),
(3,1,2,3);

-- ParrotContinent
INSERT INTO ParrotContinent (parrotID, continentID) VALUES
(1,1),
(2,2),
(3,2);
