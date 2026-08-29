# Write your MySQL query statement below
select email
from Person as p 
group by email
having count(email) > 1;
