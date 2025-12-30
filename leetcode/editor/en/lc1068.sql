--
-- @lc app=leetcode id=1068 lang=mysql
--
-- [1068] Product Sales Analysis I
--

-- @lc code=start
select product_name, `year`, price
from Sales s
join Product p
on s.product_id = p.product_id

-- @lc code=end

