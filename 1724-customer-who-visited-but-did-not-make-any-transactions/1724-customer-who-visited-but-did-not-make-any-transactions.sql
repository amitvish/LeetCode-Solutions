# Write your MySQL query statement below
# first try to get only the customer id whp didn't have transaction

select v.customer_id, count(customer_id) as count_no_trans
from Visits v
left join Transactions t
on v.visit_id = t.visit_id
where t.transaction_id is null
group by v.customer_id;




-- select customer_id, count(customer_id) as count_no_trans
-- from Visits v
-- join Transactions t
-- on v.visit_id = t.visit_id

