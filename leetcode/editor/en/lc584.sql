--
-- @lc app=leetcode id=584 lang=mysql
--
-- [584] Find Customer Referee
--
-- @lc code=start
select
    `name`
from
    Customer
where
    referee_id != 2
    or referee_id is null
    -- @lc code=end