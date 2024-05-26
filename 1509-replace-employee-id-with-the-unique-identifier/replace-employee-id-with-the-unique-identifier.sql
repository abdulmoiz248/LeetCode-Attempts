/* Write your T-SQL query statement below */
select u.unique_id  ,e.name from  Employees e 
full outer join
EmployeeUNI u 
on u.id=e.id where e.id is not null 