--
-- @lc app=leetcode id=1934 lang=mysql
--
-- [1934] Confirmation Rate
--
-- @lc code=start
select
    s.user_id,
    round(ifnull (avg(c.action = 'confirmed'), 0), 2) as confirmation_rate 
from
    Signups s
    left join Confirmations c on s.user_id = c.user_id
group by
    user_id
    -- @lc code=end