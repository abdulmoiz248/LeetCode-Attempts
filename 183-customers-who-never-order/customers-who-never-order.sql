/* Write your T-SQL query statement below */
select c.name as Customers from Customers c full outer join
Orders o on c.id=o.customerId where 
o.customerId 
is  null or c.id is  null