select e.name as "Employee"
from 
Employee as e,
Employee as m

where e.managerId=m.Id
and e.salary> m.salary