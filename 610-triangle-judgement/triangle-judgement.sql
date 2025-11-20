-- Write your PostgreSQL query statement below
select x,y,z,
case
    when(x+z>y and x+y>z and y+z>x)
        then 'Yes'
        else 'No'
    end as triangle
from triangle;