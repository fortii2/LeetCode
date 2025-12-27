--
-- @lc app=leetcode id=595 lang=mysql
--
-- [595] Big Countries
--

-- @lc code=start
select `name`, population, area
from World
where area >= 3000000
    or population >= 25000000

-- @lc code=end

