select Person.FirstName, Person.LastName, Address.City, Address.State
from Person left Join Address on Person.PersonId = Address.PersonId