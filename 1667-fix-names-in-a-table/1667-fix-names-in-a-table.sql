# Write your MySQL query statement below
SELECT user_id, concat(UPPER(SUBSTRING(name,1,1)), LOWER(SUBSTRING(name,2))) as name from Users order by 1;