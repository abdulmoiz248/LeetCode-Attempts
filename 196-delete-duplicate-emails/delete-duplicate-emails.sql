/* Write your T-SQL query statement below */
delete p1 from person p inner join person p1 on p.email=p1.email
where p.id<p1.id