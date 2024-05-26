/* Write your T-SQL query statement below */
select w.id as Id from weather w join
weather w1  on w.recordDate=dateadd(day,1,w1.recordDate)
where w.temperature>w1.temperature