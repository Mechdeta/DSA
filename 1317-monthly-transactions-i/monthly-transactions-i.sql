select date_format(trans_date,'%Y-%m') as month,country,Count(*) as trans_count,
sum(amount) as trans_total_amount,count( case when state="approved" then 1 end)  approved_count, sum(
    case
    when state="approved"
    then amount 
    else 0
    end
) as approved_total_amount
from transactions 
group by year(trans_date),month(trans_date),country
order by month