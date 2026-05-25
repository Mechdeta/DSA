(
select u.name as results
from users u join movierating m on u.user_id=m.user_id
group by u.user_id,u.name
order by count(rating) desc,u.name
limit 1
)
union all
(
select m.title
from movies m join movierating mo on m.movie_id=mo.movie_id

where created_at like '2020-02%'

group by m.movie_id
-- having avg(rating)>max(avg(rating))
order by avg(rating) desc,m.title
limit 1
)