CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
        declare offse int;
        set offse=N-1;
  RETURN (
      # Write your MySQL query statement below.
        select distinct salary
        from employee
        order by salary desc
        limit 1 OFFSET offse
  );
END